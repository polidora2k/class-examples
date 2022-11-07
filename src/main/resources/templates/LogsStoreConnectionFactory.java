package jpa.logging;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LogsStoreConnectionFactory {

	private LogsStoreConnectionFactory() {
	}

	public static Connection getConnection() throws SQLException {
		String connectionUrl = "jdbc:mysql://localhost:3306/schoolmanagementsystem?serverTimezone=UTC";
		return DriverManager.getConnection(connectionUrl, "root", "C$2$xsDMp44");
	}
}
