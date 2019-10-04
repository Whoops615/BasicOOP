package by.htp.gift.service;

import by.htp.gift.bean.ChocolateCandy;
import by.htp.gift.bean.Cover;
import by.htp.gift.bean.Gift;
import by.htp.gift.bean.SugarCandy;
import by.htp.gift.bean.Sweetness;

public class Creator {

	public Gift createGift() {
		Gift gift = new Gift();
		return gift;
	}

	public Cover createCover(String type, String color, int price) {
		Cover cover = new Cover(type, color, price);
		return cover;
	}

	public Sweetness createChocolateCandy(String title, int weight, int price, int calories, String tupeChocolate,
			String filling) {
		Sweetness sweetness = new ChocolateCandy(title, weight, price, calories, tupeChocolate, filling);

		return sweetness;
	}

	public Sweetness createSugarCandy(String title, int weight, int price, int calories, String taste) {
		Sweetness sweetness = new SugarCandy(title, weight, price, calories, taste);
		return sweetness;
	}
	
	public void addCover(Gift gift, Cover cover) {
		gift.setCover(cover);
	}
	public void addChocolateCandy(Gift gift, Sweetness s) {
		gift.add(s);
	}
	public void addSugarCandy(Gift gift, Sweetness s) {
		gift.add(s);
	}
	

}
