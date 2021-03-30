package club.canghao.card.service.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import club.canghao.card.dao.cardDao;
import club.canghao.card.dao.userDao;
import club.canghao.card.dto.user;
import club.canghao.card.model.student;
import club.canghao.card.service.userService;
import club.canghao.card.utils.AesCbcUtil;
import club.canghao.card.utils.HttpRequest;
import net.sf.json.JSONObject;
@Service("userService")
public class userServiceImpl implements userService {
	@Autowired
	private userDao userDao;
	@Autowired
	private cardDao cardDao;
	
	String appid="wx5c4184ec3a3375de";
	String secret="3e8c9cd57707e8372e419d2b177188f9";
	@Override
	public user getUserByOpenId(String openId) {
		user user = userDao.getUserByOpenId(openId);
		return user;
	}
	@Override
	public user getUserByStuNumber(String stuNumber) {
		user user = userDao.getUserByStuNumber(stuNumber);
		return user;
	}
	@Override
	public Map<String,Object> addUser(user user) {
		Map<String,Object> map=new HashMap<>();
		System.out.println(user.getStuNumber());
		student stu=userDao.getStudentByStuNumber(user.getStuNumber());
		System.out.println(stu==null);
		if(stu==null) {
			map.put("result","fail");
			map.put("msg","不存在该学生！");
			return map;
		}else if(!user.getCardPwd().equals(cardDao.getCardByCardId(user.getStuNumber()).getCardPwd())) {
			map.put("result","fail");
			map.put("msg","密码错误！");
			return map;
		}else if(userDao.getwxUserByStuNumber(user)!=null) {
			map.put("result","fail");
			map.put("msg","该学号已经绑定微信账号！");
			return map;
		}
		if(userDao.getWxuserByOpenId(user.getOpenId())==null&&userDao.addWxuser(user)==1&&userDao.addUser(user)==1) {
			map.put("result","success");
			user user2=userDao.getUserByOpenId(user.getOpenId());
			map.put("user",user2);
			return map;
		}
		if(userDao.addUser(user)==1) {
			map.put("result","success");
			user user2=userDao.getUserByOpenId(user.getOpenId());
			map.put("user",user2);
			return map;
		}else map.put("result","fail");
		return map;
	}
	@Override
	public Map<String, Object> updateUser(user user){
		Map<String,Object> map=new HashMap<>();
		if(userDao.updateWxuser(user)==1&&userDao.updateStudent(user)==1)
			 map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	
	@Override
	public Map<String, Object> deleteUser(user user) {
		Map<String,Object> map=new HashMap<>();
		if(userDao.deleteUser(user)==1) 
			map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	@Override
	public String getWxuserOpenId(String code) {
		String param = "appid=" + appid + "&secret=" + secret
				+ "&js_code=" + code + "&grant_type=authorization_code";
		String result=null;
		JSONObject json = null;
		try {
	      result=HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session",param);
	      json = JSONObject.fromObject(result);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		System.out.println(json);
	    return json.getString("openid");
	}
	@Override
	public user getWxuserInfo(String encryptedData, String iv, String code,user user) {
        String params = "appid=" + appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=authorization_code";
        String sr = HttpRequest.sendGet("https://api.weixin.qq.com/sns/jscode2session", params);
        JSONObject json = JSONObject.fromObject(sr);
        String session_key = json.get("session_key").toString();
        try {
            String result = AesCbcUtil.decrypt(encryptedData, session_key, iv, "UTF-8");
            if (null != result && result.length() > 0) {
                JSONObject userInfoJSON = JSONObject.fromObject(result);
                user.setNickName(userInfoJSON.getString("nickName"));
                user.setAvatarUrl(userInfoJSON.getString("avatarUrl"));
                user.setOpenId(userInfoJSON.getString("openId"));
                user.setGender(userInfoJSON.getInt("gender"));
                user.setCity(userInfoJSON.getString("city"));
                user.setCountry(userInfoJSON.getString("country"));
                user.setProvince(userInfoJSON.getString("province"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return user;
	}

}
