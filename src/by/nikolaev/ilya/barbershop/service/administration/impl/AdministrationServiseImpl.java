package by.nikolaev.ilya.barbershop.service.administration.impl;

import java.util.ArrayList;

import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.dao.administration.AdministrationDAO;
import by.nikolaev.ilya.barbershop.dao.exception.DAOException;
import by.nikolaev.ilya.barbershop.dao.factory.DAOFactory;
import by.nikolaev.ilya.barbershop.service.administration.AdministrationService;
import by.nikolaev.ilya.barbershop.service.exeption.ServiceException;

public class AdministrationServiseImpl implements AdministrationService {

	@Override
	public ArrayList<User> ShowUserList() throws ServiceException {

		ArrayList<User> listUser = null;
		DAOFactory daoFactory = DAOFactory.getInstance();
		AdministrationDAO administrationDAO = daoFactory.getAdministrationDAO();

		try {
			listUser = administrationDAO.ShowUserList();
		} catch (DAOException e) {
			throw new ServiceException();
		}

		return listUser;
	}

}
