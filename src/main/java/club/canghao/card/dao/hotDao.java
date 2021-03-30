package club.canghao.card.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import club.canghao.card.dto.hot_view;
import club.canghao.card.model.hot;
import club.canghao.card.model.hot_like;
import club.canghao.card.model.hot_review;

public interface hotDao {
	//添加热点记录
	public int addHot(hot hot);
	//添加热点相应的图片
	public int addHot_img(hot hot);
	//添加热点点赞
	@Insert("insert into hot_like values(#{hotId},#{stuNumber},#{avatarUrl},#{nickName})")
	public int addHot_like(hot_like hot_like);
	//取消热点点赞
	@Delete("delete from hot_like where hotId=#{hotId} and stuNumber=#{stuNumber}")
	public int deleteHot_like(hot_like hot_like);
	//添加热点评论
	@Insert("insert into hot_review values(#{id},#{hotId},#{stuNumber},#{avatarUrl},#{nickName},#{reviewTime},#{reviewContent})")
	public int addHot_review(hot_review hot_review);
	//删除热点评论
	@Delete("delete from hot_review where id=#{id}")
	public int deleteHot_review(int id);
	//查询热点
	public List<hot_view> getAllHots(@Param("start") int start, @Param("size") int size,@Param("releaseStuNumber") String stuNumber);
}
