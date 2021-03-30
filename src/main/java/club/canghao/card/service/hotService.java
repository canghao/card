package club.canghao.card.service;

import java.util.List;
import java.util.Map;
import club.canghao.card.dto.*;
import club.canghao.card.model.hot;
import club.canghao.card.model.hot_like;
import club.canghao.card.model.hot_review;
public interface hotService {
	public Map<String,Object> addHot(hot hot);
	
	public List<hot_view> getAllHots(int start,int size,String stuNumber);
	
	public Map<String,Object> addHot_like(hot_like hot_like);
	
	public Map<String,Object> deleteHot_like(hot_like hot_like);
	
	public Map<String,Object> addHot_review(hot_review hot_review);
	
	public Map<String ,Object> deleteHot_review(int id);
}
