package club.canghao.card.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import club.canghao.card.dao.hotDao;
import club.canghao.card.dto.hot_view;
import club.canghao.card.model.hot;
import club.canghao.card.model.hot_like;
import club.canghao.card.model.hot_review;
import club.canghao.card.service.hotService;


@ResponseBody
@Controller
@RequestMapping("/hot")
public class hotController {
	@Resource(name="hotService")
	private hotService hotService;
	@ResponseBody
	@RequestMapping("/addHot")
	public Map<String,Object> addHot(hot hot,HttpServletRequest request){
		System.out.println(hot);
		System.out.println(request.getParameter("hot"));
		hot = JSONArray.parseObject(request.getParameter("hot"), hot.class);
		System.out.println(hot);
		Map<String, Object> map = hotService.addHot(hot);
		return map;
	}
	@ResponseBody
	@RequestMapping("/getAllHots")
	public List<hot_view> getAllHots(HttpServletRequest request){
		int page = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int start=(page-1)*pageSize;
		int size=pageSize;
		System.out.println(page);
		System.out.println(size);
		String stuNumber=request.getParameter("stuNumber");
		System.out.println(stuNumber);
		List<hot_view> allHot = hotService.getAllHots(start,size,stuNumber);
		return allHot;
	}
	
	@ResponseBody
	@RequestMapping("/addHot_like")
	public Map<String,Object> addHot_like(HttpServletRequest request){
		hot_like hot_like = JSONArray.parseObject(request.getParameter("hot_like"), hot_like.class);
		Map<String ,Object> map=hotService.addHot_like(hot_like);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/deleteHot_like")
	public Map<String,Object> deleteHot_like(HttpServletRequest request){
		hot_like hot_like = JSONArray.parseObject(request.getParameter("hot_like"), hot_like.class);
		Map<String ,Object> map=hotService.deleteHot_like(hot_like);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/addHot_review")
	public Map<String,Object> addHot_review(HttpServletRequest request){
		hot_review hot_review = JSONArray.parseObject(request.getParameter("hot_review"), hot_review.class);
		System.out.println(hot_review);
		Map<String ,Object> map=hotService.addHot_review(hot_review);
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/deleteHot_review")
	public Map<String,Object> deleteHot_review(int id){
		Map<String ,Object> map=hotService.deleteHot_review(id);
		return map;
	}
}
