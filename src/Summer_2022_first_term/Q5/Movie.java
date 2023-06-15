package Summer_2022_first_term.Q5;

public class Movie {
    private String name;
    private double price;
    private int num;

    public Movie(String name, double price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public Movie() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
