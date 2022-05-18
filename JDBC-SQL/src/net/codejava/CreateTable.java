package net.codejava;
import java.sql.*;
public class CreateTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/JDBC";
        String user="swetha";
        String password="Swetha@2021";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            String sql="show tables";
            Statement stmt=connection.createStatement();
            ResultSet result=stmt.executeQuery(sql);
            while(result.next()) {
                String column1 = result.getString(1);
                System.out.println("SHOW TABLES ");
                System.out.println(column1);
                // String column2 = result.getString(2);
                // String column3 = result.getString(3);
                // String column4 = result.getString(4);
                // String column5 = result.getString(5);
                // String column6 = result.getString(6);
                // System.out.println("Field : " +column1+" Type : "+column2 +" Null : " +column3+ " Key : "+column4+" Default : "+column5+ " Extra :" +column6);

            }
            
            System.out.println("Table created...");
        } catch (Exception e) {
            System.out.println("Not created..");
            e.printStackTrace();
        }

    }
}
