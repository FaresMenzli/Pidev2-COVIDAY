/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.esprit.Entite.Question ;
        import com.esprit.Service.ServiceQuestion ;
package com.esprit.Test;
import com.esprit.Entite.TestDepistage;
import com.esprit.Service.ServiceTestDepistage;
import com.esprit.utils.* ;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
        

/**
 *
 * @author MKadmin
 */
public class Test {
    public static void main(String[] args) {
          /* DataBase db1= DataBase.getInstance();
            DataBase db2=DataBase.getInstance();
            
            System.out.println(db1);
            System.out.println(db2);
            Connection con1=DataBase.getInstance().getConnection();
            System.out.println(con1);*/ // pour test
        
        
        ServiceTestDepistage ser=new ServiceTestDepistage();
        TestDepistage TD1 = new TestDepistage (0,0,0,0) ;
        
        try {
            boolean t=ser.ajouter(TD1) ;
            System.out.println(TD1);
            
           
          
        } catch (SQLException ex) {
            System.out.println(ex);        }
        
        try {
            List<TestDepistage> list=ser.readAll();
            System.out.println(list);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
      //  String Qu.afficheQuestion ();
        
        
    }
}
