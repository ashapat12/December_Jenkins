package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getDataFromDb(String columnName) {

		try {
			// setting properties for MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");

			// jdbc:mysql://hostName:portNumber/databaseName
			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/december_2023";
			String sqlUsername = "student";
			String sqlPassword = "Student@123";
			String sqlQuery = "SELECT * from login_data ";

			// 3 Interfaces to establish relation with DB are Connection, Statement,
			// ResultSet
			// create connection to Database
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			// empowering the connection reference variable to execute queries
			statement = connection.createStatement();
			// execute query
			resultSet = statement.executeQuery(sqlQuery);

			while (resultSet.next()) {	//resultSet.next will never be false so use codes in finally
				columnValue = resultSet.getString(columnName);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (connection != null) {
					try {
						resultSet.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
			}
		}

		return columnValue;
	}

}
