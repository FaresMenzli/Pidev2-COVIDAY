/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.Test;
import com.esprit.utils.* ;
import GUI.TestDepFXMLController;
//import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;

import javafx.stage.Stage;
import javax.swing.text.html.StyleSheet;

/**
 *
 * @author MKadmin
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/GUI/TestDepFXML.fxml"));
            Scene scene = new Scene(root) ;
            
            primaryStage.setScene(scene);
         primaryStage.setTitle("Test de despistage");
            primaryStage.getIcons().add(new Image("icon2.png"));
           // scene.getStylesheets().add();
            //scene.getStyleSheets().add("DarkTheme") ;
            primaryStage.show();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
