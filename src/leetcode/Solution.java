package leetcode;


import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int strongPasswordChecker(String password) {
    int letterChecker =3;
        int  repeating_characters =0;
        boolean Lower = true , Upper = true , Digit = true;
        if (password.length() < 2 ) return 6- password.length();
        for (int i = 0; i < password.length(); i++) {
            if (letterChecker ==0) break;
            if (Lower && Character.isLowerCase(password.charAt(i))){
                letterChecker --; Lower = false;}
            if ( Upper && Character.isUpperCase(password.charAt(i))){
                letterChecker --; Upper = false;}
            if (Digit && Character.isDigit(password.charAt(i))){
                letterChecker --; Digit = false;}

        }
        if (password.length() < 6  ) return letterChecker +Math.max(0, 6 - (password.length() + letterChecker));
        int i =0;
       while ( i < password.length()-2){
           if (password.charAt(i) == password.charAt(i+1) && password.charAt(i+1) == password.charAt(i+2)){
               repeating_characters +=1;
               i+=3;
           }
           else  i++;

       }
        if (password.length()<=20) {
            return Math.max(repeating_characters, letterChecker);
        }
        else {
            if (password.length()-20 >= letterChecker+repeating_characters)
                return password.length()-20+letterChecker;
            else {
            return  Math.abs((password.length()-20)-repeating_characters)+letterChecker;
            }
        }
    }

    public static void main(String[] args) {
//       System.out.println(strongPasswordChecker("bbaaaaaaaaaaaaaaacccccc"));
//        System.out.println("bbaaaaaaaaaaaaaaacccccc".length());
        int [] arr = {3,3};
//        removeDuplicates(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(twoSum(arr,6)));
        System.out.println(isPalindrome(-121));
    }
    public static int removeDuplicates(int[] nums) {
        int count =1;
        int [] newarr = new int [nums.length];
        newarr[0] = nums [0];
        for (int i = 1,j=0; i < nums.length; i++,j++) {
        if (nums[i] != nums [j]){
            newarr[count] = nums[i];
            count ++;
        }

        nums[j] =0;
        }
        nums[nums.length-1] =0;
        for (int i =0; i <count; i++) {
            nums [i] = newarr[i];

        }
       return count;
    }
//public static int removeDuplicates(int[] nums) {
//    int count =1;
//    for (int i = 1,j=0; i < nums.length; i++,j++) {
//        if (nums[i] != nums [j]){
//            nums[count] = nums[i];
//            count ++;
//        }
//    }
//    for (int i =count; i < nums.length; i++) {
//        nums [i] = 0;
//    }
//
//
//    return count;
//}
    public  static int[] twoSum(int[] nums, int target) {
        int left=0, right =nums.length -1;
        int [] indexToTarget = new int[2];
        int[] testArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            testArr[i]=nums[i];
        }
        Arrays.sort(nums);
        while(left < right){
            if (nums[left] + nums[right]==target) {
                indexToTarget[0] = nums[left];
                indexToTarget[1] = nums[right];
                break;
            }
            else if (nums[left] + nums[right] > target) right--;
            else left++;
        }
        boolean leftb= true, rightb = true;
        int index =0;
        while (index<testArr.length && (leftb||rightb)){
            if (indexToTarget[0] == testArr[index]&& leftb) {
                indexToTarget[0] = index;
                leftb= false;
                index++;
            }
            else if (indexToTarget[1] == testArr[index]&& rightb) {
                indexToTarget[1] = index;
                rightb =false;
                index++;
            }

            else index++;
        }
        return indexToTarget;
    }
    public  static boolean isPalindrome(int x) {
        int reversX =0;
        int copyX= x;
        while (copyX>0){
            reversX =(reversX * 10) + copyX % 10;
            copyX /=10;
        }

        return reversX == x;
    }

}

