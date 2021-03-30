package club.canghao.card.service;

import java.util.List;
import java.util.Map;

import club.canghao.card.dto.book_view;
import club.canghao.card.model.book_borrow;
import club.canghao.card.model.book_review;

public interface bookService {
	public List<book_view> getAllBook_views(int start,int size,String key);
	
	public Map<String ,Object> addBook_review(book_review book_review);
	
	public Map<String ,Object> deleteBook_review(int id);
	
	public Map<String ,Object> addBook_borrow(book_borrow book_borrow);
	
	public Map<String ,Object> deleteBook_borrow(book_borrow book_borrow);
	
	public Map<String ,Object> getBook_borrowsBystuNumber(String stuNumber);
}
