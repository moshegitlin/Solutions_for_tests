package Summer_2020_first_term;

import java.util.Scanner;

public class Family {
    private String name;
    private int num;
    private double totalSum;


    public Family(String name, int num) {
        this.name = name;
        this.num = num;
        this.totalSum =0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getTotalSum() {
        return totalSum;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", totalSum=" + totalSum +
                '}';
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        this.totalSum =100;
        for (int i = 0; i < this.num; i++) {
            System.out.println(String.format("%s %d%s","What is the age of family member",i+1,"?"));
        int age = sc.nextInt();
        this.totalSum += (age <4)?20.5:(age <13)?30:40.5;
        }

    }
    static Family inputQ12(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter family name");
    String name = sc.nextLine();
    if (name.equals("STOP")|| name.equals("stop"))return new Family(name,0);
        System.out.println("Enter a number of people");
        int num = sc.nextInt();
        return new Family(name,num);
    }
}
