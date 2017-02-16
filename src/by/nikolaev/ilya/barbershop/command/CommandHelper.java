package by.nikolaev.ilya.barbershop.command;

import java.util.HashMap;
import java.util.Map;

import by.nikolaev.ilya.barbershop.command.impl.Registration;

public class CommandHelper {
	private static CommandHelper instance;
	private Map<String, Command> commands = new HashMap<String, Command>();
	
	public static CommandHelper getInstance(){
		if(instance == null){
			instance = new CommandHelper();
		}
		return instance;
	}
	private CommandHelper(){
		commands.put(NameParametr.CMD_REGISTRATION,  new Registration());
	}
	public Command getCommand(String commandName){
		Command command;
		command = commands.get(commandName);
		if(command != null){
			return command;
		}else {
			return command;
		}
	}
}
