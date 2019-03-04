/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentmaintenancegui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Coleman Barbour
 */
public class TitleViewController implements Initializable {

    @FXML ChoiceBox mainUserChoiceBox;
    
    @FXML
    private void handleMainUserSelectButtonAction(ActionEvent event) {
        String selection;
        selection = mainUserChoiceBox.getValue().toString();
        System.out.println("User: " + selection);
    }
    
    @FXML
    private void handleMainNewUserButtonAction(ActionEvent event) throws IOException {
        System.out.println("New User");
        
        
        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("NewUserView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        for(int i = 0; i < InstrumentMaintenanceGUI.users.size(); i++){
            mainUserChoiceBox.getItems().add(InstrumentMaintenanceGUI.users.get(i).toChoiceBoxString());
        }
    }    
    
}
