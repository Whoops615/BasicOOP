package by.htp.bouquet.command.impl;

import by.htp.bouquet.bean.Bouquet;
import by.htp.bouquet.command.Command;
import by.htp.bouquet.service.BouquetService;

import by.htp.bouquet.service.ServiceProvider;

public class CostCommand implements Command {

	@Override
	public String exequte(String request) {

		ServiceProvider provider = ServiceProvider.getInstance();
		BouquetService serviceBouquet = provider.getBouquetService();
		Bouquet bouquet = provider.getBouquet();

		int cost = serviceBouquet.priceBouquet(bouquet);

		String response;

		response = "Стоимость букета: " + cost;

		return response;
	}

}
