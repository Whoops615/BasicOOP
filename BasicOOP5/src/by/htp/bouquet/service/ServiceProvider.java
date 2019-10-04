package by.htp.bouquet.service;

import by.htp.bouquet.bean.Bouquet;
import by.htp.bouquet.service.impl.BouquetServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider INSTANCE = new ServiceProvider();

	private ServiceProvider() {

	}

	public static ServiceProvider getInstance() {
		return INSTANCE;
	}

	private BouquetService bouquetService = new BouquetServiceImpl();

	public BouquetService getBouquetService() {
		return bouquetService;
	}
	
	private Bouquet bouquet = new Bouquet();

	public Bouquet getBouquet() {
		return bouquet;
	}
	
	

}
