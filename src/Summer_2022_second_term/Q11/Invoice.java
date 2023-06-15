package Summer_2022_second_term.Q11;

public class Invoice {
    private int day;
    private String num;
    private String name;
    private double fuel;

    public Invoice(int day, String num, String name, double fuel) {
        this.day = day;
        this.num = num;
        this.name = name;
        this.fuel = fuel;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
