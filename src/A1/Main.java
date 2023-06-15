package A1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 8, 4, 7, 7, 4, 12};
        int[] arr1 = {1, 2, 4, 7, 8, 10, 9, 7, 6, 4, 3, 2};
//        System.out.println(Test1.Crossing_array(arr));
//        System.out.println(Test1.Min_Crossing_array(arr));
//        System.out.println(Test1.Updownarray(arr));
//        System.out.println(Test1.Updownarray(arr1));
//        String a = "moshe gitlin i am 25 years old";
//       String A= Test1.Print_a_string_by_index(a);
//        System.out.println(A.length());
        System.out.print(calc("224+15"));

    }

    private static double calc(String s) {
        if (s == null || s.length()<1) return -1;

        StringBuilder operator = new StringBuilder();
        int numFirst=0;
        int numLast =0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) return -1;
            if (s.charAt(i) == ' ') return -1;
            if (!(operator.toString().equals("")) && !(Character.isDigit(s.charAt(i)))) return -1;
            if (operator.toString().equals("") && !(Character.isDigit(s.charAt(i))))
                operator.append(s.charAt(i));
            else if (numFirst == 0)numFirst=(s.charAt(i) - '0');
            else if (operator.toString().equals(""))
                numFirst = (numFirst *10) +(s.charAt(i) - '0');
            else if (numLast == 0) numLast=(s.charAt(i) - '0');
            else  numLast = (numLast*10) +(s.charAt(i) - '0');
        }
        if (operator.toString().equals("")) return -1;
        switch(operator.toString()) {
            case "+":
                return numFirst + numLast;
            case "-":
                return numFirst - numLast;
            case "*":
                return numFirst * numLast;
            case "/":
                return numFirst / numLast;
            default:
                System.out.println("Error");
        }
        return -1;
    }

    }

