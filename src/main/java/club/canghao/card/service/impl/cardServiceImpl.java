package club.canghao.card.service.impl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;

import org.eclipse.jdt.internal.compiler.classfmt.NonNullDefaultAwareTypeAnnotationWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.canghao.card.dao.cardDao;
import club.canghao.card.model.card_pick;
import club.canghao.card.model.card_record;
import club.canghao.card.service.cardService;
@Service("cardService")
public class cardServiceImpl implements cardService {
	@Autowired
	private cardDao cardDao;	
	@Override
	public Map<String, Object> addCardMoney(card_record card_record) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int addCardMoney = cardDao.addCardMoney(card_record);
		int addCardRecord = cardDao.addCardRecord(card_record);
		if(addCardMoney==1&&addCardRecord==1) {
			map.put("result","success");
		}else map.put("result","fail");
		return map;
	}

	@Override
	public Map<String, Object> minusCardMoney(card_record card_record) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int minusCardMoney = cardDao.minusCardMoney(card_record);
		int addCardRecord = cardDao.addCardRecord(card_record);
		if(minusCardMoney==1&&addCardRecord==1) {
			map.put("result","success");
		}else map.put("result","fail");
		return map;
	}

	@Override
	public Map<String, Object> addCard_pick(card_pick card_pick) {
		Map<String ,Object> map=new HashMap<String, Object>();
		if(cardDao.getCardByCardId(card_pick.getCardId())==null) {
			map.put("msg","卡号有误");
			map.put("result","fail");
		}else {
			int addCard_pick = cardDao.addCard_pick(card_pick);
			if(addCard_pick==1) {
				map.put("msg","登记成功");
				map.put("result","success");
			}
		}
		return map;
	}

	@Override
	public Map<String, Object> getCard_pick(String stuNumber) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<card_pick> card_pick = cardDao.getCard_pick(stuNumber);
		map.put("card_pick",card_pick);
		return map;
	}

	@Override
	public Map<String, Object> lossCard(String cardId,String cardPwd) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int lossCard = cardDao.lossCard(cardId, cardPwd);
		if(lossCard==1) map.put("result","success");
		else map.put("result", "fail");
		return map;
	}

	@Override
	public Map<String, Object> findCard(String cardId,String cardPwd) {
		Map<String ,Object> map=new HashMap<String, Object>();
		int findCard = cardDao.findCard(cardId, cardPwd);
		if(findCard==1) map.put("result","success");
		else map.put("result", "fail");
		return map;
	}

	@Override
	public Map<String, Object> getCardRecord(String stuNumber, int start, int size, String starttime, String endtime) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<card_record> cardrecord = cardDao.getCardRecord(stuNumber, start, size, starttime, endtime);
		map.put("result",cardrecord);
		return map;
	}
	
	public Map<String, Object> getCardRecordByMonth(String stuNumber, int start, int size, String starttime, String endtime) {
		Map<String ,Object> map=new HashMap<String, Object>();
		List<card_record> cardrecord = cardDao.getCardRecord(stuNumber, start, size, starttime, endtime);
		int parseInt = Integer.parseInt(endtime.substring(8, 10));
		int[] category=new int[parseInt];
		BigDecimal shop=new BigDecimal(0.00);
		BigDecimal wash=new BigDecimal(0.00);
		BigDecimal eat=new BigDecimal(0.00);
		BigDecimal other=new BigDecimal(0.00);
		BigDecimal sum=new BigDecimal(0.00);
		BigDecimal max=new BigDecimal(0.00);
		for (int i = 0; i <parseInt; i++) {
			category[i]=i+1;
		}
		BigDecimal num=new BigDecimal(category.length);
		BigDecimal[] data1=new BigDecimal[31];
		BigDecimal[] data2=new BigDecimal[31];
		for (int i = 0; i <31; i++) {
			data1[i]=new BigDecimal(0.00);
			data2[i]=new BigDecimal(0.00);
		}
		for (card_record card_record : cardrecord) {
			int i=Integer.parseInt(card_record.getTime().substring(8,10));
			System.out.println(i);
			BigDecimal money = card_record.getMoney();
			if(card_record.isType()) {
				data1[i]=data1[i].add(money);
			}
			if(!card_record.isType()){
				if(money.compareTo(max) == 1)  max=money;
				sum=sum.add(money);
				if(card_record.getContent().equals("购物"))
					shop=shop.add(money);
				else if(card_record.getContent().equals("洗衣"))
					wash=wash.add(money);
				else if(card_record.getContent().equals("饮食"))
					eat=eat.add(money);
				else if(card_record.getContent().equals("其他"))
					other=other.add(money);
				data2[i]=data2[i].add(money);
			}
		}
		map.put("category",category);
		map.put("data1",data1);
		map.put("data2",data2);
		map.put("shop",shop);
		map.put("wash",wash);
		map.put("eat",eat);
		map.put("other",other);
		map.put("max",max);
		map.put("sum",sum);
		return map;
	}
}
