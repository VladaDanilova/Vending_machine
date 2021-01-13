/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author vladadanilova
 */
public class JavaFXApp extends Application {
    
   public static Group root = new Group();
    
    @Override
    public void start(Stage primaryStage) {
        
        //экземпляр еды
        Food F = new Food();
        //экземпляр платежа
        Card ca = new Card();
        Scene scene = new Scene(root, 700, 1000);
        Blocks bl = new Blocks(0,0,F,ca);
        
        primaryStage.setTitle("Автомат с едой");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
