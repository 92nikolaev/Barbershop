package by.nikolaev.ilya.barbershop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import by.nikolaev.ilya.barbershop.bean.Record;
import by.nikolaev.ilya.barbershop.dao.RecordDAO;
import by.nikolaev.ilya.barbershop.dao.ConnectionData.ConnectionDataSource;
import by.nikolaev.ilya.barbershop.dao.exception.DAOException;

public class SQLRecordDAO implements RecordDAO {

	@Override
	public Record signInRecord(Record record) throws DAOException {
		PreparedStatement preparedStatement = null;
		Connection connection = null;

		try {
			connection = ConnectionDataSource.getConnection();
			String sql = "INSERT INTO record_users (name, date, time, phone) VALUES (?,?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, record.getName());
			preparedStatement.setString(2, record.getData());
			preparedStatement.setString(3, record.getTime());
			preparedStatement.setString(4, record.getPhone());

			preparedStatement.executeUpdate();

			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return record;
	}

}
