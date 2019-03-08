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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Coleman Barbour
 */


public class InstrumentMaintenanceGUI extends Application {
    
    
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
        try {
			

			// read object from file
			FileInputStream fis = new FileInputStream("InstMntTrkr.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			users = (ArrayList) ois.readObject();
			ois.close();


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
       
        
        ArrayList testInstList = new ArrayList();
        Instrument testInstrument = new Instrument();
        testInstList.add(testInstrument);        
        //test.setInstrumentList(testInstList);
        
		       


        launch(args);
    }
    
}
