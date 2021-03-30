package club.canghao.card.dto;

import java.util.List;

import club.canghao.card.model.book_borrow;
import club.canghao.card.model.book_review;

public class book_view {
	//Õº È–≈œ¢
	private String bookId;
	private String bookName;
	private String bookAuthor;
	private String bookPublicTime;
	private String bookPublisher;
	private String bookCategory;
	private String bookIntro;
	private String bookImgUrl;
	private int bookNumber;
	private List<book_borrow> borrows;
	private List<book_review> reviews;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPublicTime() {
		return bookPublicTime;
	}
	public void setBookPublicTime(String bookPublicTime) {
		this.bookPublicTime = bookPublicTime;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getBookCategory() {
		return bookCategory;
	}
	public void setBookCategory(String bookCategory) {
		this.bookCategory = bookCategory;
	}
	public String getBookIntro() {
		return bookIntro;
	}
	public void setBookIntro(String bookIntro) {
		this.bookIntro = bookIntro;
	}
	public String getBookImgUrl() {
		return bookImgUrl;
	}
	public void setBookImgUrl(String bookImgUrl) {
		this.bookImgUrl = bookImgUrl;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public List<book_borrow> getBorrows() {
		return borrows;
	}
	public void setBorrows(List<book_borrow> borrows) {
		this.borrows = borrows;
	}
	public List<book_review> getReviews() {
		return reviews;
	}
	public void setReviews(List<book_review> reviews) {
		this.reviews = reviews;
	}
	@Override
	public String toString() {
		return "book_view [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPublicTime=" + bookPublicTime + ", bookPublisher=" + bookPublisher + ", bookCategory="
				+ bookCategory + ", bookIntro=" + bookIntro + ", bookImgUrl=" + bookImgUrl + ", bookNumber="
				+ bookNumber + ", borrows=" + borrows + ", reviews=" + reviews + "]";
	}
}
