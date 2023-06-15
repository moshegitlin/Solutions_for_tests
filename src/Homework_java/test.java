package Homework_java;

import java.util.Random;

public class test {
    public static boolean what(int[] arr, int num) {
        int i = 0;
        int k = 1;
        int value = arr[i];
         while(k < arr.length && value!= num) {
            if(value < num)
            {
                value += arr[k];
                k++;
            }
            else
            {
                value -= arr[i];
                i++;
            }
        }
        if(value == num)
            return true;
        return false;
    }

    public static void main(String[] args) {
        /*
        Random rd = new Random();
        int number = rd.nextInt(10);
        String x = "";
        x+=(number % 2==0)? "even":(number % 3==0)? "dv": "d";
        int y = 15*(3-3);
        int t = 1/10;
        System.out.println(y);
         */
        int [] arr = {1,1,1,8};
        System.out.println(what(arr,3));

    }
}
