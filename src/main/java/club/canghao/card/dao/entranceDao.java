package club.canghao.card.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import club.canghao.card.model.entrance;

public interface entranceDao {
	@Select("select * from entrance where stuNumber = #{stuNumber} order by entranceTime desc limit #{start},#{size}")
	public List<entrance> getAllEntrancesByStuNumber(@Param("stuNumber") String stuNumber,@Param("start") int start,@Param("size") int size);
}
