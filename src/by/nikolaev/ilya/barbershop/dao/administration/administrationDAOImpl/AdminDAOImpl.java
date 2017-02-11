package by.nikolaev.ilya.barbershop.dao.administration.administrationDAOImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import by.nikolaev.ilya.barbershop.bean.User;
import by.nikolaev.ilya.barbershop.dao.ConnectionData.ConnectionDataSource;
import by.nikolaev.ilya.barbershop.dao.administration.AdministrationDAO;
import by.nikolaev.ilya.barbershop.dao.exception.DAOException;

public class AdminDAOImpl implements AdministrationDAO {

	@Override
	public ArrayList<User> ShowUserList() throws DAOException {
		ArrayList<User> listUser = new ArrayList<>();
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;

		try {
			connection = ConnectionDataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM user");

			while (resultSet.next()) {
				User user = new User();

				user.setId(resultSet.getInt(1));
				user.setName(resultSet.getString(2));
				user.setSurname(resultSet.getString(3));
				user.setEmail(resultSet.getString(4));
				user.setLogin(resultSet.getString(5));

				listUser.add(user);
			}

		} catch (Exception e) {
			throw new DAOException(e);
		}

		return listUser;
	}

}
