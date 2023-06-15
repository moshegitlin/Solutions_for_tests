package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution1 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList <ArrayList<Integer>> mat = new ArrayList<ArrayList<Integer>>();
        if ( nums.length <= 3  || nums.length <= 3000) return mat;
        ArrayList <Integer> row1 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <nums.length ; j++) {

            }
        }




        return mat;
    }

    public static void main(String[] args) {
//        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv"));
    }
    public static int romanToInt(String s) {
        char [] chars = s.toCharArray();
        int size = chars.length;
        boolean flag = true;
        int sum =0;
        if ((size>1)&&((s.startsWith("IV", size-2))|| (s.startsWith("IX", size-2))||
                (s.startsWith("XL", size-2))|| (s.startsWith("XC", size-2))||
                (s.startsWith("CD", size-2))|| (s.startsWith("CM", size-2)))) flag =false;


        for (int i = 0; i < chars.length-1; i++) {

            if(chars[i+1]=='V' && chars[i]=='I') {
                sum+= 4;
                i++;
            }
            else if(chars[i+1]=='X' && chars[i]=='I'){
                sum+= 9;
                i++;
            }
            else if(chars[i+1]=='L' && chars[i]=='X'){
                sum+= 40;
                i++;
            }
            else if(chars[i+1]=='C' && chars[i]=='X'){
                sum+= 90;
                i++;
            }
            else if(chars[i+1]=='D' && chars[i]=='C'){
                sum+= 400;
                i++;
            }
            else if(chars[i+1]=='M' && chars[i]=='C') {
                sum+= 900;
                i++;
            }
            else if (chars[i]=='I')sum+=1;
            else if (chars[i]=='V') sum +=5;
            else if (chars[i]=='X') sum +=10;
            else if (chars[i]=='L') sum +=50;
            else if (chars[i]=='C') sum +=100;
            else if (chars[i]=='D') sum +=500;
            else if (chars[i]=='M') sum +=1000;
        }



        if (chars[size-1]=='I'&& flag)sum+=1;
        else if (chars[size-1]=='V' && flag) sum +=5;
        else if (chars[size-1]=='X' && flag) sum +=10;
        else if (chars[size-1]=='L' && flag) sum +=50;
        else if (chars[size-1]=='C' && flag) sum +=100;
        else if (chars[size-1]=='D' && flag) sum +=500;
        else if (chars[size-1]=='M' && flag) sum +=1000;

        return sum;
    }



    public static String decodeMessage(String key, String message) {
    String newMessage ="";
    char [] charMessage = message.toCharArray();
        char [] keyTest = key.toCharArray();
        HashMap<Character,Character> test = new HashMap<Character,Character>();
        char later ='a';
        for (int i = 0; test.size()<26;i++) {
            if (!(keyTest[i] == ' ' || test.containsKey(keyTest[i]))){
                test.put(key.charAt(i),later);
                later++;

            }
        }
        for (int i = 0; i <charMessage.length ; i++) {
            if (charMessage[i] == ' ') newMessage +=" ";
            else newMessage+= test.get(charMessage[i]);
        }

    return newMessage;
    }
        }


