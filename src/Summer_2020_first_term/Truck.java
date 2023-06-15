package Summer_2020_first_term;

public class Truck  {
    private String truckId;
    private String driverName;
    private int numStorage;
    private boolean isFree;

    public Truck(String truckId, String driverName, int numStorage) {
        this.truckId = truckId;
        this.driverName = driverName;
        this.numStorage = numStorage;
        this.isFree = true;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getNumStorage() {
        return numStorage;
    }

    public void setNumStorage(int numStorage) {
        this.numStorage = numStorage;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "truckId='" + truckId + '\'' +
                ", driverName='" + driverName + '\'' +
                ", numStorage=" + numStorage +
                ", isFree=" + isFree +
                '}';
    }
}
