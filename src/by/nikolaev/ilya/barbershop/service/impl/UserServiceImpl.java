package by.nikolaev.ilya.barbershop.service.impl;

import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.dao.UserDAO;
import by.nikolaev.ilya.barbershop.dao.exception.DAOException;
import by.nikolaev.ilya.barbershop.dao.factory.DAOFactory;
import by.nikolaev.ilya.barbershop.service.UserService;
import by.nikolaev.ilya.barbershop.service.exeption.ServiceException;
import by.nikolaev.ilya.barbershop.service.validation.ValidationDate;

public class UserServiceImpl implements UserService {

	@Override
	public User singinUser(User user) throws ServiceException {
		if ((user.getLogin() != null) && (user.getPassword() != null)) {
			DAOFactory daoFactory = DAOFactory.getInstance();
			UserDAO userDAO = daoFactory.getUserDAO();

			try {
				user = userDAO.singinUser(user);
			} catch (DAOException ex) {
				throw new ServiceException();
			}
		} else {
			throw new ServiceException("You did not write incorecet login or password");
		}
		return user;
	}

	@Override
	public User signupUser(User user, String securPasword) throws ServiceException {

		if (!ValidationDate.validationRegisterDate(user.getName(), user.getSurname(), user.getEmail(), user.getLogin(), user.getPassword(), securPasword)) {
			user = null;

		} else {
			DAOFactory daoFactory = DAOFactory.getInstance();
			UserDAO userDAO = daoFactory.getUserDAO();
			try {
				user = userDAO.signupUser(user, securPasword);
			} catch (DAOException ex) {
				throw new ServiceException();
			}

		}
		return user;
	}

	// @Override
	// public User EditProfile(User user) throws ServiceException {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
