package Homework_java;
import java.util.Random;
import java.util.Scanner;

public class MahatClass {
    //Summer 2020 first term Question 7
static class Truck{
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
    public static void main(String[] args) {

        Truck T1 = new Truck("123456789","David",10);
        Truck T2 = new Truck("123456788","Moshe",6);
        Truck T3 = new Truck("123456787","Avi",9);
        Truck T4 = new Truck("123456786","Matan",8);
//        T1.setFree(false);
//        T2.setFree(false);
        T3.setFree(false);
//        T4.setFree(false);
        Truck [] TArr = {T1,T2,T3,T4};
        for (Truck i:TArr){
            if (i.isFree && i.getNumStorage() > 6)
                System.out.println(i.getDriverName());
        }
        Truck bigger = TArr[0];
        for (Truck i:TArr){
            if (i.isFree && i.getNumStorage() > bigger.getNumStorage())
                bigger = i;
        }
        if (bigger.isFree)
            System.out.println(bigger.getTruckId());
        else System.out.println("Unable to service");

    }
}
    //Summer 2020 first term Question 12
static class Family {
    private String name;
    private int num;
    private double totalSum;

    public Family(int num) {
        this.num = num;
        this.totalSum = 0;
    }

    public double getTotalSum() {
        return totalSum + 100;
    }


    public void input() {
        double total = 0;
        Scanner ac = new Scanner(System.in);
        for (int i = 0; i < this.num; i++) {
            System.out.println("Enter your age");
            int age = ac.nextInt();
            if (age >= 0 && age <= 3) total += 20.5;
            else if (age <= 12) total += 30;
            else total += 40.5;
        }
        this.totalSum = total;
    }
}
static class Main{
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        String name ="";
        while (!(name.equals("STOP"))) {
            System.out.println("Enter your family name");
            name = ac.nextLine();
            System.out.println("Enter a number of people");
            Family family = new Family(ac.nextInt());
            family.input();
            System.out.println(family.getTotalSum());

        }
    }
}

//Summer 2020 second term Question 12

static class Worker{
    private String id;
    private int status;
    private int basic;
    private int extra;

    public Worker(String id, int status) {
        this.id = id;
        this.status = status;
        this.basic =0;
        this.extra =0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", basic=" + basic +
                ", extra=" + extra +
                '}';
    }
    public int getSalary (){
        return  (this.status ==1)?( this.basic * 90 + this.extra *100):( this.basic * 50 + this.extra *100);
    }
    void input(){
        Scanner ac = new Scanner(System.in);
        //Random rd = new Random();
        int amountHours =0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter entry time");
            int start = ac.nextInt();
            //int start = rd.nextInt(4,10);
            System.out.println("Enter departure time");
            int end = ac.nextInt();
            //int end = rd.nextInt(13,25);
            amountHours += end - start;
            //System.out.println("a day "+i+1);
        }
        if (amountHours <=160) this.basic +=amountHours;
        else {
            this.extra += (amountHours - 160);
            this.basic =160;
        }
    }
    static void employeeSalaryData(Worker [] arrWorkers){
        int sumAllEngineers=0,sumAllWorkers=0;
        for (int i = 0; i < arrWorkers.length; i++) {
            Worker step = arrWorkers[i];
            int allHours = step.getBasic()+step.getExtra();
            System.out.println("worker id "+step.getId()+"\n " +
                    "Total working hours "+allHours+"\n"
            +"Total salary "+step.getSalary());
            if (step.status == 1) sumAllEngineers += step.getSalary();
            else sumAllWorkers += step.getSalary();
        }
        System.out.println("The total sum of all engineers "+sumAllEngineers);
        System.out.println("The total sum of all the workers "+sumAllWorkers);
    }
    public static void main(String[] args) {
        Worker w1 = new Worker("123456789",1);
        Worker w2 = new Worker("123456788",2);
        Worker w3 = new Worker("123456787",1);
        Worker w4 = new Worker("123456786",2);
        w1.input();
        w2.input();
        w3.input();
        w4.input();
        Worker [] arrWorkers ={w1,w2,w3,w4};
        employeeSalaryData(arrWorkers);
    }
}
//Summer 2020 second term Question 7
    static class City{
    private String name;
    private int people;
    private int branch;

    public City(String name, int people, int branch) {
        this.name = name;
        this.people = people;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }
    public boolean isFit() {
        return (this.branch >4 && this.people>5000);
    }
    static City enterValue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of a settlement. amount of inhabitants. and the number of HMO branches.");
        City cy = new City(sc.nextLine(),sc.nextInt(),sc.nextInt());
        return cy;
    }
    public static void main(String[] args) {
        int count =0;
        while (true){
            City cy = enterValue();
            if (cy.getName().equals("STOP")) break;
            if (cy.isFit())
            System.out.println("Suitable for the survey!");
            else{
                count++;
                System.out.println("Not suitable for the survey!");
            }
        }
        System.out.println("The number of settlements that did not qualify for the survey: "+count);

    }
}

}

