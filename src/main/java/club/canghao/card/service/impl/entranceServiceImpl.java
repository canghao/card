package club.canghao.card.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import club.canghao.card.dao.entranceDao;
import club.canghao.card.model.entrance;
import club.canghao.card.service.entranceService;
@Service("entranceService")
public class entranceServiceImpl implements entranceService {

	@Autowired
	private entranceDao entranceDao;
	@Override
	public List<entrance> getAllEntrancesByStuNumber(String stuNumber,int start,int size) {
		List<entrance> allEntrancesByStuNumber = entranceDao.getAllEntrancesByStuNumber(stuNumber,start,size);
		return allEntrancesByStuNumber;
	}
}
