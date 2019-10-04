package by.htp.dragon_treasure.service;

import java.util.List;

import by.htp.dragon_treasure.bean.Treasure;

public interface TreasureService {
	
	List<Treasure> getCave() throws ServiceException;
	Treasure maxPriceTreasure() throws ServiceException;
	List<Treasure> sumPriceTreasure(int sum) throws ServiceException;

}
