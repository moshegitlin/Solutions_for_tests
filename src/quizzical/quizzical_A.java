package quizzical;

import java.lang.reflect.Array;
import java.util.Arrays;

public class quizzical_A {
    static String defangIPaddr(String str){
        String newStr=  "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.')
                newStr+= "["+str.charAt(i)+"]";
            else newStr+=(char)str.charAt(i);
        }
        return newStr;
    }
    public static int numIdenticalPairs(int[] nums) {
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]&& i<j) count++;

            }

        }
        return count;
    }
    public static int maximumWealth(int[][] accounts){
        int richest= 0;
        for (int i = 0; i <accounts.length ; i++) {
            int count =0;
            for (int j = 0; j <accounts[i].length ; j++) {
                count+=accounts[i][j];
            }
            if (count > richest) richest =count;
        }
        return richest;
    }
    public static int finalValueAfterOperations(String[] operations) {
        int count =0;
        String a ="++X" , b = "X++", c = "--X",d="X--";
        for (int i = 0; i < operations.length; i++) {
           if (operations[i] == a || operations[i]== b) count++;
           else count--;

        }

        return count;
    }

    public static void main(String[] args) {
//        System.out.println(defangIPaddr("1.1.1.1"));
//        String a = "1.1.1.1";
//        int [] arr = {1,1,1,1};
//
//        int [][] mat ={{ 2,8,7},{7,1,3},{1,9,5}};
//        System.out.println(numIdenticalPairs(arr));
        String [] arr = {"++X","++X","X++"};
//        System.out.println(maximumWealth(mat));
        System.out.println(finalValueAfterOperations(arr));
    }
}
