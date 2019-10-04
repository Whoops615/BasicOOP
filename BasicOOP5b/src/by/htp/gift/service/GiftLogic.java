package by.htp.gift.service;

import by.htp.gift.bean.Gift;
import by.htp.gift.bean.Sweetness;

public class GiftLogic {

	public int priceGift(Gift gift) {

		int result;

		result = gift.getCover().getPrice();

		for (Sweetness s : gift.getSweetness()) {
			result = result + s.getPrice();
		}

		return result;
	}

	public int caloriesGift(Gift gift) {

		int result = 0;

		for (Sweetness s : gift.getSweetness()) {
			result = result + s.getCalories();
		}
		return result;
	}

}
