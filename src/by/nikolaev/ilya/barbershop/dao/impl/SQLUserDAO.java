package by.nikolaev.ilya.barbershop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.dao.UserDAO;
import by.nikolaev.ilya.barbershop.dao.ConnectionData.ConnectionDataSource;

public class SQLUserDAO implements UserDAO{

	@Override
	public User singinUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signupUser(User user, String securPasword) {
		PreparedStatement preparedStatement = null;
		Connection connection = null;
		
		try {
				connection = ConnectionDataSource.getConnection();
				preparedStatement = connection.prepareStatement("INSERT INTO users (name, surname,  email, login, password) VALUES (?,?,?,?,?)"); 
				
				preparedStatement.setString(1, user.getName());
				preparedStatement.setString(2, user.getSurname());
				preparedStatement.setString(3, user.getEmail());
				preparedStatement.setString(4, user.getLogin());
				preparedStatement.setString(5, user.getPassword());
			
				preparedStatement.executeQuery();
				
				
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(connection != null){
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
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
