package by.htp.bouquet.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.bouquet.command.impl.AddCoverCommand;
import by.htp.bouquet.command.impl.AddFlowerCommand;
import by.htp.bouquet.command.impl.CostCommand;

public class CommandProvider {

	private Map<String, Command> commands;

	public CommandProvider() {
		commands = new HashMap<String, Command>();

		commands.put("addCover", new AddCoverCommand());
		commands.put("addFlower", new AddFlowerCommand());
		commands.put("cost", new CostCommand());
	}

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		return command;
	}

}
