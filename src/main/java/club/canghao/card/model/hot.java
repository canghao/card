package club.canghao.card.model;
public class hot {
	//热点信息
	private int hotId;
	private String stuNumber;
	private String avatarUrl;
	private String nickName;
	private String hotContent;
	private String hotTime;
	private hot_img hot_img;
	//setter and getter
	public int getHotId() {
		return hotId;
	}
	public void setHotId(int hotId) {
		this.hotId = hotId;
	}
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	public String getAvatarUrl() {
		return avatarUrl;
	}
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getHotContent() {
		return hotContent;
	}
	public void setHotContent(String hotContent) {
		this.hotContent = hotContent;
	}
	public String getHotTime() {
		return hotTime;
	}
	public void setHotTime(String hotTime) {
		this.hotTime = hotTime;
	}
	public hot_img getHot_img() {
		return hot_img;
	}
	public void setHot_img(hot_img hot_img) {
		this.hot_img = hot_img;
	}
	@Override
	public String toString() {
		return "hot [hotId=" + hotId + ", stuNumber=" + stuNumber + ", avatarUrl=" + avatarUrl + ", nickName="
				+ nickName + ", hotContent=" + hotContent + ", hotTime=" + hotTime + ", hot_img=" + hot_img + "]";
	}
}
