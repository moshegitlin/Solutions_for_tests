package spring_2021_last_term;

public class Cityk {
    private String name;
    private int numOfResidents;
    private int numOfPatents;

    public Cityk(String name, int numOfResidents, int numOfPatents) {
        this.name = name;
        this.numOfResidents = numOfResidents;
        this.numOfPatents = numOfPatents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfResidents() {
        return numOfResidents;
    }

    public void setNumOfResidents(int numOfResidents) {
        this.numOfResidents = numOfResidents;
    }

    public int getNumOfPatents() {
        return numOfPatents;
    }

    public void setNumOfPatents(int numOfPatents) {
        this.numOfPatents = numOfPatents;
    }

    @Override
    public String toString() {
        return "Cityk{" +
                "name='" + name + '\'' +
                ", numOfResidents=" + numOfResidents +
                ", numOfPatents=" + numOfPatents +
                '}';
    }
    boolean EqualityPatients(Cityk c){
        return this.numOfPatents == c.numOfPatents;
    }
    public String getCityColor(){
        int percent =(numOfPatents/numOfResidents)*100;
        return percent <5?"green":percent <=15?"orange":"red";
    }
}
