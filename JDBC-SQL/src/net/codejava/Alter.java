package net.codejava;
import java.sql.*;
public class Alter {

	public static void main(String[] args) {
		 String url="jdbc:mysql://localhost:3306/JDBC";
	        String username ="swetha";
	        String password="Swetha@2021";
	        try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection(url,username,password);
	        String sql="ALTER TABLE Student MODIFY Age INT";
	        Statement stmt = connection.createStatement();
	        stmt.executeUpdate(sql);
	        System.out.println("Table modified....");
	        }
	        catch(SQLException | ClassNotFoundException e) {
	            System.out.println("Not modified");
				e.printStackTrace();
	        }
	    }

	}


