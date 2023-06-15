package Summer_2020_first_term;

import java.util.Arrays;
import java.util.Scanner;

public class Solutions {
    static Scanner sc = new Scanner(System.in);
    static void Q1(){
        int count=0;
        int countPositive=0;
        int sumPositive=0;
        int evenNumCount=0;
        int number;
        do {
            System.out.println("Enter a number");
            number = sc.nextInt();
            count++;
            countPositive += (number %2 ==0)?1:0;
            sumPositive += Math.max(number, 0);
            evenNumCount += (number >0)?1:0;
        }while (number!=0);
        System.out.println(String.format("%s   %d","The amount of numbers picked up are:",count-1));
        System.out.println(String.format("%s   %d","The amount of even numbers picked up is:",countPositive-1));
        System.out.println(String.format("%s   %d","The average of the even numbers taken is:",sumPositive/evenNumCount));
    }
   static boolean Q4(int[] arr) {
        if(arr.length <3 || arr.length % 2 ==0 ) return false;
        int peak = arr.length/2;
        for (int i = 0; i < peak; i++) {
            if (arr[i] < arr[peak] || arr[i + peak + 1] > arr[peak]) return false;
        }
        return true;
    }
    static boolean Q5e(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]== arr[i+1]) return true;
        }
        return false;
    }
//    Q8/e
    static boolean secret(int[] a, int[] b){
        int minArrB = b[0];
        for (int i = 1; i <b.length ; i++) {
           minArrB= Math.min(b[i],minArrB);
        }

        for (int i: a){
            if (i >= minArrB) return false;
        }
        return true;
    }


}
