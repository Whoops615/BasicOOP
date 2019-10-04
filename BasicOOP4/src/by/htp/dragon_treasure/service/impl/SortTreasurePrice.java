package by.htp.dragon_treasure.service.impl;

import java.util.Comparator;

import by.htp.dragon_treasure.bean.Treasure;

public class SortTreasurePrice implements Comparator<Treasure> {

	@Override
	public int compare(Treasure t1, Treasure t2) {

		if (t1.getPrice() > t2.getPrice()) {
			return 1;
		} else if (t1.getPrice() < t2.getPrice()) {
			return -1;
		}
		return 0;
	}

}
