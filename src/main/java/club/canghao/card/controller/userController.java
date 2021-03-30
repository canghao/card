package club.canghao.card.controller;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import club.canghao.card.dto.user;
import club.canghao.card.service.userService;

@ResponseBody
@Controller
@RequestMapping("/user")
public class userController {
	@Resource(name="userService")
	private userService userService;
	
	//根据微信用户openId返回用户信息
	@RequestMapping("/getUserByOpenId")
	public Map<String,Object> getUserByOpenId(String code){
		Map<String, Object> map=new HashMap<String, Object>();
		//先获取用户openId,后查询
		String openId=userService.getWxuserOpenId(code);
		System.out.println(openId);
		user user = userService.getUserByOpenId(openId);
		System.out.println(user);
		if(user==null) map.put("result","fail");
		else {
			map.put("user", user);
			map.put("result","success");
		}
		return map;
	}
	@RequestMapping("/addUser")
	public Map<String,Object> addUser(HttpServletRequest request,String encryptedData, String iv, String code){
		Map<String, Object> map=new HashMap<String, Object>();
		user user=JSONArray.parseObject(request.getParameter("user"), user.class);
		user = userService.getWxuserInfo(encryptedData,iv,code,user);
		map=userService.addUser(user);
		return map;
	}
	
	@RequestMapping("/deleteUser")
	public Map<String,Object> deleteUser(HttpServletRequest request){
		user user=JSONArray.parseObject(request.getParameter("user"), user.class);
		Map<String, Object> deleteUser = userService.deleteUser(user);
		return deleteUser;
	}
}
