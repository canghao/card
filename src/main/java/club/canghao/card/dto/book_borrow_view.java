package club.canghao.card.dto;

import java.util.List;

import club.canghao.card.model.book;
import club.canghao.card.model.book_borrow;
import club.canghao.card.model.book_review;

public class book_borrow_view extends book_borrow{
	private book book;
	private List<book_review> reviews;
	private List<book_borrow> borrows;
	//setter and getter
	public book getBook() {
		return book;
	}
	public void setBook(book book) {
		this.book = book;
	}
	public List<book_review> getReviews() {
		return reviews;
	}
	public void setReviews(List<book_review> reviews) {
		this.reviews = reviews;
	}
	public List<book_borrow> getBorrows() {
		return borrows;
	}
	public void setBorrows(List<book_borrow> borrows) {
		this.borrows = borrows;
	}
	@Override
	public String toString() {
		return "book_borrow_view [book=" + book + ", reviews=" + reviews + ", borrows=" + borrows + "]";
	}
}
