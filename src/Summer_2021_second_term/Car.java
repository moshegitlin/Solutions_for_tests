package Summer_2021_second_term;

public class Car {
   private String license;
   private String ownerNum;
   private char  status;
   private double cost;

    public Car(String license, String ownerNum) {
        this.license = license;
        this.ownerNum = ownerNum;
        this.status ='S';
    }

    public String getLicense() {
        return license;
    }

    public String getOwnerNum() {
        return ownerNum;
    }

    public char getStatus() {
        return status;
    }

    public double getCost() {
        return cost;
    }
    public void endWork(double cost){
        if(status == 'W'){
        this.cost = cost;
            this.status = 'E';
        }
    }
    public void startWork(){
        this.status = 'W';
    }
    public static boolean result (Car[] arr, String license){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getLicense().equals(license)){
                System.out.println((arr[i].getStatus() == 'E')?arr[i].getCost():String.format("%c",arr[i].getStatus()));
                return arr[i].getStatus() == 'E';
            }
        }
        System.out.println("This vehicle number does not exist");
        return false;
    }



}
