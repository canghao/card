package club.canghao.card.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import club.canghao.card.dto.book_borrow_view;
import club.canghao.card.dto.book_view;
import club.canghao.card.model.book;
import club.canghao.card.model.book_borrow;
import club.canghao.card.model.book_review;

public interface bookDao {
	@Select("select * from book where bookId=#{0}")
	public book getBookByBookId(String bookId);
	
	@Update("update book set bookNumber = bookNumber - 1 where bookId = #{0}")
	public int  minusBookNumber(String bookId);
	
	@Update("update book set bookNumber = bookNumber + 1 where bookId = #{0}")
	public int  addBookNumber(String bookId);
	
	public List<book_view> getAllBook_views(@Param("start") int start,@Param("size") int size,@Param("key") String key,@Param("bookId") String bookId);
	
	@Insert("insert into book_review values(#{id},#{bookId},#{stuNumber},#{nickName},#{avatarUrl},#{reviewContent},#{reviewTime})")
	public int addBook_review(book_review book_review);
	
	@Delete("delete from book_review where id=#{0}")
	public int deleteBook_review(int id);
	
	@Insert("insert into book_borrow values(#{id},#{bookId},#{stuNumber},#{nickName},#{avatarUrl},#{borrowTime},#{borrowMonths},#{isReturn})")
	public int addBook_borrow(book_borrow book_borrow);
	
	@Update("update book_borrow set isReturn = 1 where id=#{id}")
	public int deleteBook_borrow(int id);

	public List<book_borrow_view> getBook_borrowsByStuNumber(@Param("stuNumber") String stuNumber,@Param("isReturn") boolean isReturn);
}
