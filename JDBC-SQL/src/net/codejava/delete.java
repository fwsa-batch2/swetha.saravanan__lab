package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/JDBC";
        String username ="swetha";
        String password="Swetha@2021";
        try {
        Connection connection = DriverManager.getConnection(url,username,password);
        String sql="DELETE FROM Student WHERE id=6";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.executeUpdate();
        System.out.println("A row deleted.....");
        }
        catch(SQLException e) {
            System.out.println("Not deleted");
			e.printStackTrace();
        }
}
}
