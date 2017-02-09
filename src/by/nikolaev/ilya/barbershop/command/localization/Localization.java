package by.nikolaev.ilya.barbershop.command.localization;



import javax.servlet.DispatcherType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import by.nikolaev.ilya.barbershop.command.Command;
import by.nikolaev.ilya.barbershop.command.exeption.CommandNotFoundException;
import by.nikolaev.ilya.barbershop.controller.NamePage;

public final class Localization implements Command{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws CommandNotFoundException {
		request.getSession(true).setAttribute("local", request.getParameter("local"));
		
		
			String page = request.getHeader("referer");
			System.out.println(page);
		
		String page1 = NamePage.INDEX_PAGE;
		return page1;
	}

}
