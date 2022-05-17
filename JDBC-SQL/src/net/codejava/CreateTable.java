package net.codejava;
import java.sql.*;
public class CreateTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/JDBC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url);
            String sql="CREATE TABLE Example(Id int primary key auto_increment , Name varchar(25)) ";
            Statement stmt=connection.createStatement();
            stmt.executeQuery(sql);
            System.out.println("Table created...");
        } catch (Exception e) {
            System.out.println("Not created..");
            e.printStackTrace();
        }

    }
}
