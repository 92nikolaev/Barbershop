package by.nikolaev.ilya.barbershop.service.administration;

import java.util.ArrayList;

import by.nikolaev.ilya.barbershop.bean.Admin;
import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.service.exeption.ServiceException;

public interface AdministrationService {
	ArrayList<User> ShowUserList() throws ServiceException;

	Admin SignInAdmin(Admin admin) throws ServiceException;
}
