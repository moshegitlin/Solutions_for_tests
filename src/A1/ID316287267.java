package A1;
import java.util.*;
public class ID316287267 {
    public static void q1_A() {
        Scanner a = new Scanner(System.in);
        int num;
        int num1;
        int count = 0;
        int countEqual =0;
        int sumPositivenumbers=0;
        do{
            System.out.println("enter 2 numbers");
            num = a.nextInt();
            num1 = a.nextInt();
            count+=2;
            sumPositivenumbers += (num > 0) ? num : 0;
            sumPositivenumbers += (num1 > 0) ? num1 : 0;
            countEqual += (num == num1) ? 1:0;
        } while ((float)num1 / num != -1);
        System.out.println("numbers taken: " + count);
        System.out.println("Positive numbers: " + sumPositivenumbers);
        System.out.println("Equal numbers: " + countEqual);
    }

    public static void q1_B() {
        Scanner a = new Scanner(System.in);
        int count = 0;
        String str;
        do{
            System.out.println("inserting a string");
            str = a.nextLine();
            count +=(str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x')?1:0;
        } while (str.charAt(0) != 'z' && str.charAt(str.length() - 1) != 'z');
        System.out.println(count);
    }

    public static boolean q3_A(int[] arr) {
        if (arr.length == 0 || arr.length % 3 != 0) return false;

        int size = arr.length / 3;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[size + i] || arr[size + i] != arr[(size * 2) + i])
                return false;
        }
        return true;
    }

    //>>>>>>>>>>>>>>>>  q3_B()>>>>>>>>>>>>>>>>>>>
    public static boolean isPeak(int[] arr, int index) {
        return (index != 0
                && index != arr.length - 1
                && (arr[index] > arr[index + 1])
                && (arr[index] > arr[index - 1]));
    }

    public static int Total_peaks(int[] arr) {
        int total = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            total += (isPeak(arr, i))?1:0;
        }
        return total;
    }
    public static void main(String [] args){
        q1_A();
        q1_B();
        int[] a = {13,6,3,13,6,3,13,6,3};
        int[] b = {1,1,1,1,1,1};
        int[] c = {1,2,3,4,1,2,3,4,1,2,3};
        int[] d = {1,2,1,2,2,2};
        System.out.println(q3_A(a));
        System.out.println(q3_A(b));
        System.out.println(q3_A(c));
        System.out.println(q3_A(d));
        int [] arr ={1,2,6,4,5,3,9,10,7};
        System.out.println(isPeak(arr,2));
        System.out.println(isPeak(arr,3));
        System.out.println(Total_peaks(arr));
    }
}
