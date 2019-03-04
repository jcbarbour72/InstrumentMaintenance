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

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Coleman Barbour
 */
public class NewUserViewController implements Initializable {

    @FXML TextField newUserUsernameTextField;
    
    @FXML
    private void handleNewUserCreateButtonPressed(ActionEvent event) throws IOException {
        String username;
        username = newUserUsernameTextField.getText();
        int curIndex;
        curIndex = InstrumentMaintenanceGUI.users.size();
        
        User addUserTemp = new User(username,curIndex);
        //System.out.println(addUserTemp.toChoiceBoxString());
        InstrumentMaintenanceGUI.users.add(addUserTemp);
        addUserTemp = null;
        //System.out.println(addUserTemp.toChoiceBoxString());
        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("TitleView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
        
    }
    
    @FXML
    private void handNewUserCancelButtonPressed(ActionEvent event) {
        System.out.println("Cancel");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
