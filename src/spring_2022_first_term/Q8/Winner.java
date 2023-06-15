package spring_2022_first_term.Q8;

public class Winner {
    private String name;
    private int lastPrice;

    public Winner(String name, int lastPrice) {
        this.name = name;
        this.lastPrice = lastPrice;
    }

    public String getName() {
        return name;
    }

    public int getLastPrice() {
        return lastPrice;
    }

    @Override
    public String toString() {
        return "Winner{" +
                "name='" + name + '\'' +
                ", lastPrice=" + lastPrice +
                '}';
    }
}
