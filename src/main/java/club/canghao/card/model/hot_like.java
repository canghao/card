package club.canghao.card.model;

public class hot_like {
	private int hotId;
	private String stuNumber;
	private String avatarUrl;
	private String nickName;
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
	@Override
	public String toString() {
		return "hot_like [hotId=" + hotId + ", stuNumber=" + stuNumber + ", avatarUrl=" + avatarUrl + ", nickName="
				+ nickName + "]";
	}
}
