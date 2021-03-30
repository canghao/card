package club.canghao.card.dto;


public class user {
	//学生基本信息
	private String stuNumber;
	private String stuName;
	private String stuPhone;
	private String stuSchool;
	//微信用户信息
	private String openId;
	private String nickName;
	private String avatarUrl;
	private int gender;
	private String country;
	private String province;
	private String city;
	//学生卡的信息
	private boolean cardState;
	private double cardRemaining;
	private String cardPwd;	
	//setter and getter
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public String getStuSchool() {
		return stuSchool;
	}
	public void setStuSchool(String stuSchool) {
		this.stuSchool = stuSchool;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isCardState() {
		return cardState;
	}
	public void setCardState(boolean cardState) {
		this.cardState = cardState;
	}
	public double getCardRemaining() {
		return cardRemaining;
	}
	public void setCardRemaining(double cardRemaining) {
		this.cardRemaining = cardRemaining;
	}
	public String getCardPwd() {
		return cardPwd;
	}
	public void setCardPwd(String cardPwd) {
		this.cardPwd = cardPwd;
	}
	@Override
	public String toString() {
		return "user [stuNumber=" + stuNumber + ", stuName=" + stuName + ", stuPhone=" + stuPhone + ", stuSchool="
				+ stuSchool + ", openId=" + openId + ", nickName=" + nickName + ", avatarUrl=" + avatarUrl + ", gender="
				+ gender + ", country=" + country + ", province=" + province + ", city=" + city + ", cardState="
				+ cardState + ", cardRemaining=" + cardRemaining + ", cardPwd=" + cardPwd + "]";
	}
}
