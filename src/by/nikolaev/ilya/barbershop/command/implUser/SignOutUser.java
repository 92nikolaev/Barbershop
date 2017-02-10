package by.nikolaev.ilya.barbershop.command.implUser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.nikolaev.ilya.barbershop.command.Command;
import by.nikolaev.ilya.barbershop.command.exeption.CommandNotFoundException;
import by.nikolaev.ilya.barbershop.controller.NamePage;

public class SignOutUser implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandNotFoundException {

		HttpSession session = request.getSession();
		session.removeAttribute("logged");
		session.removeAttribute("user");
		String page = NamePage.INDEX_PAGE;
		return page;

	}

}
