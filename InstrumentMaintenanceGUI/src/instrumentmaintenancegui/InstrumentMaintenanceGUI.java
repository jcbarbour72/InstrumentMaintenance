/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentmaintenancegui;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import instrumentmaintenancegui.User;

/**
 *
 * @author Coleman Barbour
 */


public class InstrumentMaintenanceGUI extends Application {
    
    // static User test = new User("Bob", 1);
    public static ArrayList<User> users = new ArrayList<>();
    
    public static Scene scene;
    public static Stage currentStage;
            
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("TitleView.fxml"));
        
        scene = new Scene(root);
        currentStage = stage;
        
        currentStage.setScene(scene);
        currentStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        ArrayList testInstList = new ArrayList();
        Instrument testInstrument = new Instrument();
        testInstList.add(testInstrument);        
        //test.setInstrumentList(testInstList);


        launch(args);
    }
    
}
