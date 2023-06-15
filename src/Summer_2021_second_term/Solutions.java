package Summer_2021_second_term;

import java.util.Arrays;
import java.util.Scanner;

public class Solutions {
   static Scanner sc = new Scanner(System.in);



    public static int Q1(){
        String value;
        int countNotT=0;
        do {
        System.out.println("Insert a string");
            value =sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < value.length(); i++) {
                if (value.charAt(i) =='T'){
                    flag=true;
                    break;
                }
            }
            countNotT += !(flag)?1:0;
        }
        while (value.length() >3);
        return countNotT;
    }
public static int Q11_A(int number){
        int sumEven=0;
        int sumOdd=0;
        while (number>0){
            if((number %10)%2 ==0)sumEven+=number%10;
            else sumOdd+= number%10;
            number/=10;
        }
        return sumEven-sumOdd;
}
public static boolean Q11_B(int[] arr,int[] arr1){
    int[] parityLevels = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
        parityLevels[i] = Q11_A(arr1[i]);
    }
    for (int i = 0; i < arr.length; i++) {
        int parityLevel = Q11_A(arr1[i]);
        boolean flag = true;
        for (int j = 0; j < parityLevels.length && flag; j++) {
            if (parityLevels[j] == parityLevel){
                flag =false;
            }
        }
        if (flag) return false;
    }
    return true;

}
    public static int[] Q11_C(int[] arr) {
        int[] result = new int[arr.length * 2];
        int negativeCount = 0;
        int zeroCount = 0;
        int positiveCount = 0;
        for (int num : arr) {
            int parityLevel = Q11_A(num);
            if (parityLevel < 0) negativeCount++;
            else if (parityLevel == 0) zeroCount++;
            else positiveCount++;
        }
        int negativeIndex =0;
        int zeroIndex = negativeCount*2;
        int positiveIndex = (negativeCount*2)+(zeroCount*2);
        for (int num : arr){
            int parityLevel = Q11_A(num);
            if (parityLevel < 0){
                result[negativeIndex++] = num;
                result[negativeIndex++] = parityLevel;
            } else if (parityLevel == 0) {
                result[zeroIndex++] = num;
                result[zeroIndex++] = parityLevel;
            }else {
                result[positiveIndex++] = num;
                result[positiveIndex++] = parityLevel;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        System.out.println(Q1());


    }
}
