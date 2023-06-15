package testers;
import java.lang.reflect.Array;
import java.util.*;



public class Main {
    static  Scanner a = new Scanner(System.in);
    public static boolean isBeautifulString(String str){
        if (str == null || str.length()%2!=0) return false;
        int [] arr =new int[26];
        char c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c<65 ||(c>91 &&c<97)||c>122) return false;
            if (c>=65 && c<=90) arr[c-'A'] ++;
            else  arr[c-'a'] --;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

//        String str = "faBdBAbbDF";
//        System.out.println(isBeautifulString(str));
//        int [] arr = {1,2,3,4,5,6,7,8,9,10,30,56,60,70,77,78,79,80,89,91,95,98,99,100,130,150,155,160,170,180,200};
//        int [] arr1 = new int[100];
//        System.out.println(arr.length);
//        System.out.println(binarySearch(arr1,201));
        int [] arr2 ={34,12,8,5,30,20,70,9};
        System.out.println(isInArray(arr2,0,34));
        System.out.println(isUniqueArray(arr2));

//            insertionSort(arr2);
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(str.length() / 2);
//        System.out.println(Character.isUpperCase(str.charAt(0)));
//        System.out.println(Character.isLowerCase(str.charAt(0)));
//        System.out.println(Character.isDigit(str.charAt(1)));
//        System.out.println(!(Character.isLetter(str.charAt(1))));

//
/*
       String input;
       int count=0;
       do {
        input=a.nextLine();
        boolean flag=false,flag1 = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='x' && !( flag)){
                flag=true;
            }
            if (input.charAt(i)=='y' && flag1){
                    flag1 =false;
            }
        }
        if (flag && flag1) count++;
       }while (input.length()<13);
        System.out.printf("The number of strings that contain the letter x but do not contain the letter y is %d: ",count);
*/
    }

    public static void insertionSort(int[] arr2) {
        int j;
        for (int i = 1; i < arr2.length; i++) {
            int newest = arr2[i];
            for ( j = i-1; j >=0 && arr2[j]>newest ; j--) {
                arr2[j+1] = arr2[j];
            }
            arr2[j+1] = newest;
        }
    }

    public static int binarySearch(int[] arr, int i) {
        int low =0, high = arr.length-1,mid,count=0;
        while (low<=high){
            count++;
            mid = (low +high) /2;
            if (arr[mid]==i){
                System.out.println(count);
                return mid;
            }

            if (arr[mid] <i) low = mid +1;
            else high = mid -1;

        }
        System.out.println(count);
        return -1;
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
public static boolean isInArray(int[]arr, int ind,int value){
    for (int i = ind+1; i < arr.length; i++) {
    if (arr[i]==value) return true;
    }
    return false;
}
public static boolean isUniqueArray(int[]arr){
    for (int i = 0; i < arr.length; i++) {
        if (isInArray(arr,i,arr[i])) return false;
    }
    return true;
}
}

