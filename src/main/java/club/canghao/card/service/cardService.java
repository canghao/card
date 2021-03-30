package club.canghao.card.service;

import java.util.Map;

import club.canghao.card.model.*;
public interface cardService {
	
	public Map<String ,Object> addCardMoney(card_record card_record);
	
	public Map<String ,Object> minusCardMoney(card_record card_record);
	
	public Map<String ,Object> addCard_pick(card_pick card_pick);
	
	public Map<String ,Object> getCard_pick(String stuNumber);
	
	public Map<String ,Object> lossCard(String cardId,String cardPwd);
	
	public Map<String ,Object> findCard(String cardId,String cardPwd);
	
	public Map<String ,Object> getCardRecord(String stuNumber,int start,int size,String starttime,String endtime);
	
	public Map<String, Object> getCardRecordByMonth(String stuNumber, int start, int size, String starttime, String endtime);
}
