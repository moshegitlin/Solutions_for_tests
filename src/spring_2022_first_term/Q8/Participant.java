package spring_2022_first_term.Q8;

public class Participant {
    private String name;
    private String id;
    private int price;

    public Participant(String name, String id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                '}';
    }
}
