/**
 * 
 */
package instrumentmaintenancegui;

/**
 * 
 * @author Coleman Barbour
 */
class Bass extends Guitar{

    /**
     * Variable Initializers
     */
    private int style;
    private int stringCount;

    /**
     * An Enum to set the style of Bass
     */
    private enum BassStyle { BASS_PRECISION, BASS_JAZZ, BASS_OTHER };
    /**
     * An Enum to set the number of strings
     */
    private enum NumberStrings { BASS_STRING_4, BASS_STRING_5, BASS_STRING_5_PLUS }; 
    
    /**
     * Constructor
     */
    public Bass(){
        
    }

    /**
     * @return the style
     */
    public int getStyle() {
        return style;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(int style) {
        this.style = style;
    }

    /**
     * @return the stringCount
     */
    public int getStringCount() {
        return stringCount;
    }

    /**
     * @param stringCount the stringCount to set
     */
    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }
}