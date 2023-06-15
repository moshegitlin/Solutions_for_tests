package A1;

import java.util.Arrays;

public class test {
    static int [] Q1 (int [] arr1,int [] arr2 ){
        String positive ="";
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j])
                    positive += arr1[i];
            }
        }
        int [] newarr = new int[positive.length()];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i]= positive.charAt(i)-'0';
        }
        return newarr;
    }

    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 12, 4,5};
        int[] arr1 = {2, 9, 10, 12, 3,5};
//        2,12,3,5
        System.out.println(Arrays.toString(Q1(arr,arr1)));
    }

}
