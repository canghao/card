package club.canghao.card.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import club.canghao.card.dto.user;
import club.canghao.card.model.*;
import club.canghao.card.service.cardService;
@ResponseBody
@Controller
@RequestMapping("/card")
public class cardController{
	@Resource(name="cardService")
	private cardService cardService;
	@RequestMapping("/minusCardMoney")
	public Map<String ,Object> minusCardMoney(HttpServletRequest request){
		card_record card_record=JSONArray.parseObject(request.getParameter("card_record"), card_record.class);
		System.out.println(card_record);
		Map<String ,Object> map= cardService.minusCardMoney(card_record);
		return map;
	}
	@RequestMapping("/addCardMoney")
	public Map<String ,Object> addCardMoney(HttpServletRequest request){
		card_record card_record=JSONArray.parseObject(request.getParameter("card_record"), card_record.class);
		System.out.println(card_record);
		Map<String ,Object> map= cardService.addCardMoney(card_record);
		return map;
	}
	
	@RequestMapping("/addCardPick")
	public Map<String ,Object> addCardPick(HttpServletRequest request){
		card_pick card_pick=JSONArray.parseObject(request.getParameter("card_pick"), card_pick.class);
		System.out.println(card_pick);
		Map<String ,Object> map= cardService.addCard_pick(card_pick);
		return map;
	}
	
	@RequestMapping("/getCardPick")
	public Map<String ,Object> getCardPick(String stuNumber){
		Map<String ,Object> map= cardService.getCard_pick(stuNumber);
		return map;
	}
	
	@RequestMapping("/lossCard")
	public Map<String ,Object> lossCard(String cardId,String cardPwd){
		Map<String ,Object> map= cardService.lossCard(cardId,cardPwd);
		return map;
	}
	
	@RequestMapping("/findCard")
	public Map<String ,Object> findCard(String cardId,String cardPwd){
		Map<String ,Object> map= cardService.findCard(cardId,cardPwd);
		return map;
	}
	
	@RequestMapping("/getCardRecord")
	public Map<String ,Object> getCardRecord(String stuNumber, int page, int size, String starttime, String endtime){
		int start=(page-1)*size;
		System.out.println(stuNumber);
		System.out.println(page);
		System.out.println(size);
		System.out.println(starttime);
		System.out.println(endtime);
		Map<String, Object> cardRecord = cardService.getCardRecord(stuNumber, start, size, starttime, endtime);
		return cardRecord;
	}
	
	@RequestMapping("/getCardRecordByMonth")
	public Map<String ,Object> getCardRecordByMonth(String stuNumber, int page, int size, String starttime, String endtime){
		int start=(page-1)*size;
		System.out.println(stuNumber);
		System.out.println(page);
		System.out.println(size);
		System.out.println(starttime);
		System.out.println(endtime);
		Map<String, Object> map = cardService.getCardRecordByMonth(stuNumber, start, size, starttime, endtime);
		return map;
	}
}
