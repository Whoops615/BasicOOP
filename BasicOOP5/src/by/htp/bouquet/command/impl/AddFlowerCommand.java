package by.htp.bouquet.command.impl;

import by.htp.bouquet.bean.Bouquet;
import by.htp.bouquet.command.Command;
import by.htp.bouquet.service.BouquetService;
import by.htp.bouquet.service.ServiceException;
import by.htp.bouquet.service.ServiceProvider;

public class AddFlowerCommand implements Command {

	@Override
	public String exequte(String request) {

		String[] params = request.split(" ");

		String type = params[1].split("=")[1];
		String color = params[2].split("=")[1];

		ServiceProvider provider = ServiceProvider.getInstance();
		BouquetService bouquetService = provider.getBouquetService();
		Bouquet bouquet = provider.getBouquet();

		String response;

		try {
			bouquet.setFlower(bouquetService.createFlower(type, color));
			response = "Цветок добавлен";
		} catch (ServiceException e) {
			response = e.getMessage();
			
		}

		return response;

	}

}
