package club.canghao.card.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.canghao.card.dao.hotDao;
import club.canghao.card.dto.hot_view;
import club.canghao.card.model.hot;
import club.canghao.card.model.hot_like;
import club.canghao.card.model.hot_review;
import club.canghao.card.service.hotService;

@Service("hotService")
public class hotServiceImpl implements hotService {
	@Autowired
	private hotDao hotDao;
	@Override
	public Map<String, Object> addHot(hot hot) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int addHot = hotDao.addHot(hot);
		int addHot_img=0;
		if(hot.getHot_img().getImgUrl().size()!=0) {
			addHot_img = hotDao.addHot_img(hot);
		}
		if(addHot==1&&addHot_img>=0&&hot.getHot_img().getImgUrl().size()!=0||addHot==1&&addHot_img==0&&hot.getHot_img().getImgUrl().size()==0) {
			map.put("result","success");
			map.put("msg","发布成功");
			return map;
		}else{
			map.put("result","fail");
			map.put("msg","发布失败");
			return map;
		}
	}
	@Override
	public List<hot_view> getAllHots(int start,int size,String stuNumber) {
		List<hot_view> allHot = hotDao.getAllHots(start,size,stuNumber);
		return allHot;
	}
	@Override
	public Map<String,Object> addHot_like(hot_like hot_like) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int addHot_like = hotDao.addHot_like(hot_like);
		if(addHot_like==1) map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	@Override
	public Map<String,Object> deleteHot_like(hot_like hot_like) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int deleteHot_like = hotDao.deleteHot_like(hot_like);
		if(deleteHot_like==1) map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	@Override
	public Map<String, Object> addHot_review(hot_review hot_review) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int addHot_review = hotDao.addHot_review(hot_review);
		if(addHot_review==1) map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	@Override
	public Map<String, Object> deleteHot_review(int id) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int deleteHot_review = hotDao.deleteHot_review(id);
		if(deleteHot_review==1) map.put("result","success");
		else map.put("result","fail");
		return map;
	}
}
