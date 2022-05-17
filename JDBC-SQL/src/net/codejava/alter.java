package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class alter {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/JDBC";
        String username ="root";
        String password="password";
        try {
        Connection connection = DriverManager.getConnection(url,username,password);
        String sql="ALTER TABLE Student MODIFY Age INT";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        System.out.println("Table modified....");
        }
        catch(SQLException e) {
            System.out.println("Not modified");
			e.printStackTrace();
        }
    }
}
