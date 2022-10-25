package org.electricity;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbFunctions {
    //public Connection connect_to_db(String dbname,String user,String pass){
    public Connection connect_to_db(){

        Connection conn=null;
        String username = "zijcdqic";
        String password = "pa1RS5bN0ie3FVb3xwQ5wouC8_sPcJ4d";
        String url = "jdbc:postgresql://lucky.db.elephantsql.com:5432/zijcdqic";
        try {
            Class.forName("org.postgresql.Driver:42.5.0");
            //conn= DriverManager.getConnection("jdbc:postgresql://lucky.db.elephantsql.com:5432/"+dbname,user,pass);
            conn= DriverManager.getConnection(url, username, password);
            System.out.println(conn);
            if (conn != null){
                System.out.println("Connection to DB is OK");
            }
            else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }
}
