package club.canghao.card.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import club.canghao.card.dto.user;
import club.canghao.card.model.student;
import club.canghao.card.model.wx_stu;
import club.canghao.card.model.wxuser;
public interface userDao {
	@Select("select * from user where openId=#{openId}")
	public user getUserByOpenId(String openId);
	
	@Select("select * from user where stuNumber=#{stuNumber}")
	public user getUserByStuNumber(String stuNumber);
	
	@Select("select * from user")
	public List<user> getAllUser();
	
	@Insert("insert into wx_stu values(#{openId},#{stuNumber})")
	public int addUser(user user);
	
	@Select("select * from wx_stu where stuNumber = #{stuNumber}")
	public wx_stu getwxUserByStuNumber(user user);
	
	@Delete("delete from wx_stu where openId=#{openId} and stuNumber=#{stuNumber}")
	public int deleteUser(user user);
	
	@Select("select * from wxuser where openId=#{openId}")
	public wxuser getWxuserByOpenId(String openId);
	
	@Insert("insert into wxuser values(#{openId},#{nickName},#{gender},#{avatarUrl},#{city},#{province},#{country})")
	public int addWxuser(user user);
	
	@Update("update wxuser set nickName=#{nickName},gender=#{gender},avatarUrl=#{avatarUrl},city=#{city},province=#{province},country=#{country} where openId=#{openId}")
	public int updateWxuser(user user);
	
	@Delete("delete from wxuser where openId=#{openId}")
	public int deleteWxuser(String openId);
	
	@Select("select * from wxuser")
	public List<wxuser> getAllWxuser();
	
	@Select("select * from student where stuNumber=#{stuNumber}")
	public student getStudentByStuNumber(String stuNumber);
	
	@Update("update student set stuPhone=#{stuPhone} where stuNumber=#{stuNumber}")
	public int updateStudent(user user);
}
