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
	//查询余额
	@Select("select * from card where cardId=#{cardId}")
	public card getCardByCardId(String cardId);
	
	//充值余额
	@Update("update card set cardRemaining = cardRemaining + #{money} where cardId = #{cardId}")
	public int addCardMoney(card_record card_record);
	
	//添加记录
	@Insert("insert into card_record values(#{id},#{cardId},#{time},#{money},#{type},#{content})")
	public int addCardRecord(card_record card_record);
	
	//查询记录
	public List<card_record> getCardRecord(@Param("stuNumber") String stuNumber,@Param("start") int start,@Param("size") int size,@Param("starttime") String starttime,@Param("endtime") String endtime);
	
	//消费余额
	@Update("update card set cardRemaining = cardRemaining - #{money} where cardId = #{cardId}")
	public int minusCardMoney(card_record card_record);
			
	//添加捡卡记录
	@Insert("insert into card_pick values(#{id},#{pickerName},#{pickerPhone},#{pickTime},#{cardId},#{stuName},#{pickDesc})")
	public int addCard_pick(card_pick card_pick);
	
	//通过学号查询别人的捡卡记录
	@Select("select * from card_pick where cardId=#{0} order by id desc")
	public List<card_pick> getCard_pick(String stuNumber);
	
	//挂失冻结
	@Update("update card set cardState=0 where cardId=#{0} and cardPwd=#{1}")
	public int lossCard(String cardId,String cardPwd);
	
	//找回解冻
	@Update("update card set cardState=1 where cardId=#{0} and cardPwd=#{1}")
	public int findCard(String cardId,String cardPwd);
}
