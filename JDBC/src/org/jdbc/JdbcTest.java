package org.jdbc;

import java.sql.*;

public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        try {
            String url="jdbc:mysql://localhost:3306/sridhar";
            String userName="hari";
            String password="ponsmahi1";
            Connection connect = DriverManager.getConnection(url,userName,password);
            if(!connect.equals(false)) {
                System.out.println("connection success");
                Statement statement= connect.createStatement();
                ResultSet resultSet=statement.executeQuery("select * from school");
                while (resultSet.next()){
                    System.out.print(resultSet.getString("id")+" ");
                    System.out.print(resultSet.getString("name")+"\n");
                }
                System.out.println("After inserting values");
                statement.executeUpdate("insert into school values(4,'ragav')");
                while (resultSet.next()){
                    System.out.print(resultSet.getString("id")+" ");
                    System.out.print(resultSet.getString("name")+"\n");
                }
                connect.close();
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
}