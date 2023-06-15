package testers;

public class CheckArray {
    static void c(boolean[] arr) {
        int size = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) count++;
        }

        System.out.println("True: " + count + " " + "False: " + (size - count));

    }
    static void c(String[] arr) {
        int size = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("true")) count++;
        }
        System.out.println(String.format("%s %d %s %d","True:",count,"False:",(size - count)));
        System.out.println("True: " + count + " " + "False: " + (size - count));

    }

    public static void main(String[] args) {
        c(new String[]{"true", "false", "true"});
    }
}
