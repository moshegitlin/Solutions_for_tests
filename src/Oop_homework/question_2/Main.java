package Oop_homework.question_2;

public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(8,3,1997);
        Date d2 = new Date(d1);
        Date d3 = new Date();
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
        System.out.println(d2.before(d3));
        System.out.println(d3);
    }
}
