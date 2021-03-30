package club.canghao.card.model;

import java.math.BigDecimal;

public class card {
	//–£‘∞ø®–≈œ¢
	private String cardId;
	private BigDecimal cardRemaining;
	private boolean cardState;
	private String cardPwd;
	//setter and getter
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public BigDecimal getCardRemaining() {
		return cardRemaining;
	}
	public void setCardRemaining(BigDecimal cardRemaining) {
		this.cardRemaining = cardRemaining;
	}
	public boolean isCardState() {
		return cardState;
	}
	public void setCardState(boolean cardState) {
		this.cardState = cardState;
	}
	public String getCardPwd() {
		return cardPwd;
	}
	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}
	@Override
	public String toString() {
		return "card [cardId=" + cardId + ", cardRemaining=" + cardRemaining + ", cardState=" + cardState + ", cardPwd="
				+ cardPwd + "]";
	}
}
