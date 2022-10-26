package org.electricity;
import java.sql.Connection;
import java.sql.Statement;

import java.sql.DriverManager;

public class Conn {

    Connection c;
    Statement s;

    public Conn(){

        String url = "jdbc:postgresql://lucky.db.elephantsql.com:5432/zijcdqic";
        String username = "zijcdqic";
        String password = "pa1RS5bN0ie3FVb3xwQ5wouC8_sPcJ4d";
        try{
            Class.forName("com.mysql.jdbc.Driver");

            c =DriverManager.getConnection(url,username,password);
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
