package club.canghao.card.model;

public class book_borrow {
	//Õº ÈΩË‘ƒ–≈œ¢
	private int id;
	private String bookId;
	private String stuNumber;
	private String nickName;
	private String avatarUrl;
	private String borrowTime;
	private int borrowMonths;
	private boolean isReturn;
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
	public String getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(String borrowTime) {
		this.borrowTime = borrowTime;
	}
	public int getBorrowMonths() {
		return borrowMonths;
	}
	public void setBorrowMonths(int borrowMonths) {
		this.borrowMonths = borrowMonths;
	}
	public boolean isReturn() {
		return isReturn;
	}
	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}
	@Override
	public String toString() {
		return "book_borrow [id=" + id + ", bookId=" + bookId + ", stuNumber=" + stuNumber + ", nickName=" + nickName
				+ ", avatarUrl=" + avatarUrl + ", borrowTime=" + borrowTime + ", borrowMonths=" + borrowMonths
				+ ", isReturn=" + isReturn + "]";
	}
}
