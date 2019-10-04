package by.htp.dragon_treasure.main;

import by.htp.dragon_treasure.service.ServiceException;
import by.htp.dragon_treasure.service.impl.TreasureServiceImpl;

public class Main {

	public static void main(String[] args) throws ServiceException {

		TreasureServiceImpl t = new TreasureServiceImpl();
		System.out.println(t.getCave());
		System.out.println(t.maxPriceTreasure());
		
		System.out.println("-------------------------");
		System.out.println(t.sumPriceTreasure(3000));

	}

}
