package net.codejava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class resultset {
    public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "swetha";
		String password ="Swetha@2021";
		try {
			Connection connection = DriverManager.getConnection(url,username,password);
			String sql = "select*from example";
			PreparedStatement statement=connection.prepareStatement(sql);
            ResultSet result=statement.executeQuery(sql);
            while(result.next()){
                int id=result.getInt(1);
                String Name = result.getString(2);
                int Age=result.getInt(3);
                System.out.println("Employees "+id+ " " +  "Name :" + Name +" Age :" +Age);
            }
	        connection.close();
		} catch (SQLException e) {
			System.out.println("Something happened");
			e.printStackTrace();
		}

	}
}
