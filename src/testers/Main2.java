package testers;

import java.util.*;
public class Main2 {
    public static void main(String [] args){
        int [][]mat ={
                {1,2},
                {3,4,8},
                {5,6}
        };
        int max =0;
        for (int[] value : mat) {
            if (max < value.length)
                max = value.length;
        }
        for (int i = 0; i <max; i++) {
            for (int[] ints : mat) {
                if (i > ints.length - 1) {
                    continue;
                }
                System.out.println(ints[i]);
            }
        }
    }


}
