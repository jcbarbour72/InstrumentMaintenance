/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentmaintenancegui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Coleman Barbour
 */
public class UserViewController implements Initializable {

    @FXML TextField newUserUsernameTextField;
    @FXML Label userLabel;
    @FXML ListView instrumentTableListView;
    
    User current;
    ArrayList<Instrument> tempInstList = new ArrayList<>();
    
    @FXML
    private void handleUserViewExitlButtonPressed(ActionEvent event) throws IOException {
    
        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("TitleView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
        
    }
    
    @FXML
    private void handleNewInstButtonPressed(ActionEvent event) throws IOException {
        System.out.println("New Instrument");
        
        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("NewInstView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
        
        
    }
    
    @FXML
    private void handleUserViewDeleteButtonPressed(ActionEvent event) throws IOException {
        System.out.println("Delete Instrument");
        int deleteIndex = instrumentTableListView.getSelectionModel().getSelectedIndex();
        // TODO: Add ListSelectionListener to store the index of the object selected...
        tempInstList = this.current.getInstrumentList();
        tempInstList.remove(deleteIndex);
        
        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.current = InstrumentMaintenanceGUI.users.get(TitleViewController.selectedUser);
        userLabel.setText(this.current.toChoiceBoxString().substring(4)+"'s Instruments");
        tempInstList = this.current.getInstrumentList();
        
        
        ArrayList<String> stringList = new ArrayList<>();
        for(int i = 0; i < tempInstList.size(); i++){
            stringList.add(tempInstList.get(i).getName());
        }
        
        instrumentTableListView.getItems().addAll(stringList);
        
        
        
    }    
    
}
