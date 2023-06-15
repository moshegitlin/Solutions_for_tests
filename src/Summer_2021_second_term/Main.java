package Summer_2021_second_term;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int Q = sc.nextInt();
        switch (Q){
            case 1:
                Solutions.Q1();
                break;
            case 6:
                Car c = new Car("1234567","0551122121");
                Car c1 = new Car("5678901","0555822222");
                Car c2 = new Car("4632789","0550000000");
                Car c3 = new Car("7324561","0554444444");
                c.startWork();
                c1.startWork();
                c2.startWork();
                c.endWork(300);
                System.out.println(Car.result(new Car[]{c,c1,c2,c3},"1234567"));
                System.out.println(Car.result(new Car[]{c,c1,c2,c3},"5678901"));
                System.out.println(Car.result(new Car[]{c,c1,c2,c3},"2323232"));
                break;
            case 11:
                System.out.println(Solutions.Q11_A(68));
                System.out.println(Solutions.Q11_B(new int[]{722,1055,2257},new int[]{6,74,5852,221,457}));
                System.out.println(Arrays.toString(Solutions.Q11_C(new int[]{6,74,5852,221,457})));
                break;
            default:
                System.out.println("there is not such question");
        }
    }
}
