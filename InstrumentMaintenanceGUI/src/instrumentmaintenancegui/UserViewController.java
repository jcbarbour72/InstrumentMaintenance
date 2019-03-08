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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import instrumentmaintenancegui.Acoustic;
import instrumentmaintenancegui.Electric;
import instrumentmaintenancegui.Bass;
import instrumentmaintenancegui.Instrument;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javafx.scene.control.CheckBox;


/**
 *
 * @author Coleman Barbour
 */
public class UserViewController implements Initializable {

    @FXML TextField newUserUsernameTextField;
    @FXML Label userLabel;
    @FXML ListView instrumentTableListView;
    @FXML Label guitarType;
    @FXML Label InstrumentId;
    @FXML TextField instDetailsName12;
    @FXML TextField instDetailsMfrYear;
    @FXML TextField bassStyleText;
    @FXML Label bassStyleLabel;
    @FXML TextField numberStringsText;
    @FXML Label numberStringsLabel;
    @FXML TextField instCondition;
    @FXML Label intonationLabel;
    @FXML TextField intonationTextField;
    @FXML TextField humidDate;
    @FXML TextField humidType;
    @FXML TextField stringsLastReplacedText;
    @FXML TextField stringsFutureReplaceText;
    @FXML TextField lastSetupDateText;
    @FXML TextField trussRodAdjustText;
    @FXML CheckBox hasActivePickups;
    @FXML TextField fretBoardCondDateText;
    @FXML TextField nextConditionDate;
    @FXML TextField purchaseDateText;
    
 
    // The currently selected user
    User current;
    // A temporary Instrument List
    ArrayList<? extends Instrument> tempInstList = new ArrayList<>();
    // The currently selected instrument
    Instrument currentInstrumentSelection;
    
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
        // Delete the selected instrument
        int deleteIndex = instrumentTableListView.getSelectionModel().getSelectedIndex();
        tempInstList = this.current.getInstrumentList();
        tempInstList.remove(deleteIndex);
        
        // Re layout the view since the instrument has been deleted with a new list
        Stage stage = InstrumentMaintenanceGUI.currentStage;
        
        Pane root = FXMLLoader.load(getClass().getResource("UserView.fxml"));
        InstrumentMaintenanceGUI.scene = new Scene(root);
        
