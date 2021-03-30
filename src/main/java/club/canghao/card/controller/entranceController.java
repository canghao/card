package club.canghao.card.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import club.canghao.card.model.entrance;
import club.canghao.card.service.entranceService;

@ResponseBody
@Controller
@RequestMapping("/entrance")
public class entranceController {
	@Resource(name="entranceService")
	private entranceService entranceService;
	@RequestMapping("/getAllEntrances")
	public List<entrance> getAllEntrances(HttpServletRequest request){
		int page = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		int start=(page-1)*pageSize;
		System.out.println(page);
		System.out.println(pageSize);
		String stuNumber= request.getParameter("stuNumber");
		System.out.println(stuNumber);
		List<entrance> allEntrancesByStuNumber = entranceService.getAllEntrancesByStuNumber(stuNumber,start,pageSize);
		return allEntrancesByStuNumber;
	}

}







