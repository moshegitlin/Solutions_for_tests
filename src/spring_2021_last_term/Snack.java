package spring_2021_last_term;

public class Snack {
private String name;
private int weight;
private double cost;
private int cal;

    public Snack(String name, int weight, double cost, int cal) {
        this.name = name;
        this.weight = weight;
        this.cost = cost;
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    @Override
    public String toString() {
        return "snack{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", cost=" + cost +
                ", cal=" + cal +
                '}';
    }
    boolean isHealthy(){
        return this.weight /(this.cal/100) <=120;
    }

     static int goodSnacks(Snack[] arrS){
         int count =0;
        for(Snack s: arrS){
            if(s.isHealthy() && s.getCost() <10)count++;
        }
        return count;
    }
}
