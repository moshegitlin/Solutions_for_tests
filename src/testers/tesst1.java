package testers;

import java.util.Arrays;
import java.util.ArrayList;

public class tesst1 {
    public static void main(String[] args) {
//
       int a = isHappyTest(17);
//        System.out.println(a);
       int [] arr = new int[20];
       arr[0] = a;
        for (int i = 1; i < arr.length; i++) {
            arr [i] = isHappyTest(arr[i-1]);
        }
        System.out.println( Arrays.toString(arr));
//        12
//        4, 16, 37, 58, 89, 145, 42, 20,
//        4, 16, 37, 58, 89, 145, 42, 20,
//        4, 16, 37, 58, 89, 145, 42, 20,
//        ArrayList <Integer> arr = new ArrayList<Integer>();
//        System.out.println(arr.contains(1));
//        System.out.println(isHappy(20));
//        String [] str ={"moshe","merim","meir"};
//        String a ="moshe";
//        String b ="moir";
//        System.out.println(str[0].charAt(0));
//        System.out.println(Find_a_prefix_between_2_strings(a,b));
    }

    private static String Find_a_prefix_between_2_strings(String a, String b) {
        String prefix ="";
        int i=0;
       while (a.charAt(i)==b.charAt(i)){
           prefix += a.charAt(i);
           i++;
       }
        return prefix;
    }

    private static int[] sumarr(int[] arr) {
        int[] arr1 = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr1[i] = sum;

        }
        return arr1;
    }
    private   static int isHappyTest(int num){
        int sum =0;
        while (num > 0){
             sum += (num % 10) * (num % 10);
             num /= 10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        int result;
        while (n !=1){
             result = isHappyTest(n);
            if (arr.contains(result)) return false;
            arr.add(result);
            n = result;

        }
return true;
    }
//    public String longestCommonPrefix(String[] strs) {
//        String Prefix=Find_a_prefix_between_2_strings(strs[0],strs[1]);
//        for (int i = 0; i < strs.length; i++) {
//        while (Prefix.length()){
//
//        }
//        }
//        return Prefix;
//    }
public static boolean verticalArr(int [] arr){
        int countPos=0;
        int countNeg =0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]==0) return false;
        if (arr[i] >0) countPos++;
        else countNeg++;
    }
    return countPos == countNeg;
}


}
