package by.htp.dragon_treasure.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.dragon_treasure.bean.Treasure;
import by.htp.dragon_treasure.dao.DAOException;
import by.htp.dragon_treasure.dao.DAOProvider;
import by.htp.dragon_treasure.dao.TreasureDAO;
import by.htp.dragon_treasure.service.ServiceException;
import by.htp.dragon_treasure.service.TreasureService;
import by.htp.dragon_treasure.service.util.Validator;

public class TreasureServiceImpl implements TreasureService {

	private DAOProvider provider = DAOProvider.getInstance();

	@Override
	public List<Treasure> getCave() throws ServiceException {

		TreasureDAO treasureDao = provider.getTreasureDao();
		List<Treasure> treasures;
		try {
			treasures = treasureDao.getCave().getTreasures();
		} catch (DAOException e) {
			throw new ServiceException("!!!!!!!!", e);
		}

		return treasures;

	}

	@Override
	public Treasure maxPriceTreasure() throws ServiceException {

		List<Treasure> treasures = getCave();
		int maxPrice = 0;
		int index = 0;

		for (Treasure t : treasures) {
			if (maxPrice < t.getPrice()) {
				maxPrice = t.getPrice();
				index = treasures.indexOf(t);
			}
		}

		return treasures.get(index);

	}

	@Override
	public List<Treasure> sumPriceTreasure(int sum) throws ServiceException {

		if (!Validator.checkSumma(sum)) {
			throw new ServiceException("не верное значение!");
		}

		List<Treasure> treasures = getCave();
		List<Treasure> result = new ArrayList<Treasure>();

		sortTreasurePrice(treasures);

		int sumPrice = 0;

		if (sum > treasures.get(0).getPrice()) {
			for (Treasure t : treasures) {
				if (sumPrice + t.getPrice() < sum) {
					result.add(t);
					sumPrice = sumPrice + t.getPrice();
				}
			}
		}

		return result;
	}

	public void sortTreasurePrice(List<Treasure> treasure) {
		Collections.sort(treasure, new SortTreasurePrice());
	}

}
