package club.canghao.card.model;

public class book_review {
	//图书评论信息
	private int id;
	private String bookId;
	private String stuNumber;
	private String nickName;
	private String avatarUrl;
	private String reviewContent;
	private String reviewTime;
	//setter and getter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
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
	public String getReviewContent() {
		return reviewContent;
	}
	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}
	public String getReviewTime() {
		return reviewTime;
	}
	public void setReviewTime(String reviewTime) {
		this.reviewTime = reviewTime;
	}
	@Override
	public String toString() {
		return "book_review [id=" + id + ", bookId=" + bookId + ", stuNumber=" + stuNumber + ", nickName=" + nickName
				+ ", avatarUrl=" + avatarUrl + ", reviewContent=" + reviewContent + ", reviewTime=" + reviewTime + "]";
	}
	
}
