package by.htp.bouquet.controller;

import by.htp.bouquet.command.Command;
import by.htp.bouquet.command.CommandProvider;

public class Controller {

	private final CommandProvider provider = new CommandProvider();

	public String doAction(String request) {

		String commandName;
		String response;
		Command command;

		commandName = request.split(" ")[0];
		command = provider.getCommand(commandName);
		response = command.exequte(request);

		return response;
	}

}
