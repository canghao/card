package club.canghao.card.model;

public class hot_review {
	//热点评论信息
	private int id;
	private int hotId;
	private String stuNumber;
	private String avatarUrl;
	private String nickName;
	private String reviewTime;
	private String reviewContent;
	//setter and getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	@Override
	public String toString() {
		return "hot_review [id=" + id + ", hotId=" + hotId + ", stuNumber=" + stuNumber + ", avatarUrl=" + avatarUrl
				+ ", nickName=" + nickName + ", reviewTime=" + reviewTime + ", reviewContent=" + reviewContent + "]";
	}
}
