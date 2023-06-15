package spring_2022_first_term;

import java.util.Arrays;
import java.util.Random;

public class Solutions {
  static Random rand = new Random();
  public static int[] Q2(int num){
    int[] arr = new int[num];
    for (int i = 0; i < num; i++) {
      int tens = rand.nextInt(1,9) ;
      int ones = rand.nextInt(tens+1 ,10);
      arr[i] = tens * 10 + ones;
    }
    return arr;
  }
//  Q11
  public static boolean specialNumber(int num) {
    if (num < 10) return false;
    int sumNum1 = 0;
    int sumNum2 = 0;
    boolean flag = true;
    while (num > 0) {
      if (flag) {
        sumNum1 += num % 10;
        flag = false;
      } else {
        sumNum2 += num % 10;
        flag = true;
      }
      num /= 10;
    }
    return sumNum1 == sumNum2;
  }
  public static boolean isSpecialArray(int[] arr){
    int countSpecial=0;
    for (int i:arr){
      if (!(specialNumber(i)))break;
      countSpecial++;
    }
    if (countSpecial==0)return false;
    for (int i = countSpecial; i <arr.length ; i++) {
      if (specialNumber(arr[i])) return false;
    }
    System.out.println(countSpecial);
    return true;
  }
  public static int[] buildSpecialArray(int[]arr1,int[]arr2){
    int countSpecialArr1=0;
    int countSpecialArr2=0;
    for (int i = 0; i < arr1.length; i++) {
      if (specialNumber(arr1[i])) {
        countSpecialArr1++;
      }
    }
    for (int i = 0; i < arr2.length; i++) {
      if (specialNumber(arr2[i])) {
        countSpecialArr2++;
      }
    }
    int[] newSpecialArray= new int[arr1.length+arr2.length];
    for (int  i= 0,n=countSpecialArr1+countSpecialArr2,s=0; i < arr1.length; i++) {
     if (specialNumber(arr1[i])) newSpecialArray[s++]=arr1[i];
     else newSpecialArray[n++]=arr1[i];
    }
    int nSpas = arr1.length -countSpecialArr1;
    for (int  i= 0,n=countSpecialArr1+countSpecialArr2+nSpas,s=countSpecialArr1; i < arr2.length; i++) {
      if (specialNumber(arr2[i])) newSpecialArray[s++]=arr2[i];
      else newSpecialArray[n++]=arr2[i];
    }
    return newSpecialArray;
  }
//  Q14_A
public static boolean hasSadCellWithValue(int[][] arr, int num) {
  // Loop through all the cells in the array except for the outer frame
  for (int i = 1; i < arr.length - 1; i++) {
    for (int j = 1; j < arr[i].length - 1; j++) {
      // Check if the current cell is "sad" and has the given value
      if (arr[i][j] == num && isSadCell(arr, i, j)) {
        return true;
      }
    }
  }
  // No "sad cell" with the given value was found
  return false;
}

  // Helper method to check if a cell is "sad"
  private static boolean isSadCell(int[][] arr, int row, int col) {
    int value = arr[row][col];
    // Check all eight neighbors of the cell
    for (int i = row - 1; i <= row + 1; i++) {
      for (int j = col - 1; j <= col + 1; j++) {
        if (arr[i][j] == value && (i != row || j != col)) {
          // A neighbor with the same value was found, so the cell is not "sad"
          return false;
        }
      }
    }
    // No neighbor with the same value was found, so the cell is "sad"
    return true;
  }
//  Q14_B
public static int[] AllTheSadValues(int[][] mat){

  int col=0;
  for (int i = 1; i < mat.length-1; i++) {
    col+= mat[i].length;
  }
  int[]sadValues = new int[col];
  int count=0;
  for (int i = 1; i < mat.length - 1; i++) {
    for (int j = 1; j < mat[i].length - 1; j++) {
      int value = mat[i][j];
      if (hasSadCellWithValue(mat,value)&& !contains(sadValues, value, count))
        sadValues[count++] = value;
    }
  }
  if (count == 0) return null;
  return Arrays.copyOf(sadValues, count);

}
  //   Checks for duplicate values
  private static boolean contains(int[]arr, int num, int end){
    for (int i = 0; i < end; i++) {
      if (arr[i] == num) return true;
    }
    return false;
  }
//  Q14_C
public static void bigTwDigitForArr(int[][]mat){
  int numBig =0;
  int [] arr = AllTheSadValues(mat);
  if(arr==null){
    System.out.println("No sad numbers at all");
    return;
  }
  for (int j : arr) {
    if ((j > 9 && j < 100) && j > numBig) numBig = j;
  }
  if (numBig <10) {
    System.out.println("No sad positive double digits at all");
    return;
  }
  System.out.println(numBig);

}


}
