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
	//����ȵ��¼
	public int addHot(hot hot);
	//����ȵ���Ӧ��ͼƬ
	public int addHot_img(hot hot);
	//����ȵ����
	@Insert("insert into hot_like values(#{hotId},#{stuNumber},#{avatarUrl},#{nickName})")
	public int addHot_like(hot_like hot_like);
	//ȡ���ȵ����
	@Delete("delete from hot_like where hotId=#{hotId} and stuNumber=#{stuNumber}")
	public int deleteHot_like(hot_like hot_like);
	//����ȵ�����
	@Insert("insert into hot_review values(#{id},#{hotId},#{stuNumber},#{avatarUrl},#{nickName},#{reviewTime},#{reviewContent})")
	public int addHot_review(hot_review hot_review);
	//ɾ���ȵ�����
	@Delete("delete from hot_review where id=#{id}")
	public int deleteHot_review(int id);
	//��ѯ�ȵ�
	public List<hot_view> getAllHots(@Param("start") int start, @Param("size") int size,@Param("releaseStuNumber") String stuNumber);
}
