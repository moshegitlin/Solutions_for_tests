package spring_2021_first_term;

import java.util.Arrays;
import java.util.Scanner;

public class Solutions {
    static Scanner sc = new Scanner(System.in);

    static void Q1() {
        int countEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < 40; i++) {
            int num = sc.nextInt();
            if (num % 2 == 0) countEven++;
            else sumOdd += num;
            if (num > 99 && num < 1000) {
                int sum = num % 10;
                num /= 10;
                sum += num % 10 + num / 10;
                System.out.println("sum of each digit " + sum);
            }
        }
        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
    static boolean Q6(String str){
        if (str.charAt(0)== '.' || str.charAt(str.length()-1)=='.') return false;
        boolean point =false;
        for (int i = 1; i <str.length()-2 ; i++) {
            if (str.charAt(i)=='.') point =true;
            if(point && str.charAt(i)=='.'&& str.charAt(i+1)=='.' ) return false;
        }
        return point;
    }
    static int Q10_A(int num){
        int superRank =0;
        while (num >0){
            superRank += (num%10)%2 ==0 ?1:0;
            num/=10;
        }
        return superRank;
    }
    static int Q10_B(int[] arr){
        int superRank = Q10_A(arr[0]);
        for (int i:arr){
            if(Q10_A(i) > superRank) superRank =Q10_A(i);
        }
        return superRank;
    }
    static boolean Q10_c(int[] arr){
        int pik = Q10_B(arr);
        if (!(arr.length == pik+1)) return false;
        for (int i = 0; i < arr.length; i++) {
            boolean test = true;
            for (int j = 0; j <= pik; j++) {
                if (Q10_A(arr[i])==j){
                    test = false;
                    break;
                }

            }
            if (test) return false;
        }
        return true;
    }
    static int s=0;




}
