package by.htp.bouquet.service.impl;

import by.htp.bouquet.bean.Bouquet;
import by.htp.bouquet.bean.Cover;
import by.htp.bouquet.bean.CoverType;
import by.htp.bouquet.bean.Flower;
import by.htp.bouquet.bean.FlowerType;
import by.htp.bouquet.service.BouquetService;
import by.htp.bouquet.service.ServiceException;
import by.htp.bouquet.service.util.Validator;

public class BouquetServiceImpl implements BouquetService {

	public Cover createCover(String type, String color) throws ServiceException {

		if (!Validator.validCover(type)) {
			throw new ServiceException("Не верные данные");
		}

		Cover cover = new Cover();
		if (type.compareTo(CoverType.PAPER.name()) == 0) {
			cover.setType(CoverType.PAPER);
		} else if (type.compareTo(CoverType.PLASTIC.name()) == 0) {
			cover.setType(CoverType.PLASTIC);
		}

		cover.setColor(color);

		return cover;
	}

	public Flower createFlower(String type, String color) throws ServiceException {

		if (!Validator.validFlower(type)) {
			throw new ServiceException("не верные данные");
		}

		Flower flower = new Flower();

		switch (type) {
		case "ROSE":
			flower.setFlowerType(FlowerType.ROSE);
			break;
		case "TULIP":
			flower.setFlowerType(FlowerType.TULIP);
			break;
		case "CHAMOMILE":
			flower.setFlowerType(FlowerType.CHAMOMILE);
			break;
		case "ALOE":
			flower.setFlowerType(FlowerType.ALOE);
			break;
		case "CARNATION":
			flower.setFlowerType(FlowerType.CARNATION);
			break;
		}

		flower.setColor(color);

		return flower;
	}

	@Override
	public int priceBouquet(Bouquet bouquet) {
		int price = 0;

		for (Flower f : bouquet.getFlowers()) {
			price = price + f.getFlowerType().getPrice();
		}

		price = price + bouquet.getCover().getType().getPrice();
		return price;
	}

}
