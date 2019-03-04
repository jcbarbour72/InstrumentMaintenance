/**
 * 
 */
package instrumentmaintenancegui;

import java.util.ArrayList;

/**
 * 
 * @author Coleman Barbour
 */
class User {

    /**
     * Variable Initializers
     */
    private String name;
    private int idNumber;
    private ArrayList instrumentList;

    /**
     * Two Argument Constructor
     * 
     * @param name The Name of the user as a <code>String<code>
     * @param idNumber The idNumber of the user as a <code>String<code>.
     */
    public User(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.instrumentList = new ArrayList();
    }

    /**
     * Three Argument Constructor
     * 
     * @param name The Name of the user as a <code>String<code>.
     * @param idNumber The idNumberof the user as a <code>idNumber<code>.
     * @param instrumentList The instrument lsit of the user as
     * and <code>ArrayList<code>.
     */
    User(String name, int idNumber, ArrayList instrumentList){
        this.name = name;
        this.idNumber = idNumber;
        this.instrumentList = instrumentList;
    }
    
    public String toChoiceBoxString(){
//        String listContents;
//        
//        if(this.instrumentList.size() > 0){
//            listContents = this.instrumentList.get(idNumber);
//        } else {
//            listContents = "No Instruments added";
//        }
        String message = String.format("%s\t-\t%s", this.idNumber, this.name );   
        return message;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the idNumber
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * @param idNumber the idNumber to set
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * @return the instrumentList
     */
    public ArrayList getInstrumentList() {
        return instrumentList;
    }

    /**
     * @param instrumentList the instrumentList to set
     */
    public void setInstrumentList(ArrayList instrumentList) {
        this.instrumentList = instrumentList;
    }
    
    /**
     * Add and Instrument to the current User.InstrumentList[]
     * 
     */
    public void addInstrument(){
        // Add a new instrement by calling all needed constructors
        // to instantiate a new instuement object of the selected type
        
        Instrument CurrentInstrument = new Instrument();
        getInstrumentList().add(CurrentInstrument);
        
    }
    
    /**
     * Remove a specified instrument from the current
     * <code>User.instrumentList[]<code>.
     * 
     * @param instrumentId The <code>Instrument.instrumentId<code> of the
     * instrument to be removed.
     */
    public void removeInstrumetn(int instrumentId){
        // Get the current User.instrumentList
        ArrayList list = this.getInstrumentList();
        // Search for a matching instrumentId number
        
        // Delete that instrument from list
        
    }

}