package by.nikolaev.ilya.barbershop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import by.nikolaev.ilya.barbershop.bean.News;
import by.nikolaev.ilya.barbershop.dao.NewsDAO;
import by.nikolaev.ilya.barbershop.dao.ConnectionData.ConnectionDataSource;
import by.nikolaev.ilya.barbershop.dao.exception.DAOException;

public class SQLNewsDAO implements NewsDAO {

	@Override
	public ArrayList<News> showAllNews() throws DAOException {
		ArrayList<News> listNews = new ArrayList<>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			connection = ConnectionDataSource.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM news ORDER BY id DESC");

			while (resultSet.next()) {
				News news = new News();

				news.setId(resultSet.getInt(1));
				news.setTitle(resultSet.getString(2));
				news.setDate(resultSet.getDate(3));
				news.setContent(resultSet.getString(4));

				listNews.add(news);
			}
		} catch (Exception e) {
			throw new DAOException(e);
		}

		return listNews;
	}

	@Override
	public News addNews(News news) throws DAOException {
		PreparedStatement preparedStatement = null;
		Connection connection = null;

		try {
			connection = ConnectionDataSource.getConnection();

			preparedStatement = connection.prepareStatement("INSERT INTO news (news_title, news_date, news_content) VALUES (?,?,?)");
			preparedStatement.setString(1, news.getTitle());
			preparedStatement.setDate(2, news.getDate());
			preparedStatement.setString(3, news.getContent());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			throw new DAOException(e);
		}

		return news;
	}

}
