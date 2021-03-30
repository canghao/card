package club.canghao.card.model;

import java.math.BigDecimal;

public class card_record {
	private int id;
	private String cardId;
	private String time;
	private BigDecimal money;
	private boolean type;
	private String content;
	//setter and getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public BigDecimal getMoney() {
		return money;
	}
	public void setMoney(BigDecimal money) {
		this.money = money;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "card_record [id=" + id + ", cardId=" + cardId + ", time=" + time + ", money=" + money + ", type=" + type
				+ ", content=" + content + "]";
	}
}
