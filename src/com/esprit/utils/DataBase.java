/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MKadmin
 */
public class DataBase {
    private Connection con;
    private static DataBase db ;
   private  String url="jdbc:mysql://localhost:3306/coviday";
    private String login="root";
    private String pwd="";
   
    private DataBase () {
        
        try {
            con=DriverManager.getConnection(url,login,pwd) ;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }

 
    
    public Connection getConnection(){
       
        return con ;
        
    }
    public static DataBase getInstance (){
    
        if (db == null)
            db= new DataBase();
        return db ;
    
    }
    
}
