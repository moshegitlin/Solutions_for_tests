package spring_2023_second_term;

import java.util.*;
public class Solutions {
  static Random rand = new Random();
  static Scanner sc = new Scanner(System.in);
  public static void Q1(){
    int count=0;
    int sum =0;
    int num;
    while ((num= sc.nextInt()) !=500){
      count++;
      sum+=num;
      if(num%2 !=0){
        int sumDig =0;
        while (num >0){
          sumDig+= num%10;
          num/=10;
        }
        System.out.println(sumDig);
      }
    }
    System.out.println(sum/count);
  }

  public static void Q2(){
    int validStringsCount =0;

    for (int i = 0; i < 23; i++) {
      String str = sc.nextLine();
      int countA =0;
      boolean flag = true;
      for (int j = 0; j < str.length(); j++) {
        if(str.charAt(j)== 'A'){
          countA++;
          if ( j < str.length() - 1 && str.charAt(j + 1) == 'A') {
            flag = false;
          }
        }
      }
      if(flag && countA >=2) validStringsCount++;
    }
    System.out.println("Number of valid strings: " + validStringsCount);
  }
  public static boolean isSetOfFriends(int[] arr){
    if(arr.length <2) return false;
    for (int k : arr) {
      int count = 0;
      for (int i : arr) {
        if (k == i) count++;
      }
      if (count != 2) return false;

    }
    return true;
  }
  public static void Q3_B(){
    int[] arr = new int[20];
    while (!isSetOfFriends(arr)) {
      for (int i = 0; i < arr.length; i++) {
        arr[i] = rand.nextInt(10,100); // מספר דו-ספרתי חיובי
      }
    }

    System.out.println("מערך חברים: ");
    for (int num : arr) {
      System.out.print(num +" ");
    }
  }
//  Q9
  public static boolean isDivisible(String s, int k) {
    int n = s.length();

    // Check if the length of the string is divisible by k
    if (n % k != 0) {
      return false;
    }

    int partLength = n / k;

    // Check if each part of the string is identical
    for (int i = 0; i < n; i++) {
      System.out.printf("%c %c \n",s.charAt(i),s.charAt(i % partLength));
      if (s.charAt(i) != s.charAt(i % partLength)) {
        return false;
      }
    }

    return true;
  }
  public static int maxDivisor (String s){
    int result =-1;
    for (int i = 2; i < s.length()-1; i++) {
        if(isDivisible(s,i)) result =i;
    }
    return result;
  }
  public static String[] getNonDivisibleStrings(String[] arr){
    int count =0;
    for (String s:arr){
      if(maxDivisor(s)== -1) count++;
    }
    String [] result = new String[count];
    for (int i = 0; i < arr.length; i++) {
      if(maxDivisor(arr[i])== -1) result[--count] = arr[i];
    }
    return result;
  }
  public static int[] Q11_A(int[] arr, int[] arr1) {
    // The assumption is that the first array is always larger
    int[] arr2 = new int[arr.length];
    int count = 0;
    for (int i : arr) {
      boolean flag = false;
      for (int k : arr1) {
        if (i == k) {
          flag = true;
          break; // Added the missing semicolon
        }
      }
      if (!flag) {
        arr2[count++] = i;
      }
    }
    if (count == 0) {
      return null;
    }
  int[] result = new int[count];
    System.arraycopy(arr2, 0, result, 0, count); // Optimized the array copy operation
    return result;
}
public static int[] Q11_b(int[]arr1,int[]arr2){
    int size = Math.max(arr1.length,arr2.length);
    int[] arr = new int[90];
    int count=0;
  for (int i = 10; i <100 ; i++) {
    boolean flag = false;
    for (int j = 0; j < size; j++) {
      if(j< arr1.length && j< arr2.length){
        if(i == arr1[j] || i== arr2[j]){
          flag = true;
          break;
        }
      } else if (j>= arr1.length) {
        if(i== arr2[j]){
          flag = true;
          break;
        }
      }
    else {
        if(i== arr1[j]){
          flag = true;
          break;
        }
      }

    }
    if(!flag) arr[count++]=i;
  }
  int[] result = new int[count];
if(count==0)return null;
System.arraycopy(arr,0,result,0,count);
return result;
}
//Q11_c
//  יש לולאות מקוננות שבהן הלולאה החיצונית חוזרת בין 10 ל-99, והלולאה הפנימית חוזרת עד לאורך המקסימלי של שני מערכי הקלט. לכן, התרחיש הגרוע ביותר מתרחש כאשר לשני מערכי הקלט יש אורך של n, וכתוצאה מכך סך של n^2 איטרציות.
  private static boolean isTheNumCute(int num){
    if(num <10) return false;
    int lastNum = num%10;
    while (num>9){
      num/=10;
    }
    return lastNum % num ==0;
  }
  public static boolean Q12_a(int[][] mat){
    int max =0;
    for (int[] value : mat) {
      if (max < value.length)
        max = value.length;
    }

    for (int i = 0; i <max; i++) {

      int numOfCol =mat.length;
      for (int[] ints : mat) {
        if (i > ints.length - 1) {
          numOfCol--;
          continue;
        }
        if(isTheNumCute(ints[i])) numOfCol --;
      }
      if(numOfCol ==0) return true;
    }
  return false;
  }
//  Q12_b
//  מורכבות הזמן של הפונקציה Q12_a היא O(n * m), כאשר n הוא מספר השורות במערך הדו-ממדי (mat.length) ו-m הוא המספר המרבי של עמודות בכל שורה. הסיבה לכך היא שהפונקציה חוזרת על כל עמודה בכל שורה של המערך
  public static void main(String[] args) {

  }
}
