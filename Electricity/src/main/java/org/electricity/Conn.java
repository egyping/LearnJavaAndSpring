package org.electricity;

//import java.sql.*;


import java.sql.Connection;

public class Conn{
//    Connection c;
//    Statement s;

    public Connection Conn(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///ebs","root","mysql123");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}