package spring_2021_first_term;

public class Battery {
    private String manufacturer;
    private char size;
    private double volt;
    private boolean isNormal;

    public Battery(String manufacturer, char size, double volt, boolean isNormal) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.volt = volt;
        this.isNormal = isNormal;
    }

    public Battery(char size, double volt) {
        this.manufacturer = "Duracell";
        this.size = size;
        this.volt = volt;
        this.isNormal = true;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getVolt() {
        return volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        isNormal = normal;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", volt=" + volt +
                ", isNormal=" + isNormal +
                '}';
    }
}
