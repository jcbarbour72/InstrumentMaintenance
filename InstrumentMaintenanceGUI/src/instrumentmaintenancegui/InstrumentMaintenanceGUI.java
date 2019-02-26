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

/**
 *
 * @author Coleman Barbour
 */


public class InstrumentMaintenanceGUI extends Application {

    static User test = new User("Default", 1);
            
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList testInstList = new ArrayList();
        Instrument testInstrument = new Instrument();
        testInstList.add(testInstrument);        
        test.setInstrumentList(testInstList);


        launch(args);
    }
    
}
