package Summer_2022_first_term.Q12;

import java.util.Objects;

public class Cake {
    private String name;
    private Date lastDate;
    private int price;
    private boolean hasMilk;

    public Cake(String name, int dey,int month,int year, int price, boolean hasMilk) {
        this.name = name;
        setLastDate(dey,month,year);
        this.price = price;
        this.hasMilk = hasMilk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(int dey,int month,int year) {
        this.lastDate = new Date(dey,month,year);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }
    public boolean isFresh (Date d){
        return !(this.lastDate.before(d));
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", lastDate=" + lastDate +
                ", price=" + price +
                ", hasMilk=" + hasMilk +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cake cake)) return false;
        return getPrice() == cake.getPrice() && isHasMilk() == cake.isHasMilk() && Objects.equals(getName(), cake.getName()) && Objects.equals(getLastDate(), cake.getLastDate());
    }


        public boolean isReplaceable (Cake other){
        return this.lastDate.equals(other.lastDate) && isHasMilk() == other.hasMilk && Math.abs(this.price-other.price) <=10;
        }
}
