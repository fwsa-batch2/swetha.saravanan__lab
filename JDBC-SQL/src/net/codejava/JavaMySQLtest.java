package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JavaMySQLtest {
    public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "swetha";
		String password ="Swetha@2021";
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			String sql = "insert into example values(?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql);
            statement.setInt(1, 4);
			statement.setString(2,"Suguram");
			statement.setInt(3,19);
	        int rows = statement.executeUpdate();
	        System.out.println(rows);
	        if(rows > 0) {
	        	System.out.println("A row has been inserted");
	        }
	        statement.close();
	        connection.close();
		} catch (SQLException e) {
			System.out.println("Something happened");
			e.printStackTrace();
		}

	}

}
