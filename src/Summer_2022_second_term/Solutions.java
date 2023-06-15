package Summer_2022_second_term;
import java.util.*;
import java.util.regex.*;
public class Solutions {
    static Scanner a = new Scanner(System.in);
    //Question 1
    public static int Start_and_end_sum_letter() {
        int count=1;
        String str;
        do{
            System.out.println("inserting a string");
            str = a.nextLine();
            count +=(str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x')?1:0;
        }
        while (str.charAt(0) != 'z' && str.charAt(str.length() - 1) != 'z');
        return count;
    }
    //Question 3
    public static boolean isPeak(int[] arr, int index){
        boolean test = false;
        if (index!= 0
                && index!= arr.length-1
                && (arr[index] > arr[index+1])
                &&(arr[index] > arr[index-1]) )
        {
            test = true;
        }
        return test;
    }
    public static int Total_peaks(int [] arr){
        int total =0;
        for (int i = 1; i < arr.length-1; i++) {
            if (isPeak(arr,i))
                total++;
        }
        return total;
    }
    public static int numValues (int[][] mat, int col, int value){
        int count =0;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] == value)
                count++;
        }
        return count;
    }
    public static boolean IsPair (int[][] mat, int[] arr){
        for (int i = 0; i < mat.length; i++) {
            if (mat[i].length != arr.length )
                return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (numValues(mat,i,arr[i])!= i) {
                return false;
            }
        }
        return true;
    }

    public static boolean order_array (int [] arr){
        if (arr.length <5 || arr.length % 2!=0)
            return false;
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length/2; i++) {
            count+= arr[i];
        }
        for (int i = arr.length/2; i < arr.length ; i++) {
            count1 += arr[i];
        }
        return count1 ==count;
    }
}
