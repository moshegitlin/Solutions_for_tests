import java.util.*;
public class Main2 {
    public static void main(String [] args){
        int [][]mat ={
                {1,2},
                {3,4,8},
                {5,6}
        };
        int max =0;
        for (int i = 0; i <mat.length ; i++) {
            if (max < mat[i].length)
                max =mat[i].length;
        }
        for (int i = 0; i <max; i++) {
            for (int j = 0; j < mat.length ; j++) {
                if (i > mat[j].length-1) {
                    continue;
                }
                System.out.println(mat[j][i]);
            }
        }
    }


}
