package by.htp.bouquet.service;

import by.htp.bouquet.bean.Bouquet;
import by.htp.bouquet.bean.Cover;
import by.htp.bouquet.bean.Flower;

public interface BouquetService {

	Cover createCover(String type, String color) throws ServiceException;
	Flower createFlower(String type, String color) throws ServiceException;
	int priceBouquet(Bouquet bouquet);

}
