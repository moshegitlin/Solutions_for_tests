package Summer_2020_first_term;

import java.util.Scanner;

public class Mahat_Summer_2020A {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter q number");
            int num = sc.nextInt();
            switch (num) {
                case 1:

                    break;
                case 2:
                    Clock c1 = new Clock(20, 45);
                    System.out.println(c1.getInterval_Edi());
                    System.out.println(c1.getInterval_Hazan());
                    q2_b();
                    break;

                case 3:
                    q3_a_what(12345);
                    q3_a_what(2046826);
                    System.out.println("הפעולה מבצעת עבור מספר שלם חיובי סכימה של כמות הספרות האי זוגיות במספר");
                    q3_b_why();
                    System.out.println("חיפוש של המספר עם הכמות המינימלית של ספרות אי זוגיות");


                    break;
                case 4:
                case 10:
                    MyArray star = new MyArray(8);
                    System.out.println("------------------------------");
                    star.two();
                    star.one(6);
                    System.out.println("------------------------------");
                    star.two();
                    System.out.println("------------------------------");
                    star.three();
                    star.two();
                case -1:
                    return;

            }

        }
    }

    public static class MyArray {
        private int[] arr;
        private Scanner in;

        public MyArray(int n) {
            in = new Scanner(System.in);
            arr = new int[n];
            for (int i = 0; i < n; i++)
                if (i % 2 == 0) arr[i] = 1;
                else arr[i] = -1;
        }

        public void one(int n) {
            for (int i = 0; i < n; i++)
                arr[i] = in.nextInt();
        }

        public void two() {
            for (int i = 0; i < arr.length; i++)
//                System.out.println(i + " " + arr[i]);
                System.out.print( arr[i]+" "  );
            System.out.println();
        }

        public void three() {
            int lastPlace = arr.length - 1;
            int halfLen = lastPlace / 2;
            int temp;
            for (int i = 0; i <= halfLen; i++) {
                temp = arr[i];
                arr[i] = arr[lastPlace - i];
                arr[lastPlace - i] = temp;
            }
        }
    }

    // סתם פונקציית עזר, לא חייב להשתמש
    private static int compare(Clock c1, Clock c2) {

        return c1.getInterval_Edi() - c2.getInterval_Hazan();
    }

    private static void q2_b() {

        System.out.println("Enter Time");
        Clock c1 = new Clock(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Time");
        Clock c2 = new Clock(sc.nextInt(), sc.nextInt());

        if (c1.getInterval_Edi() - c2.getInterval_Hazan() > 0)
            System.out.println("c2");
        else
            System.out.println("c1");


    }


    static class Clock {
        private int hour;
        private int min;

        public Clock(int hour, int min) {
            this.hour = hour;
            this.min = min;
        }

        public int getInterval_Edi() {
            return (23 - hour) * 60 + (60 - min);
        }

        public int getInterval_Hazan() {
            int dayMin = 1440;
            int temp = hour * 60 + min;
            return dayMin - temp;
        }

        // רק דוגמא, אין קשר לשאלה
        public int compare(Clock c) {
            return getInterval_Edi() - c.getInterval_Hazan();
        }
    }

    public static int q3_a_what(int num) {
        System.out.print(ANSI_RED);
        System.out.println("|       c        |          num");
        int c = 0;
        System.out.println("|       " + c + "        |          " + num);
        System.out.print(ANSI_BLUE);
        System.out.println("-------------------------------------");
        System.out.print(ANSI_RED);
        while (num > 0) {
            c += (num % 2);
            num /= 10;
            System.out.println("|       " + c + "        |          " + num);
        }
        System.out.print(ANSI_GREEN);
        System.out.println("return        " + c);
        System.out.print(ANSI_RESET);
        return c;
    }

    public static void q3_b_why() {
        int[] arr = {1245, 34781, 23, 468, 139};
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (q3_a_what(arr[i]) < q3_a_what(res)) {
                res = arr[i];
            }
        }
        System.out.println(res);
    }

}