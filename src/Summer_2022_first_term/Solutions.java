package Summer_2022_first_term;
import java.util.*;
public class Solutions {
    static Scanner sc = new Scanner(System.in);


    public static int Q1() {
        int count = 0;
        String str;
        do{
            System.out.println("inserting a string");
            str = sc.nextLine();
            count +=(str.charAt(0) == 'Z' || str.charAt(str.length() - 1) == 'Z')?1:0;
        }
        while (str.charAt(0) != 'A' || str.charAt(str.length() - 1) != 'A');
        System.out.println(count);
        return count;
    }

public static boolean Q3(int[]arr){
        if (arr.length %2 !=0)return false;
        int countPosNum =0;
        int countNegNum =0;
        for (int i:arr){
            if(i==0)return false;
            if(i >0)countPosNum++;
            else countNegNum++;
        }
        return countPosNum ==countNegNum;
}

    public static void Input_pairsofnumbers () {
        Scanner sc = new Scanner(System.in);
        int num;
        int num1;
        int count = 0;
        int countEqual =0;
        int sumPositivenumbers=0;
        do{
           System.out.println("enter 2 numbers");
           num = sc.nextInt();
           num1 = sc.nextInt();
           count+=2;
           sumPositivenumbers += Math.max(num, 0);
           sumPositivenumbers += Math.max(num1, 0);
           countEqual += (num == num1) ? 1:0;
       } while ((float)num1 / num != -1);
                System.out.println("numbers taken: " + count);
                System.out.println("Positive numbers: " + sumPositivenumbers);
                System.out.println("Equal numbers: " + countEqual);
    }
    public static boolean Triangulararray (int[] arr){
        if (arr.length ==0 || arr.length %3 !=0 )
            return false;
        int size = arr.length/3;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[size+i] || arr[size+i] !=arr[(size*2)+i])
                return false;
        }
        return true;
    }



   static void printFromArrayTheGoldNum(int[] arr) {
        String goldNum = "";
       for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j < arr.length ; j++) {
               goldNum += (goldenNum(arr[i],arr[j]))? arr[i]+","+arr[j]+":  ":"";
           }
       }

       if (goldNum.length()!=0)  System.out.println(goldNum);
       else System.out.println("there's no golden number");
    }



     static boolean goldenNum(int i, int i1) {
        String istr= String.valueOf(i);
        String i1str= String.valueOf(i1);
        return ((istr.charAt(0) == i1str.charAt(0))
                &&(istr.charAt(istr.length()-1) == i1str.charAt(i1str.length()-1)));
    }

    public static boolean isBeautifulString(String str){
        if (str == null || str.length()%2!=0 ) return false;
        int [] arr =new int[26];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (!(Character.isLetter(c))) return false;
            if (Character.isUpperCase(c)) arr[c-'A'] ++;
            else  arr[c-'a'] --;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=0) return false;
        }
        return true;
    }

//Q14
    public static boolean Q14_A(int[][] mat , int value){
        for (int i = 0; i < mat.length-1; i++) {
            for (int j = 0; j < mat[i].length-1; j++) {
                 if(value == mat[i][j]&&
                         (mat[i][j]== mat[i][j+1]&&
                                 mat[i][j+1]==mat[i+1][j]
                                 &&mat[i+1][j] ==mat[i+1][j+1])) return true;
            }

        }
        return false;
    }
    public static boolean Q14_B(int[][] mat){
        int count =0;
        for (int i = 0; i < mat.length-1; i++) {
            for (int j = 0; j < mat[i].length-1; j++) {
                if(mat[i][j]== mat[i][j+1]
                        &&mat[i][j+1]==mat[i+1][j]
                        &&mat[i+1][j] ==mat[i+1][j+1]) count++;
            }
        }
        return count >3;
    }
    }
