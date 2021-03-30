package club.canghao.card.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;

import club.canghao.card.dto.book_view;
import club.canghao.card.model.book_borrow;
import club.canghao.card.model.book_review;
import club.canghao.card.service.bookService;

@ResponseBody
@Controller
@RequestMapping("/book")
public class bookController {
	@Resource(name="bookService")
	private bookService bookService;
	@RequestMapping("/getAllBooks")
	public List<book_view> getAllBooks(HttpServletRequest request,String key){
		int page = Integer.parseInt(request.getParameter("page"));
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));
		System.out.println(key);
		int start=(page-1)*pageSize;
		int size=pageSize;
		System.out.println(start);
		System.out.println(size);
		List<book_view> allBook_views = bookService.getAllBook_views(start, size,key);
		return allBook_views;
	}
	@RequestMapping("/addBook_review")
	public Map<String ,Object> addBook_review(HttpServletRequest request){
		book_review book_review=JSONArray.parseObject(request.getParameter("book_review"), book_review.class);
		Map<String ,Object> map=bookService.addBook_review(book_review);
		return map;
	}
	
	@RequestMapping("/deleteBook_review")
	public Map<String ,Object> deleteBook_review(int id){
		Map<String ,Object> map=bookService.deleteBook_review(id);
		return map;
	}
	
	@RequestMapping("/addBook_borrow")
	public Map<String ,Object> addBook_borrow(HttpServletRequest request){
		book_borrow book_borrow=JSONArray.parseObject(request.getParameter("book_borrow"), book_borrow.class);
		System.out.println(book_borrow);
		Map<String ,Object> map=bookService.addBook_borrow(book_borrow);
		return map;
	}
	
	@RequestMapping("/deleteBook_borrow")
	public Map<String ,Object> deleteBook_borrow(HttpServletRequest request){
		book_borrow book_borrow=JSONArray.parseObject(request.getParameter("book_borrow"), book_borrow.class);
		System.out.println(book_borrow);
		Map<String ,Object> map=bookService.deleteBook_borrow(book_borrow);
		return map;
	}
	
	
	@RequestMapping("/getBook_borrowByStuNumber")
	public Map<String ,Object> getBook_borrowByStuNumber(String stuNumber){
		System.out.println(stuNumber);
		Map<String ,Object> map=bookService.getBook_borrowsBystuNumber(stuNumber);
		return map;
	}
}
