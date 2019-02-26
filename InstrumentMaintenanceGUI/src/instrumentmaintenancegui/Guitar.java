/**
 * 
 */
package instrumentmaintenancegui;

/**
 * 
 * @author Coleman Barbour
 */
class Guitar extends Instrument{

    /**
     *  Variable Initializers
     */
    private String stringsLastReplacedDate;
    private String stringsFutureReplacedDate;
    private String lastSetupDate;
    private String lastTrussRodAdjustmentDate;
    private Boolean hasActivePickups;
    private String lastFretboardConditioningDate;
    private String nextFretboardConditiongDate;

    /**
     * Constructor
     */
    public Guitar(){

    }

    /**
     * @return the stringsLastReplacedDate
     */
    public String getStringsLastReplacedDate() {
        return stringsLastReplacedDate;
    }

    /**
     * @param stringsLastReplacedDate the stringsLastReplacedDate to set
     */
    public void setStringsLastReplacedDate(String stringsLastReplacedDate) {
        this.stringsLastReplacedDate = stringsLastReplacedDate;
    }

    /**
     * @return the stringsFutureReplacedDate
     */
    public String getStringsFutureReplacedDate() {
        return stringsFutureReplacedDate;
    }

    /**
     * @param stringsFutureReplacedDate the stringsFutureReplacedDate to set
     */
    public void setStringsFutureReplacedDate(String stringsFutureReplacedDate) {
        this.stringsFutureReplacedDate = stringsFutureReplacedDate;
    }

    /**
     * @return the lastSetupDate
     */
    public String getLastSetupDate() {
        return lastSetupDate;
    }

    /**
     * @param lastSetupDate the lastSetupDate to set
     */
    public void setLastSetupDate(String lastSetupDate) {
        this.lastSetupDate = lastSetupDate;
    }

    /**
     * @return the lastTrussRodAdjustmentDate
     */
    public String getLastTrussRodAdjustmentDate() {
        return lastTrussRodAdjustmentDate;
    }

    /**
     * @param lastTrussRodAdjustmentDate the lastTrussRodAdjustmentDate to set
     */
    public void setLastTrussRodAdjustmentDate(String lastTrussRodAdjustmentDate) {
        this.lastTrussRodAdjustmentDate = lastTrussRodAdjustmentDate;
    }

    /**
     * @return the hasActivePickups
     */
    public Boolean getHasActivePickups() {
        return hasActivePickups;
    }

    /**
     * @param hasActivePickups the hasActivePickups to set
     */
    public void setHasActivePickups(Boolean hasActivePickups) {
        this.hasActivePickups = hasActivePickups;
    }

    /**
     * @return the lastFretboardConditioningDate
     */
    public String getLastFretboardConditioningDate() {
        return lastFretboardConditioningDate;
    }

    /**
     * @param lastFretboardConditioningDate the lastFretboardConditioningDate to set
     */
    public void setLastFretboardConditioningDate(String lastFretboardConditioningDate) {
        this.lastFretboardConditioningDate = lastFretboardConditioningDate;
    }

    /**
     * @return the nextFretboardConditiongDate
     */
    public String getNextFretboardConditiongDate() {
        return nextFretboardConditiongDate;
    }

    /**
     * @param nextFretboardConditiongDate the nextFretboardConditiongDate to set
     */
    public void setNextFretboardConditiongDate(String nextFretboardConditiongDate) {
        this.nextFretboardConditiongDate = nextFretboardConditiongDate;
    }

}