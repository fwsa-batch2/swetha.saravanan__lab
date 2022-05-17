package net.codejava;
import java.sql.*;
public class db {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306";
        String name="swetha";
        String password="Swetha@2021";
        try {
            Connection connection = DriverManager.getConnection(url, name, password);
            String sql="CREATE DATABASE example";
            Statement stmt = connection.createStatement();
            stmt.executeQuery(sql);
            System.out.println("Database created...");
        } catch (SQLException e) {
            System.out.println("Not created...");
            e.printStackTrace();
        }
        
    }
}
