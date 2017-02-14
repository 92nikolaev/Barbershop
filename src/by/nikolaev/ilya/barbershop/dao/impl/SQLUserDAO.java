package by.nikolaev.ilya.barbershop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.dao.UserDAO;
import by.nikolaev.ilya.barbershop.dao.ConnectionData.ConnectionDataSource;
import by.nikolaev.ilya.barbershop.dao.exception.DAOException;

public class SQLUserDAO implements UserDAO {

	@Override
	public User singinUser(User user) throws DAOException {
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		Connection connection = null;
		try {
			connection = ConnectionDataSource.getConnection();
			preparedStatement = connection.prepareStatement("select * from user where login=? and password=?");
			preparedStatement.setString(1, user.getLogin());
			preparedStatement.setString(2, user.getPassword());

			rs = preparedStatement.executeQuery();

			if (rs.next()) {
				user = new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setSurname(rs.getString(3));
				user.setEmail(rs.getString(4));
				user.setLogin(rs.getString(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}

	@Override
	public User signupUser(User user, String securPasword) throws DAOException {
		PreparedStatement preparedStatement = null;
		Connection connection = null;

		try {

			connection = ConnectionDataSource.getConnection();

			preparedStatement = connection.prepareStatement("INSERT INTO user (name, surname, email, login, password) VALUES (?,?,?,?,?)");
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getSurname());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getLogin());
			preparedStatement.setString(5, user.getPassword());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User EditProfile(User user) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

}