        stage.setScene(InstrumentMaintenanceGUI.scene);
        stage.show();
    }
    
    @FXML
    public void handleUserViewSaveEditsButton(ActionEvent event) throws FileNotFoundException, IOException{
        if(currentInstrumentSelection instanceof Acoustic){
            System.out.println("Acoustic");
            Acoustic thisAC = (Acoustic) currentInstrumentSelection;
            
            /**
            * Set the guitar details
            */
            thisAC.setManufacturingYear(Integer.parseInt(instDetailsMfrYear.getText()));
            thisAC.setCondition(Integer.parseInt(instCondition.getText()));
            thisAC.setStringsLastReplacedDate(stringsLastReplacedText.getText());
            thisAC.setStringsLastReplacedDate(stringsFutureReplaceText.getText());
            thisAC.setLastSetupDate(lastSetupDateText.getText());
            thisAC.setLastTrussRodAdjustmentDate(trussRodAdjustText.getText());
            thisAC.setHasActivePickups(hasActivePickups.isSelected());
            thisAC.setLastFretboardConditioningDate(fretBoardCondDateText.getText());
            thisAC.setNextFretboardConditiongDate(nextConditionDate.getText());
            thisAC.setPurchaseDate(purchaseDateText.getText());


           /**
            * Set the type specific variables for this instrument
            */
           thisAC.setHumidificationDate(Integer.parseInt(humidDate.getText()));
           thisAC.setHumidificationType(humidType.getText());
           
            
        } else if(currentInstrumentSelection instanceof Electric){
            System.out.println("Electric");
            Electric thisEG = (Electric) currentInstrumentSelection;
            
            /**
            * Set the guitar details
            */
            thisEG.setManufacturingYear(Integer.parseInt(instDetailsMfrYear.getText()));
            thisEG.setCondition(Integer.parseInt(instCondition.getText()));
            thisEG.setStringsLastReplacedDate(stringsLastReplacedText.getText());
            thisEG.setStringsLastReplacedDate(stringsFutureReplaceText.getText());
            thisEG.setLastSetupDate(lastSetupDateText.getText());
            thisEG.setLastTrussRodAdjustmentDate(trussRodAdjustText.getText());
            thisEG.setHasActivePickups(hasActivePickups.isSelected());
            thisEG.setLastFretboardConditioningDate(fretBoardCondDateText.getText());
            thisEG.setNextFretboardConditiongDate(nextConditionDate.getText());
            thisEG.setPurchaseDate(purchaseDateText.getText());
            
            /**
            * Set the type specific variables for this instrument
            */
            thisEG.setIntonationSetDate(intonationTextField.getText());
            
        } else if(currentInstrumentSelection instanceof Bass){
            System.out.println("Bass");
            Bass thisB = (Bass) currentInstrumentSelection;
            
            /**
            * Set the guitar details
            */
            thisB.setManufacturingYear(Integer.parseInt(instDetailsMfrYear.getText()));
            thisB.setCondition(Integer.parseInt(instCondition.getText()));
            thisB.setStringsLastReplacedDate(stringsLastReplacedText.getText());
            thisB.setStringsLastReplacedDate(stringsFutureReplaceText.getText());
            thisB.setLastSetupDate(lastSetupDateText.getText());
            thisB.setLastTrussRodAdjustmentDate(trussRodAdjustText.getText());
            thisB.setHasActivePickups(hasActivePickups.isSelected());
            thisB.setLastFretboardConditioningDate(fretBoardCondDateText.getText());
            thisB.setNextFretboardConditiongDate(nextConditionDate.getText());
            thisB.setPurchaseDate(purchaseDateText.getText());
            
            /**
             * Set the Bass details
             */
            thisB.setStyle(bassStyleText.getText());
            thisB.setStringCount(Integer.parseInt(numberStringsText.getText()));
            
        } else{
            System.out.println("Guitar");
            Guitar thisGT = (Guitar) currentInstrumentSelection;
            
            /**
            * Set the guitar details
            */
            thisGT.setManufacturingYear(Integer.parseInt(instDetailsMfrYear.getText()));
            thisGT.setCondition(Integer.parseInt(instCondition.getText()));
            thisGT.setStringsLastReplacedDate(stringsLastReplacedText.getText());
            thisGT.setStringsLastReplacedDate(stringsFutureReplaceText.getText());
            thisGT.setLastSetupDate(lastSetupDateText.getText());
            thisGT.setLastTrussRodAdjustmentDate(trussRodAdjustText.getText());
            thisGT.setHasActivePickups(hasActivePickups.isSelected());
            thisGT.setLastFretboardConditioningDate(fretBoardCondDateText.getText());
            thisGT.setNextFretboardConditiongDate(nextConditionDate.getText());
            thisGT.setPurchaseDate(purchaseDateText.getText());
            
            
        }
        
                try {
                    System.out.println("Trying Serialization");
			// write object to file
			FileOutputStream fos = new FileOutputStream("InstMntTrkr.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(InstrumentMaintenanceGUI.users);
			oos.close();

			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
                
                System.out.println("Finished Serialization");
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set up the current user and instrument list
        this.current = InstrumentMaintenanceGUI.users.get(TitleViewController.selectedUser);
        userLabel.setText(this.current.toChoiceBoxString().substring(4)+"'s Instruments");
        tempInstList = this.current.getInstrumentList();
        
        // Convert Instrument List to a string list for table
        ArrayList<String> stringList = new ArrayList<>();
        for(int i = 0; i < tempInstList.size(); i++){
            stringList.add(tempInstList.get(i).getName());
        }
        
        // Add the instruments to the list in the table
        instrumentTableListView.getItems().addAll(stringList);
        
        // Set a selection listner for the Instrument List
        instrumentTableListView.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<String>() {
					public void changed(
							ObservableValue<? extends String> observable,
							String oldValue, String newValue) {
                                            
                                            int instToIndex = stringList.indexOf(newValue);
                                            currentInstrumentSelection = tempInstList.get(instToIndex);
                                            
                                            System.out.println(currentInstrumentSelection.toString());

                                            
                                            
                                            

                                            /**
                                             * Check the instrument type and set the global settings variables for the view
                                             */
                                            if(currentInstrumentSelection instanceof Acoustic){
                                                System.out.println("I'm Class " + currentInstrumentSelection.getClass().getSimpleName());
                                                Acoustic thisAC = (Acoustic) currentInstrumentSelection;
                                                int tmpHumidType;
                                               
                                                /**
                                                 * Remove Items that don't apply
                                                 */
                                                bassStyleText.setVisible(false);
                                                numberStringsLabel.setVisible(false);
                                                numberStringsText.setVisible(false);
                                                bassStyleLabel.setVisible(false);
                                                intonationLabel.setVisible(false);
                                                intonationTextField.setVisible(false);
                                                humidDate.setVisible(true);
                                                humidType.setVisible(true);
                                                
                                                /**
                                                 * Set the guitar details
                                                 */
                                                guitarType.setText("Acoustic");
                                                InstrumentId.setText(Integer.toString(thisAC.getInstrumentId()));
                                                instDetailsName12.setText(thisAC.getName());
                                                purchaseDateText.setText(thisAC.getPurchaseDate());
                                                instDetailsMfrYear.setText(Integer.toString(thisAC.getManufacturingYear()));
                                                instCondition.setText(Integer.toString(thisAC.getCondition()));
                                                stringsLastReplacedText.setText(thisAC.getStringsLastReplacedDate());
                                                stringsFutureReplaceText.setText(thisAC.getStringsFutureReplacedDate());
                                                lastSetupDateText.setText(thisAC.getLastSetupDate());
                                                trussRodAdjustText.setText(thisAC.getLastTrussRodAdjustmentDate());
                                                hasActivePickups.setSelected(thisAC.getHasActivePickups());
                                                fretBoardCondDateText.setText(thisAC.getLastFretboardConditioningDate());
                                                nextConditionDate.setText(thisAC.getNextFretboardConditiongDate());


                                                
                                                /**
                                                 * Set the type specific variables for this instrument
                                                 */
                                                humidDate.setText(Integer.toString(thisAC.getHumidificationDate()));
                                                humidType.setText(thisAC.getHumidificationType());
                                                                                             
                                                    
                                            } else if(currentInstrumentSelection instanceof Electric){
                                                System.out.println("I'm Class " + currentInstrumentSelection.getClass().getSimpleName());
                                                Electric thisEG = (Electric) currentInstrumentSelection;
                                                
                                                /**
                                                 * Remove Items that don't apply
                                                 */
                                                bassStyleText.setVisible(false);
                                                bassStyleLabel.setVisible(false);
                                                numberStringsLabel.setVisible(false);
                                                numberStringsText.setVisible(false);
                                                intonationLabel.setVisible(true);
                                                intonationTextField.setVisible(true);
                                                humidDate.setVisible(false);
                                                humidType.setVisible(false);
                                                
                                                /**
                                                 * Set the guitar details
                                                 */
                                                guitarType.setText("Electric");
                                                InstrumentId.setText(Integer.toString(thisEG.getInstrumentId()));
                                                instDetailsName12.setText(thisEG.getName());
                                                purchaseDateText.setText(thisEG.getPurchaseDate());
                                                instDetailsMfrYear.setText(Integer.toString(thisEG.getManufacturingYear()));
                                                instCondition.setText(Integer.toString(thisEG.getCondition()));
                                                stringsLastReplacedText.setText(thisEG.getStringsLastReplacedDate());
                                                stringsFutureReplaceText.setText(thisEG.getStringsFutureReplacedDate());
                                                lastSetupDateText.setText(thisEG.getLastSetupDate());
                                                trussRodAdjustText.setText(thisEG.getLastTrussRodAdjustmentDate());
                                                hasActivePickups.setIndeterminate(thisEG.getHasActivePickups());
                                                fretBoardCondDateText.setText(thisEG.getLastFretboardConditioningDate());
                                                nextConditionDate.setText(thisEG.getNextFretboardConditiongDate());


                                                
                                                /**
                                                 * Set the type specific variables for this instrument
                                                 */
                                                intonationTextField.setText(thisEG.getIntonationSetDate()); 
                                                
                                            } else if(currentInstrumentSelection instanceof Bass){
                                                System.out.println("I'm Class " + currentInstrumentSelection.getClass().getSimpleName());
                                                Bass thisB = (Bass) currentInstrumentSelection;
                                                
                                                /**
                                                 * Remove Items that don't apply
                                                 */
                                                bassStyleText.setVisible(true);
                                                bassStyleLabel.setVisible(true);
                                                numberStringsLabel.setVisible(true);
                                                numberStringsText.setVisible(true);
                                                intonationLabel.setVisible(false);
                                                intonationTextField.setVisible(false);
                                                humidDate.setVisible(false);
                                                humidType.setVisible(false);
                                                
                                                /**
                                                 * Set the guitar details
                                                 */
                                                guitarType.setText("Bass");
                                                InstrumentId.setText(Integer.toString(thisB.getInstrumentId()));
                                                instDetailsName12.setText(thisB.getName());
                                                purchaseDateText.setText(thisB.getPurchaseDate());
                                                instDetailsMfrYear.setText(Integer.toString(thisB.getManufacturingYear()));
                                                instCondition.setText(Integer.toString(thisB.getCondition()));
                                                stringsLastReplacedText.setText(thisB.getStringsLastReplacedDate());
                                                stringsFutureReplaceText.setText(thisB.getStringsFutureReplacedDate());
                                                lastSetupDateText.setText(thisB.getLastSetupDate());
                                                trussRodAdjustText.setText(thisB.getLastTrussRodAdjustmentDate());
                                                hasActivePickups.setIndeterminate(thisB.getHasActivePickups());
                                                fretBoardCondDateText.setText(thisB.getLastFretboardConditioningDate());
                                                nextConditionDate.setText(thisB.getNextFretboardConditiongDate());


                                                
                                                /**
                                                 * Set the type specific variables for this instrument
                                                 */
                                                bassStyleText.setText(thisB.getStyle());
                                                numberStringsText.setText(Integer.toString(thisB.getStringCount()));

                                            }else{
                                                System.out.println("I'm Class " + currentInstrumentSelection.getClass().getSimpleName());
                                                Guitar thisGT = (Guitar) currentInstrumentSelection;
                                               
                                                /**
                                                 * Remove Items that don't apply
                                                 */
                                                bassStyleText.setVisible(false);
                                                bassStyleLabel.setVisible(false);
                                                numberStringsLabel.setVisible(false);
                                                numberStringsText.setVisible(false);
                                                intonationLabel.setVisible(false);
                                                intonationTextField.setVisible(false);
                                                humidDate.setVisible(false);
                                                humidType.setVisible(false);
                                                
                                                /**
                                                 * Set the guitar details
                                                 */
                                                guitarType.setText("Guitar");
                                                InstrumentId.setText(Integer.toString(thisGT.getInstrumentId()));
                                                instDetailsName12.setText(thisGT.getName());
                                                purchaseDateText.setText(thisGT.getPurchaseDate());
                                                instDetailsMfrYear.setText(Integer.toString(thisGT.getManufacturingYear()));
                                                instCondition.setText(Integer.toString(thisGT.getCondition()));
                                                stringsLastReplacedText.setText(thisGT.getStringsLastReplacedDate());
                                                stringsFutureReplaceText.setText(thisGT.getStringsFutureReplacedDate());
                                                lastSetupDateText.setText(thisGT.getLastSetupDate());
                                                trussRodAdjustText.setText(thisGT.getLastTrussRodAdjustmentDate());
                                                hasActivePickups.setIndeterminate(thisGT.getHasActivePickups());
                                                fretBoardCondDateText.setText(thisGT.getLastFretboardConditioningDate());
                                                nextConditionDate.setText(thisGT.getNextFretboardConditiongDate());

                                            }
                                        }
                                        
                                       
                                        
				});
        
        
    }    
    
}
