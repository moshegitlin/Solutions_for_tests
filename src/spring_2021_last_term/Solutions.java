package spring_2021_last_term;

import java.util.*;

public class Solutions {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static boolean Q4_A(String s){
        if (s.length() <8 || s.charAt(0) <'A'|| s.charAt(0) >'Z'||s.charAt(s.length()-1) <'0'|| s.charAt(s.length()-1)>'9')return false;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)== s.charAt(i+1)) return false;
        }
        return true;
    }
    static void Q4_B(){
        int count =0;
        System.out.println("Type a password");
        while (!(Q4_A(sc.nextLine()))){
            count++;
            System.out.println("Type password again");
        }
        System.out.println("The number of incorrect passwords entered:  "+count);
    }

private static boolean checks(int[]arr,int num){
    //    The function checks whether the number exists in the array
        for (int i:arr){
            if (i==num)return false;
        }
        return true;
}

    static void Q5(int num){
        int [] arr = new int[num];
        int i =0;
        while (num >0){
            int randomNumber = rd.nextInt(10,100);
           if (checks(arr,randomNumber)){
               arr[i++] = randomNumber;
               num--;
           }

//            System.out.println(randomNumber);
        }
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr));

    }
    static void Q5_test(int num) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < num) {
            set.add(rd.nextInt(90) + 10); // generate random number between 10 and 99 (inclusive)
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }










}
