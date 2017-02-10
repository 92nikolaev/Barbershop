package by.nikolaev.ilya.barbershop.command;

import java.util.HashMap;
import java.util.Map;

import by.nikolaev.ilya.barbershop.command.implRecord.RecordUser;
import by.nikolaev.ilya.barbershop.command.implUser.Registration;
import by.nikolaev.ilya.barbershop.command.implUser.SignInUser;
import by.nikolaev.ilya.barbershop.command.implUser.SignOutUser;
import by.nikolaev.ilya.barbershop.command.localization.Localization;

public class CommandHelper {
	private static CommandHelper instance;
	private Map<String, Command> commands = new HashMap<String, Command>();

	public static CommandHelper getInstance() {
		if (instance == null) {
			instance = new CommandHelper();
		}
		return instance;
	}

	private CommandHelper() {
		commands.put(NameParametr.CMD_REGISTRATION, new Registration());
		commands.put(NameParametr.CMD_SIGN_IN, new SignInUser());
		commands.put(NameParametr.CMD_LOCALIZATION, new Localization());
		commands.put(NameParametr.CMD_RECORD, new RecordUser());
		commands.put(NameParametr.CMD_SIGN_OUT, new SignOutUser());
	}

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		if (command != null) {
			return command;
		} else {
			return command;
		}
	}
}
