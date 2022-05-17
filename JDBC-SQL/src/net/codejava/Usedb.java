package net.codejava;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Usedb {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306";
        String username ="root";
        String password="password";
        try {
        Connection connection = DriverManager.getConnection(url,username,password);
        String sql="USE JDBC";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Using Database ....");
        }
        catch(SQLException e) {
            System.out.println("Database is not created");
			e.printStackTrace();
        }
    }
}
