package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Update {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/JDBC";
        String username ="root";
        String password="password";
        try {
        Connection connection = DriverManager.getConnection(url,username,password);
        String sql="UPDATE Student SET Age=18 WHERE id=1";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.executeUpdate(sql);
        System.out.println("Table updated......");
        }
        catch(SQLException e) {
            System.out.println("Not updated");
			e.printStackTrace();
        }
}
}
