package Summer_2021_first_term;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solutions {
    public static void Q1A() {
        Scanner sc = new Scanner(System.in);
        int END = 4;
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i <= END; ) {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            if (number < 1) {
                continue;
            }
            i++;
            if (String.valueOf(number).length() == 3) {
                int sumThreedigit;
                int temp = number / 10;
                sumThreedigit = number % 10 + temp % 10 + temp / 10;
                System.out.println("sum of all digits =" + sumThreedigit);
            }
            countEven += (number % 2 == 0) ? 1 : 0;
            countOdd += (number % 2 != 0) ? 1 : 0;
        }
        System.out.println("The amount of even numbers =" + countEven);
        System.out.println("The amount of odd numbers =" + countOdd);
    }

    //a.aa..a.a
    public static boolean Q6A(String str) {
        if (str == null || str.length() < 3 || str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.'||str.indexOf('.')==-1)
            return false;
        for (int i = str.indexOf('.'); i < str.lastIndexOf('.'); i++) {
            if (str.charAt(i)=='.'&&str.charAt(i+1)=='.') return false;
        }
        return true;
    }
    private static boolean checks(int[]arr,int num){
        //    The function checks whether the number exists in the array
        for (int i:arr){
            if (i==num)return true;
        }
        return false;
    }
    public static int[] intersect(int[] b, int[] c){
        Arrays.sort(b);
        int size = Math.min(b.length, c.length);
        int [] newArr =new int[size];
        int count=0;
        if (checks(c,b[0])){
            newArr[count++] =b[0];
        }
        for (int i = 1; i < b.length ; i++) {
            if (checks(c,b[i]) && b[i-1]!= b[i])newArr[count++] =b[i];
        }
        int [] newArr1 =new int[count];
        for (int i = 0; i < count; i++) {
            newArr1[i] =newArr[i];
        }
        return newArr1;
    }
//    Q9A
    public static boolean exchange (int number){
        if (number < 0) return false;
        if(number < 10) return true;
        while (number >0){
            int digit =number%10;
            number/=10;
            if (!(((number%10)%2!=0 && digit%2==0)||((number%10)%2==0 && digit%2!=0)))return false;
        }
        return true;
    }
    private static int sumNumber(int num){
        int sum =0;
        while (num>0){
            sum+= num%10;
            num/=10;
        }
        return sum;
    }
    public static int Q9B (int[] arr){
        int index=-1;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if (exchange(arr[i])){
                index =i;
                sum =sumNumber(arr[i]);
                break;
            }
        }
        if (index < 0)return index;
        for (int i = index+1; i < arr.length; i++) {
            if(exchange(arr[i]) && sumNumber(arr[i]) < sum) {
                sum = sumNumber(arr[i]);
                index =i;
            }
        }
        return index;
    }
    private static boolean Q14Test(int num1,int num2){
        int sumNum1=0, SumNum2 = 0;
        while (num1 >0){
            sumNum1+=num1%10;
            num1/=10;
        }
        while (num2 >0){
            SumNum2+=num2%10;
            num2/=10;
        }
        return sumNum1 == SumNum2;

    }
static int Q14(int[] arr1,int[]arr2){
int indexArr1 =-1;
int sum=0;
    for (int i = 0; i < arr1.length; i++) {
        int sum1=0;
        for (int j = 0; j < arr2.length; j++) {
            if (Q14Test(arr1[i],arr2[j])) sum1++;
        }
        if (sum1 > sum){
            sum = sum1;
            indexArr1 =i;
        }
    }
       return indexArr1;
}

    public static boolean areStrangers(int[] a, int[] b){
    return intersect(a,b).length<1;
    }
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(intersect(new int[]{1,2,5,3,4,5,5,5,5},new int[]{1,2,3,4,5,5,5,5,6,7,8})));
//        System.out.println(areStrangers(new int[]{1,2,3,4},new int[]{5,6,7,8}));






    }


}
