package club.canghao.card.dao;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import club.canghao.card.model.card;
import club.canghao.card.model.card_pick;
import club.canghao.card.model.card_record;

public interface cardDao {
	//��ѯ���
	@Select("select * from card where cardId=#{cardId}")
	public card getCardByCardId(String cardId);
	
	//��ֵ���
	@Update("update card set cardRemaining = cardRemaining + #{money} where cardId = #{cardId}")
	public int addCardMoney(card_record card_record);
	
	//��Ӽ�¼
	@Insert("insert into card_record values(#{id},#{cardId},#{time},#{money},#{type},#{content})")
	public int addCardRecord(card_record card_record);
	
	//��ѯ��¼
	public List<card_record> getCardRecord(@Param("stuNumber") String stuNumber,@Param("start") int start,@Param("size") int size,@Param("starttime") String starttime,@Param("endtime") String endtime);
	
	//�������
	@Update("update card set cardRemaining = cardRemaining - #{money} where cardId = #{cardId}")
	public int minusCardMoney(card_record card_record);
			
	//��Ӽ񿨼�¼
	@Insert("insert into card_pick values(#{id},#{pickerName},#{pickerPhone},#{pickTime},#{cardId},#{stuName},#{pickDesc})")
	public int addCard_pick(card_pick card_pick);
	
	//ͨ��ѧ�Ų�ѯ���˵ļ񿨼�¼
	@Select("select * from card_pick where cardId=#{0} order by id desc")
	public List<card_pick> getCard_pick(String stuNumber);
	
	//��ʧ����
	@Update("update card set cardState=0 where cardId=#{0} and cardPwd=#{1}")
	public int lossCard(String cardId,String cardPwd);
	
	//�һؽⶳ
	@Update("update card set cardState=1 where cardId=#{0} and cardPwd=#{1}")
	public int findCard(String cardId,String cardPwd);
}
