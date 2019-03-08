/**
 * 
 */
package instrumentmaintenancegui;

import java.io.Serializable;

/**
 * 
 * @author Coleman Barbour
 */
class Instrument implements Serializable{
    
    /**
     * Variable Initializers
     */
    private int manufacturingYear;
    private int condition;
    private int instrumentId;
    private int careRating = 0;
    private String name;
    private int type;
    private String purchaseDate;

    /**
     * An Enum to define the type of instrument
     */
    private enum instrument_type { INSTRUMENT_GUITAR, INSTRUMENT_OTHER };

    /**
     * Constructor
     */
    public Instrument(){
       // System.out.println("Instrument zero arg constructor.");
    }
    
    /**
     * @return the manufacturingYear
     */
    public int getManufacturingYear() {
        return manufacturingYear;
    }

    /**
     * @param manufacturingYear the manufacturingYear to set
     */
    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    /**
     * @return the condition
     */
    public int getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(int condition) {
        this.condition = condition;
    }

    /**
     * @return the instrumentId
     */
    public int getInstrumentId() {
        return instrumentId;
    }

    /**
     * @param instrumentId the instrumentId to set
     */
    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    /**
     * @return the careRating
     */
    public int getCareRating() {
        return careRating;
    }

    /**
     * @param careRating the careRating to set
     */
    public void setCareRating(int careRating) {
        this.careRating = careRating;
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
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * @return the purchaseDate
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * @param purchaseDate the purchaseDate to set
     */
    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
}