package Oop_homework.question_1;

public class Main {


    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2,3);
        Point p3 = new Point(p2);
        System.out.println(p1.equals(p3));
        System.out.println(p2.equals(p3));
        System.out.println(p1.distance(p2));
        System.out.println(p1);

    }
}
