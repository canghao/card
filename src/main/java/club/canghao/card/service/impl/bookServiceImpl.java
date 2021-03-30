package club.canghao.card.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.canghao.card.dao.bookDao;
import club.canghao.card.dto.book_borrow_view;
import club.canghao.card.dto.book_view;
import club.canghao.card.model.book_borrow;
import club.canghao.card.model.book_review;
import club.canghao.card.service.bookService;
@Service("bookService")
public class bookServiceImpl implements bookService {
	@Autowired
	private bookDao bookDao;
	@Override
	public List<book_view> getAllBook_views(int start, int size,String key) {
		List<book_view> allBook_views = bookDao.getAllBook_views(start, size,key,null);
		return allBook_views;
	}
	@Override
	public Map<String, Object> addBook_review(book_review book_review) {
		Map<String ,Object> map= new HashMap<String, Object>();
		int addBook_review = bookDao.addBook_review(book_review);
		if(addBook_review==1) map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	@Override
	public Map<String, Object> deleteBook_review(int id) {
		Map<String ,Object> map= new HashMap<String, Object>();
		int deleteBook_review = bookDao.deleteBook_review(id);
		if(deleteBook_review==1) map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	@Override
	public Map<String, Object> addBook_borrow(book_borrow book_borrow) {
		Map<String ,Object> map= new HashMap<String, Object>();
		int bookStuNumber=bookDao.getBookByBookId(book_borrow.getBookId()).getBookNumber();
		if(bookStuNumber<=0) {
			map.put("result","fail");
			map.put("msg","¿â´æ²»×ã");
			return map;
		}
		int addBook_borrow = bookDao.addBook_borrow(book_borrow);	
		int minusBookNumber = bookDao.minusBookNumber(book_borrow.getBookId());
		if(addBook_borrow==1&&minusBookNumber==1) map.put("result","success");
		else {
			map.put("result","fail");
			map.put("msg","½èÔÄÊ§°Ü");
		}
		return map;
	}
	@Override
	public Map<String, Object> deleteBook_borrow(book_borrow book_borrow) {
		Map<String ,Object> map= new HashMap<String, Object>();
		int deleteBook_borrow = bookDao.deleteBook_borrow(book_borrow.getId());
		int addBookNumber = bookDao.addBookNumber(book_borrow.getBookId());
		System.out.println(addBookNumber);
		if(deleteBook_borrow==1&&addBookNumber==1) map.put("result","success");
		else map.put("result","fail");
		return map;
	}
	@Override
	public Map<String, Object> getBook_borrowsBystuNumber(String stuNumber) {
		Map<String ,Object> map= new HashMap<String, Object>();
		List<book_borrow_view> book_borrowsByStuNumber = bookDao.getBook_borrowsByStuNumber(stuNumber,true);
		map.put("Y",book_borrowsByStuNumber);
		List<book_borrow_view> book_borrowsByStuNumber2 = bookDao.getBook_borrowsByStuNumber(stuNumber, false);
		map.put("N",book_borrowsByStuNumber2);
		return map;
	}
}






