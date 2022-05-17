package net.codejava;
import java.sql.*;
public class Select {
	public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/JDBC";
	String username = "swetha";
	String password ="Swetha@2021";
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,username,password);
		String sql = "SELECT * FROM Student";
		PreparedStatement statement=connection.prepareStatement(sql);
        ResultSet result=statement.executeQuery(sql);
        while(result.next()){
            int id=result.getInt(1);
            String Name = result.getString(2);
            int Age=result.getInt(3);
            System.out.println("StudentId : " +id+ "   " +  "Name : " + Name +"     Age : " +Age);
        }
        connection.close();
	} catch (SQLException | ClassNotFoundException e) {
		System.out.println("Something happened");
		e.printStackTrace();
	}
}
}