/**
 * 
 */
package instrumentmaintenancegui;

import java.io.Serializable;

/**
 * 
 * @author Coleman Barbour
 */
class Acoustic extends Guitar implements Serializable{
    
    /**
     * Variable Initializers
     */
    private String humidificationType;
    private int humidificationDate;

    /**
     * An Enum to define the type of humidification
     */
    private enum HumidificationType{ NONE, DAMP_IT, CLIMATE_CONTROL, HYDRO_PACKS };

    /**
     * Constructor
     */
    public Acoustic(){

    }

    /**
     * @return the humidificationType
     */
    public String getHumidificationType() {
        return humidificationType;
    }

    /**
     * @param humidificationType the humidificationType to set
     */
    public void setHumidificationType(String humidificationType) {
        this.humidificationType = humidificationType;
    }

    /**
     * @return the humidificationDate
     */
    public int getHumidificationDate() {
        return humidificationDate;
    }

    /**
     * @param humidificationDate the humidificationDate to set
     */
    public void setHumidificationDate(int humidificationDate) {
        this.humidificationDate = humidificationDate;
    }
}