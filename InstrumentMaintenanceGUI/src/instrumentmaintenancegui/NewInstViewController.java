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
import instrumentmaintenancegui.Instrument;
import javafx.scene.control.TextField;

/**
 *
 * @author Coleman Barbour
 */
public class NewInstViewController implements Initializable {

    @FXML ChoiceBox instrumentConditionChoiceBox;
    User current;
    Instrument tempIns;
    Guitar tempGtr;
    Acoustic tempAGtr;
    Electric tempEGtr;
    Bass tempBGtr;
    
    @FXML ChoiceBox instrumentTypeChoiceBox1;
    @FXML ChoiceBox guitarTypeChoiceBox11;
    @FXML TextField instNameTextField;
    @FXML TextField manuYearTextField;
    @FXML TextField purchaseDate;
    
    @FXML
    private void handleNewInstViewExitlButtonPressed(ActionEvent event) throws IOException {
    
        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
        
    }
    
    @FXML
    private void handleAddButtonPressed(ActionEvent event) throws IOException {
        System.out.println("Add Instrument");
        
        
        if(instrumentTypeChoiceBox1.getValue() == "INSTRUMENT_GUITAR" && guitarTypeChoiceBox11.getValue() == ""){
            this.tempGtr.setType(1);
            this.tempGtr.setCondition(Integer.parseInt(instrumentConditionChoiceBox.getValue().toString()));
            this.tempGtr.setName(instNameTextField.getText());
            this.tempGtr.setManufacturingYear(Integer.parseInt(manuYearTextField.getText()));
            this.tempGtr.setPurchaseDate(purchaseDate.getText());
            
            this.current.getInstrumentList().add(tempGtr);
            this.tempGtr.setInstrumentId(current.getInstrumentList().indexOf(this.tempGtr));
            
          
        } else if (instrumentTypeChoiceBox1.getValue() == "INSTRUMENT_GUITAR" && guitarTypeChoiceBox11.getValue() == "Acoustic"){
            this.tempAGtr.setType(1);
            this.tempAGtr.setCondition(Integer.parseInt(instrumentConditionChoiceBox.getValue().toString()));
            this.tempAGtr.setName(instNameTextField.getText());
            this.tempAGtr.setManufacturingYear(Integer.parseInt(manuYearTextField.getText()));
            this.tempAGtr.setPurchaseDate(purchaseDate.getText());
          
            this.current.getInstrumentList().add(tempAGtr);
            this.tempAGtr.setInstrumentId(current.getInstrumentList().indexOf(this.tempAGtr));
            
        } else if (instrumentTypeChoiceBox1.getValue() == "INSTRUMENT_GUITAR" && guitarTypeChoiceBox11.getValue() == "Electric"){
            this.tempEGtr.setType(1);
            this.tempEGtr.setCondition(Integer.parseInt(instrumentConditionChoiceBox.getValue().toString()));
            this.tempEGtr.setName(instNameTextField.getText());
            this.tempEGtr.setManufacturingYear(Integer.parseInt(manuYearTextField.getText()));
            this.tempEGtr.setPurchaseDate(purchaseDate.getText());
          
            this.current.getInstrumentList().add(tempEGtr);
            this.tempEGtr.setInstrumentId(current.getInstrumentList().indexOf(this.tempEGtr));
            
        } else if (instrumentTypeChoiceBox1.getValue() == "INSTRUMENT_GUITAR" && guitarTypeChoiceBox11.getValue() == "Bass"){
            this.tempBGtr.setType(1);
            this.tempBGtr.setCondition(Integer.parseInt(instrumentConditionChoiceBox.getValue().toString()));
            this.tempBGtr.setName(instNameTextField.getText());
            this.tempBGtr.setManufacturingYear(Integer.parseInt(manuYearTextField.getText()));
            this.tempBGtr.setPurchaseDate(purchaseDate.getText());
          
            this.current.getInstrumentList().add(tempBGtr);
            this.tempBGtr.setInstrumentId(current.getInstrumentList().indexOf(this.tempBGtr));
            
        } else if(instrumentTypeChoiceBox1.getValue() == "INSTRUMENT_OTHER" && guitarTypeChoiceBox11.getValue() == ""){
            this.tempIns.setType(2);
            this.tempIns.setCondition(Integer.parseInt(instrumentConditionChoiceBox.getValue().toString()));
            this.tempIns.setName(instNameTextField.getText());
            this.tempIns.setManufacturingYear(Integer.parseInt(manuYearTextField.getText()));
            this.tempIns.setPurchaseDate(purchaseDate.getText());
          
            this.current.getInstrumentList().add(tempIns);
            this.tempIns.setInstrumentId(current.getInstrumentList().indexOf(this.tempIns));
            
        } else {
            this.tempGtr.setType(1);
            this.tempGtr.setCondition(Integer.parseInt(instrumentConditionChoiceBox.getValue().toString()));
            this.tempGtr.setName(instNameTextField.getText());
            this.tempGtr.setManufacturingYear(Integer.parseInt(manuYearTextField.getText()));
            this.tempGtr.setPurchaseDate(purchaseDate.getText());
            
            this.current.getInstrumentList().add(tempGtr);
            this.tempGtr.setInstrumentId(current.getInstrumentList().indexOf(this.tempGtr));
            
          
        }
        

        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        
        instrumentConditionChoiceBox.getItems().addAll(1, 2, 3);
        instrumentTypeChoiceBox1.getItems().addAll("INSTRUMENT_GUITAR", "INSTRUMENT_OTHER");
        guitarTypeChoiceBox11.getItems().addAll("Acoustic", "Electric", "Bass");
        this.current = InstrumentMaintenanceGUI.users.get(TitleViewController.selectedUser);
        
        this.tempAGtr = new Acoustic();
        this.tempBGtr = new Bass();
        this.tempEGtr = new Electric();
        this.tempGtr = new Guitar();
        this.tempIns = new Instrument();
    }    
    
}
