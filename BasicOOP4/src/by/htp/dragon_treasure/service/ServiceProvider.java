package by.htp.dragon_treasure.service;

import by.htp.dragon_treasure.service.impl.TreasureServiceImpl;

public class ServiceProvider {

	public static final ServiceProvider instance = new ServiceProvider();

	private ServiceProvider() {

	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	private TreasureService treasureService = new TreasureServiceImpl();

	public TreasureService getTreasureService() {
		return treasureService;
	}

}
