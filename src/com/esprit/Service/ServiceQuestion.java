/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Service;

import com.esprit.utils.DataBase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MKadmin
 */
public class ServiceQuestion {

    private Connection con = DataBase.getInstance().getConnection();
    private Statement ste;

    public ServiceQuestion() {
        try {
            ste = con.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

//    public String afficheQuestion() {
//        String Qu = null;
//        try {
//            ResultSet rs = ste.executeQuery("select * from Question where Q_id=1 ;");
//            while (rs.next()) {
//                Qu = rs.getString(2);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        return Qu;
//    }
//
//    public String afficheQuestion2() {
//        String Qu = null;
//        try {
//            ResultSet rs = ste.executeQuery("select * from Question where Q_id=2 ;");
//            while (rs.next()) {
//                Qu = rs.getString(2);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        return Qu;
//    }
//
//    public String afficheQuestion3() {
//        String Qu = null;
//        try {
//            ResultSet rs = ste.executeQuery("select * from Question where Q_id=2 ;");
//            while (rs.next()) {
//                Qu = rs.getString(2);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        return Qu;
//    }
    
    public int NbreQuestion () {
        int nbr=0 ;
     try {
            ResultSet rs = ste.executeQuery("select count(*) from Question  ;");
            while (rs.next()) {
                nbr= rs.getInt(1) ;
            }
    } catch (SQLException ex) {
            System.out.println(ex);
        }
     return nbr ;
    }
     public void AjoutQuestion( int i, String Question){
        try {
            ste.executeUpdate("insert into Question values ('"+(i+1)+"','"+Question+"') ;");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
     
     }
     
    public String TestafficheQ(int i) {
        String question = "";

//        switch (i) {
//            case 1:
                try {
                    
            ResultSet rs = ste.executeQuery("select * from Question where Q_id="+i+" ;");
            while (rs.next()) {
                question = rs.getString(2);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
                
//                //question = "Question loula";
//                break;
//            case 2:
//                question = "Question thenia";
//                break;
//            case 3:
//                question = "Question theltha";
//                break;
//            case 4:
//                question = "Question 4";
//                break;
//            case 5:
//                question = "Question 5";
//                break;
//            case 6:
//                question = "Question 6";
//                break;
//            case 7:
//                question = "Question 7";
//                break;
//            case 8:
//                question = "Question 8";
//                break;
//            case 9:
//                question = "Question 9";
//                break;
//            case 10:
//                question = "Question 10";
//                break;

          //  default:

        

        return question;
    }
}
