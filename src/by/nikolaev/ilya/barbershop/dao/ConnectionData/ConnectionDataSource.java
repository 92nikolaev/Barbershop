package by.nikolaev.ilya.barbershop.dao.ConnectionData;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionDataSource {
	
	static Connection connection =null;
	static{
		try {
			Context context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/nikolaev");
			connection = ds.getConnection();
		} catch (NamingException e){
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		return connection;
	}
	

}
