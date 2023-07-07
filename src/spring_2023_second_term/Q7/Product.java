package spring_2023_second_term.Q7;

public class Product {
    private String name;
    private String category;
    private int count;
    private double price;

    public Product(String name, String category, int count, double price) {
        this.name = name;
        this.category = category;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isCheaper(Product other){
        return this.price < other.price;
    }
    public boolean isSame(Product other){
        return this.name.equals(other.name) && this.category.equals(other.category);
    }


}
