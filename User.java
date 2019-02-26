import java.util.ArrayList;

class User {

    private String name;
    private Int idNumber;
    private ArrayList instrumentList;

    Instrument.Guitar.Elctric colemanElectric = new Instrument.Guitar.electric();
    public User() {
    }

    User(String name, Int idNumber, ArrayList instrumentList){
        this.name = name;
        this.idNumber = idNumber;
        this.instrumentList = instrumentList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Int getidNumber() {
        return this.idNumber;
    }

    public void setidNumber(Int idNumber) {
        this.idNumber = idNumber;
    }

    public ArrayList getInstrumentList() {
        return this.instrumentList;
    }

    public void setInstrumentList(ArrayList instrumentList) {
        this.instrumentList = instrumentList;
    }

}