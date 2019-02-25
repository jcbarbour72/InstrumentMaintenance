import java.util.ArrayList;

class User {

    private String name;
    private Int id;
    private ArrayList instrumentList;

    public User() {
    }

    User(String name, Int id, ArrayList instrumentList){
        this.name = name;
        this.id = id;
        this.instrumentList = instrumentList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Int getId() {
        return this.id;
    }

    public void setId(Int id) {
        this.id = id;
    }

    public ArrayList getInstrumentList() {
        return this.instrumentList;
    }

    public void setInstrumentList(ArrayList instrumentList) {
        this.instrumentList = instrumentList;
    }

}