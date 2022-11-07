package com.teksystems.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionExample {

	public static void main(String[] args) {
		String dburl = "jdbc:mysql://127.0.0.1:3306/classicmodels";
		String user = "root";
		String password = "C$2$xsDMp44";
		PreparedStatement stmt = null;
		Connection connection = null;
		ResultSet result = null;
		
		try {
			connection = DriverManager.getConnection(dburl, user, password);
			System.out.println("connection " + (connection.isReadOnly() ? "is" : "is not") + " read only");
			String SelectSQL = "Select * FROM employees where firstName = ?";
			stmt = connection.prepareStatement(SelectSQL);
			stmt.setString(1, "Diane");
			result = stmt.executeQuery();
			while(result.next()) {
			    String name = result.getString("firstName");
			    String email = result.getString("email");
			    System.out.println(name +" | " + email);   
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				result.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					stmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						connection.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
	}

}
