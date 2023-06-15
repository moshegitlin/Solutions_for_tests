package Summer_2022_second_term.Q11;

public class MonthFuel {
    private Invoice[] invoices;
    private int current;

    public MonthFuel() {
        this.invoices = new Invoice[1000];
        this.current = 0;
    }
    public void addInvoice(int day,String numCar,String nameDriver,double fuel){
        this.invoices[current++] = new Invoice(day,numCar,nameDriver,fuel);
    }
    public double[] fuelPerDay(){
        double [] arr = new double[32];
        for (int i = 0; i < current; i++) {
            arr[invoices[i].getDay()-1] +=invoices[i].getFuel();
        }
        return arr;
    }
    public String maxFuelPerCar(){
      double maxFuel = invoices[0].getFuel();
      String numCar = invoices[0].getNum();
        for (int i = 0; i < current; i++) {
            double fuel=0;
            for (int j = i; j <current ; j++) {
                if(invoices[i].getNum().equals(invoices[j].getNum())) fuel+=invoices[j].getFuel();
            }
            if (fuel > maxFuel){
                maxFuel = fuel;
                numCar = invoices[i].getNum();
            }
        }
        return numCar;
    }
}
