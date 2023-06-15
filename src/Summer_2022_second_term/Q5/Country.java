package Summer_2022_second_term.Q5;

import java.util.Objects;

public class Country {
    private String name;
    private int infected;
    private int recovered;
    private int dead;

    public Country(String name, int infected, int recovered, int dead) {
        this.name = name;
        this.infected = infected;
        this.recovered = recovered;
        this.dead = dead;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInfected() {
        return infected;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getDead() {
        return dead;
    }

    public void setDead(int dead) {
        this.dead = dead;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", infected=" + infected +
                ", recovered=" + recovered +
                ", dead=" + dead +
                '}';
    }

}
