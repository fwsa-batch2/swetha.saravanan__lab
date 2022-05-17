package net.codejava;
import java.sql.*;
public class Updating {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/JDBC";
        String username ="root";
        String password="password";
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        String sql="UPDATE Student SET Age=18 WHERE id=1";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.executeUpdate(sql);
        System.out.println("Table updated......");
        }
        catch(SQLException | ClassNotFoundException e) {
            System.out.println("Not updated");
			e.printStackTrace();
        }

	}

}
