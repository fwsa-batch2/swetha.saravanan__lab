package net.codejava;
import java.sql.*;
public class Createdb {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306";
		String name="swetha";
		String password="Swetha@2021";
        try {
            Connection connection=DriverManager.getConnection(url,name,password);
            String sql="CREATE DATABASE Register";
            Statement stmt=connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("database created...");
        } catch (Exception e) {
            System.out.println("Not created..");
            e.printStackTrace();
        }

    }
}