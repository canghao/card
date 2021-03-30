package club.canghao.card.model;

public class wxuser {
	//微信用户信息
	private String openId;
	private String nickName;
	private String avatarUrl;
	private int gender;
	private String country;
	private String province;
	private String city;
	//setter and getter
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
	@Override
	public String toString() {
		return "wxuser [openId=" + openId + ", nickName=" + nickName + ", avatarUrl=" + avatarUrl + ", gender=" + gender
				+ ", country=" + country + ", province=" + province + ", city=" + city + "]";
	}
}
