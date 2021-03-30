package club.canghao.card.model;

public class card_pick{
	private int id;
	private String pickerName;
	private String pickerPhone;
	private String pickTime;
	private String cardId;
	private String stuName;
	private String pickDesc;
	//setter and getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPickerName() {
		return pickerName;
	}
	public void setPickerName(String pickerName) {
		this.pickerName = pickerName;
	}
	public String getPickerPhone() {
		return pickerPhone;
	}
	public void setPickerPhone(String pickerPhone) {
		this.pickerPhone = pickerPhone;
	}
	public String getPickTime() {
		return pickTime;
	}
	public void setPickTime(String pickTime) {
		this.pickTime = pickTime;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getPickDesc() {
		return pickDesc;
	}
	public void setPickDesc(String pickDesc) {
		this.pickDesc = pickDesc;
	}
	@Override
	public String toString() {
		return "card_pick [id=" + id + ", pickerName=" + pickerName + ", pickerPhone=" + pickerPhone + ", pickTime="
				+ pickTime + ", cardId=" + cardId + ", stuName=" + stuName + ", pickDesc=" + pickDesc + "]";
	}
}
