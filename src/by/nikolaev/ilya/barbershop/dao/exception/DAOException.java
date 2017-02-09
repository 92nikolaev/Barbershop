package by.nikolaev.ilya.barbershop.dao.exception;

import java.sql.SQLException;

public class DAOException extends Exception {

	public DAOException(SQLException e){}

	private static final long serialVersionUID = 1L;

}
