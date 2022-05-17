package net.codejava;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Createtable {
public static void main(String[] args) {
String url="jdbc:mysql://localhost:3306/JDBC";
String username ="swetha";
String password="Swetha@2021";
try {
Connection connection = DriverManager.getConnection(url,username,password);
System.out.println(connection);
String sql="CREATE TABLE Employee(id int primary key auto_increment,Name varchar(25),Age tinyint)";
Statement stmt = connection.createStatement();
System.out.println(stmt);
stmt.executeUpdate(sql);
System.out.println("Student table created");
}
catch(SQLException e) {
System.out.println("Not created");
e.printStackTrace();
}
}
}
