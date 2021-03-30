package club.canghao.card.service;

import java.util.List;

import club.canghao.card.model.entrance;

public interface entranceService {
	public List<entrance> getAllEntrancesByStuNumber(String stuNumber,int start,int size);
}
