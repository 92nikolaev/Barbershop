package by.nikolaev.ilya.barbershop.service.impl;

import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.dao.UserDAO;
import by.nikolaev.ilya.barbershop.dao.factory.DAOFactory;
import by.nikolaev.ilya.barbershop.service.UserService;
import by.nikolaev.ilya.barbershop.service.validation.ValidationDate;

public class UserServiceImpl implements UserService  {

	@Override
	public User singinUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signupUser(User user, String securPasword) {
		
		if(!ValidationDate.validationRegisterDate(user.getName(), user.getSurname(), user.getEmail(), user.getLogin(), user.getPassword(), securPasword)){
			user = null;
			
		}else {
			DAOFactory daoFactory = DAOFactory.getInstance();
			UserDAO userDAO = daoFactory.getUserDAO();
			try {
			user = userDAO.signupUser(user, securPasword);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		return user;
	}

	@Override
	public User EditProfile(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
