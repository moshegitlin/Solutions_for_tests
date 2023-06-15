package A1;

public class Test1 {
     public static boolean Crossing_array (int [] arr){
        for (int i = 0; i < arr.length -2; i+=2) {
            if (arr[i] >= arr [i+2]) {
                return false;
            }
        }
        for (int i = 1; i < arr.length-2; i+=2) {
            if (arr[i] <= arr [i+2]) {
                return false;
            }

        }
        return true;
    }

   public static int Min_Crossing_array (int [] arr){
        if (arr.length % 2 ==0) {
            return (arr [0] <arr[arr.length-1]) ?arr[0]:arr[arr.length-1];
        }
        return (arr [0] <arr[arr.length-2]) ?arr[0]:arr[arr.length-2];
    }

    static int Updownarray (int [] arr){
         int peak =0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i +1] ) {
                peak = i;

                break;
            }


        }
        System.out.println(peak);
        if (peak ==0) {
            return -1;
        }
        for (int i = peak; i < arr.length-1; i++) {
            if (arr[i] < arr[i +1] ) {
                return -1;
            }
        }
        return peak;
    }
    static String Print_a_string_by_index(String str){
         String All_prints = "";
        for (int i = 0; i < str.length(); i++) {
            All_prints += str.substring(i)+"\n";
        }
        return All_prints;
    }
}
