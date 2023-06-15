package Summer_2020_second_term;

import java.util.*;

public class Solutions {

    static void Q1() {
        Scanner sc = new Scanner(System.in);
        int letterA = 0;
        int numbers = 0;
        for (int i = 0; i < 50; i++) {
            String str = sc.nextLine();
            int size = str.length();
            if (size % 2 == 0) System.out.println(str.charAt(0));
            else System.out.println(str.charAt(size - 1));
            letterA += (str.charAt(0) == 'A') ? 1 : 0;
            numbers += (Character.isDigit(str.charAt(size - 1))) ? 1 : 0;
        }
        System.out.println(letterA);
        System.out.println(numbers);
    }

    //    Q2
    static class Jumper {
        private String name;
        private int score;

        public Jumper(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Jumper{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }

        static double avgScore(Jumper[] arr) {
            int sum = 0;
            for (Jumper i : arr) {
                sum += i.score;
            }
            return (double) sum / arr.length;
        }

        static void higerThenAvg(Jumper[] arr) {
            StringBuilder names = new StringBuilder("These are the names that jumped higher than the average: \n");
            for (Jumper i : arr) {
                if (i.score > avgScore(arr))
                    names.append(String.format("%s%s", i.name, "\t"));
            }
            System.out.println(names);
        }
    }

    //q3
    static int what(int a, int b) {
        int c = 0;
//    System.out.println(String.format("%s  %s  %s", "a", "b", "c"));
        while (a > 0) {
            c = c + b;
            a--;
//        System.out.println(String.format("%d  %d  %d", a, b, c));
        }
//    System.out.println("פעולה זו מבצעת כפל בין a ל b ");
        return c;
    }

    static int why(int x, int y) {
        int z = 1;
        System.out.println(String.format("%s  %s  %s", "y", "x", "z"));
        while (y > 0) {
            System.out.println(String.format("%d  %d  %d", y, x, z));
            z = what(z, x);
            System.out.println(String.format("%d  %d  %d", y, x, z));
            y--;
        }
        System.out.println(String.format("%d  %d  %d", y, x, z));
        return z;
    }

    static boolean Q4(int[] arr) {
        if (arr.length < 4 || arr.length % 2 == 1) return false;
        int sumFirst = 0;
        int sumLast = 0;
        int size = arr.length;
        for (int i = 0, j = size / 2; i < size / 2; i++, j++) {
            sumFirst += arr[i];
            sumLast += arr[j];
        }
        return sumLast == sumFirst;
    }
//q5/5
    public static boolean five(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    //    q7
    static class city {
        private String name;
        private int popul;
        private int branch;

        public city(String name, int popul, int branch) {

            this.name = name;
            this.popul = popul;
            this.branch = branch;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopul() {
            return popul;
        }

        public void setPopul(int popul) {
            this.popul = popul;
        }

        public int getBranch() {
            return branch;
        }

        public void setBranch(int branch) {
            this.branch = branch;
        }

        @Override
        public String toString() {
            return "city{" +
                    "name='" + name + '\'' +
                    ", popul=" + popul +
                    ", branch=" + branch +
                    '}';
        }

        boolean isFit() {
            return (this.branch > 4) && (this.popul > 5000);
        }

        static city createCity() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter settlement Name");
            String settlementName = sc.nextLine();
            if (settlementName.equals("stop")) {
                return new Solutions.city(settlementName, 0, 0);
            }
            System.out.println("enter number Of People");
            int numOfPeople = sc.nextInt();
            System.out.println("enter number of Branch");
            int numBranch = sc.nextInt();
            Solutions.city city1 = new Solutions.city(settlementName, numOfPeople, numBranch);
            return city1;
        }
    }

    static String Q9(String str) {
        if (str.length() == 0 || str.indexOf(' ') == -1) return "";
        String newStr = "";
        newStr += str.charAt(0);
        for (int a = 0; a < str.length() - 1; a++) {
            newStr += (str.charAt(a) == ' ') ? "." + str.charAt(a + 1) : "";
        }
        newStr += ".";
        return newStr;
    }

    // Q10
    static int dist(int[] arr, int num) {
        int countFirst = 0;
        int countLast = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) break;
            countFirst++;

        }
        if (countFirst == arr.length) return -1;
        for (int i = arr.length - 1; i > countFirst; i--) {
            if (arr[i] == num) break;
            countLast++;
        }
        return countFirst + countLast;
    }

    static int minNum(int[] arr) {
        int lsat = dist(arr, arr[0]);
        int number = arr[0];
        for (int i : arr) {
            if (dist(arr, i) < lsat) {
                lsat = dist(arr, i);
                number = i;
            }
        }
        return number;

    }

    //Q12
    static class Worker {
        enum workerType {
            ENGINEER, WORKER
        }

        private String id;
        private workerType status;
        private int basic;
        private int extra;
        private double[] businessDays;


        public Worker(String id, workerType status) {
            this.id = id;
            this.status = status;
            this.basic = 0;
            this.extra = 0;
            this.businessDays = new double[20];
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public workerType getStatus() {
            return status;
        }

        public void setStatus(workerType status) {
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

        int getSalary() {
            return (this.status.equals(workerType.ENGINEER)) ? (this.basic * 90) + (this.extra * 100) : (this.basic * 50) + (this.extra * 100);
        }

        void input() {
            Scanner sc = new Scanner(System.in);
            int start;
            int end;
            int endDay = 20;
            int sum = 0;
            System.out.println("Do you want to enter entry and exit or a total of monthly hours? Enter 1 or 2");
            int q2 = sc.nextInt();
            if (q2 == 2){
                System.out.println("Enter total monthly hours");
                sum = sc.nextInt();
                input1(sum);
                return;
            }
                System.out.println("Do you want to fill a few days or 20 full days? Enter 1 or 2");
            String q = sc.nextLine();
            if (q.equals("2")) {
                System.out.println("Choose a day between 1 and 20");
                endDay = sc.nextInt();
            }
            for (int i = 0; i < endDay; i++) {
                System.out.println("Enter entry time");
                start = sc.nextInt();
                System.out.println("Enter departure time");
                end = sc.nextInt();
                sum += end - start;
            }
    this.input1(sum);

        }


    private void input1(int sum) {
        if (sum < 160) this.basic = sum;
        else {
            this.basic = 160;
            this.extra = sum - 160;
        }
    }
}


    public static void main(String[] args) {
        System.out.println(five(new int[]{3,5,7,6}));
    }
}
