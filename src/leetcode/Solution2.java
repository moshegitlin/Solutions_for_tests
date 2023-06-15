package leetcode;

import java.util.ArrayList;

public class Solution2 {
    public static String longestCommonPrefix(String[] strs) {
        String prefix="";
       int minIndex =strs[0].length();
        for (int i = 1; i < strs.length ; i++) {
        if (strs[i].length()< minIndex) minIndex = strs[i].length();
        }
        int count1=minIndex;
        for (int i = 0; i < strs.length-1; i++) {
            int count=0;
            for (int j = 0; j < count1; j++) {
                if (strs[i].charAt(j)==strs[i+1].charAt(j)) count++;
                else break;
            }
            if (count < count1) count1 =count;

        }
        prefix = strs[0].substring(0,count1);
        return prefix;
    }

    public static void main(String[] args) {
//       String [] arr = {"cir","car"};
      //System.out.println(longestCommonPrefix(arr));
//        String g;
//        System.out.println('('-40);
       System.out.println(isValid("()"));

    }
    public static boolean isValid(String s) {
        if (s == null || s.length() < 2 || s.length() % 2 != 0) return false;
        ArrayList<Character> test = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') test.add(')');
            else if (c == '[') test.add(']');
            else if (c == '{') test.add('}');

            else if (test.size()==0) return false;
            else if (c != test.get(test.size() - 1)) return false;
            else if (c == test.get(test.size() - 1)) test.remove(test.size() - 1);
        }
        return test.size() ==0;
    }
}
