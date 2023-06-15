package spring_2021_last_term.Q12;

import spring_2021_last_term.Q12.Date;

public class FoodItem {
    private String name;
    private int quantity;
    private Date productDate;
    private Date expiryDate;
    private int  minTemperature;
    private int  maxTemperature;
    private double price;

    public FoodItem(String name, int quantity, Date productDate, Date expiryDate, int minTemperature, int maxTemperature, double price) {
        this.name = name;
        this.quantity = quantity;
        this.productDate = productDate;
        this.expiryDate = expiryDate;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", productDate=" + productDate +
                ", expiryDate=" + expiryDate +
                ", minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                ", price=" + price +
                '}';
    }
    public boolean isFresh(Date d){
        Date producton = this.productDate;
        Date expiry = this.expiryDate;

        return (!(d.before(producton.getYear(),producton.getMonth(), producton.getDey()))&&
                (d.before(expiry.getYear(), expiry.getMonth(), expiry.getDey())));
    }
    public int howManyItems(int sumMoney){
        return Math.min(((int) (sumMoney / this.price)), this.quantity);
    }











}
