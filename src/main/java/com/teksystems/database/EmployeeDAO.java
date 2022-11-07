package com.teksystems.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/classicmodels";
	private final String USER = "root";
	private final String PASSWORD = "C$2$xsDMp44";
	private PreparedStatement stmt = null;
	private Connection connection = null;
	private ResultSet result = null;
	
	public EmployeeDAO() {
		try {
			connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Employee> findByFirstName( String firstName, String lastName ) {
		ArrayList<Employee> employees = new ArrayList<>();

		try {
			String SelectSQL = "Select * FROM employees where firstName = ? and lastName = ?";
			stmt = connection.prepareStatement(SelectSQL);
			stmt.setString(1,firstName);
			stmt.setString(2,lastName);
			
			result = stmt.executeQuery();

			while (result.next()) {
				// get column 1 from the result set..
				// NOTE : the result set is 1 based so getting column 0 will fail.
				Employee e = new Employee();
				
				e.setEmployeeNumber(result.getInt(1));
				e.setFirstName(result.getString("firstName"));
				e.setLastName(result.getString("lastName"));
				e.setEmail(result.getString("email"));
				
				employees.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return employees;
	}
	
	public List<Employee> findEmail( String email ) {
		
		ArrayList<Employee> employees = new ArrayList<>();

		try {
			String SelectSQL = "Select * FROM employees where email = ?";
			stmt = connection.prepareStatement(SelectSQL);
			stmt.setString(1,email);
			
			result = stmt.executeQuery();

			while (result.next()) {
				// get column 1 from the result set..
				// NOTE : the result set is 1 based so getting column 0 will fail.
				Employee e = new Employee();
				
				e.setEmployeeNumber(result.getInt(1));
				e.setFirstName(result.getString("firstName"));
				e.setLastName(result.getString("lastName"));
				e.setEmail(result.getString("email"));
				
				employees.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return employees;
	}
	
	public void close() {
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
