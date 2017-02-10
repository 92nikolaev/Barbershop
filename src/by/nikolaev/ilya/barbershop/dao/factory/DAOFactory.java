package by.nikolaev.ilya.barbershop.dao.factory;

import by.nikolaev.ilya.barbershop.dao.RecordDAO;
import by.nikolaev.ilya.barbershop.dao.UserDAO;
import by.nikolaev.ilya.barbershop.dao.impl.SQLRecordDAO;
import by.nikolaev.ilya.barbershop.dao.impl.SQLUserDAO;

public class DAOFactory {
	private static DAOFactory instance = null;
	private final UserDAO userDAO = new SQLUserDAO();
	private final RecordDAO recordDAO = new SQLRecordDAO();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		if (instance == null) {
			instance = new DAOFactory();
		}
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public RecordDAO getRecordDAO() {
		return recordDAO;
	}

}
