package net.codejava;
import java.sql.*;
public class Insert {
       public static void main(String[] args) {
		        String url="jdbc:mysql://localhost:3306/JDBC";
		        String username ="swetha";
		        String password="Swetha@2021";
		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
					Connection connection = DriverManager.getConnection(url,username,password);
					String sql = "INSERT INTO Student VALUES(?,?,?)";
					PreparedStatement statement=connection.prepareStatement(sql);
		            statement.setInt(1, 7);
					statement.setString(2,"Suguram");
					statement.setInt(3,20);
			        int rows = statement.executeUpdate();
			        System.out.println(rows);
			        if(rows > 0) {
			        	System.out.println("A row has been inserted");
			        }
			        statement.close();
			        connection.close();
				} catch (SQLException | ClassNotFoundException e) {
					System.out.println("Something happened");
					e.printStackTrace();
				}
		        
		        }  

	}


