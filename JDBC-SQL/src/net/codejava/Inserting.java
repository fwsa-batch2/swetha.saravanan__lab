package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserting {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/JDBC";
        String username ="root";
        String password="password";
        try {
			Connection connection = DriverManager.getConnection(url,username,password);
			String insert1 = "INSERT INTO Students VALUES(4,'Karthika',17),(5,'Harry',20)";
			PreparedStatement statement=connection.prepareStatement(insert1);
            statement.executeUpdate();
	        System.out.println("Values inserted");
	        statement.close();
	        connection.close();
		} catch (SQLException e) {
			System.out.println("Something happened");
			e.printStackTrace();
		}
        
        }  
}
