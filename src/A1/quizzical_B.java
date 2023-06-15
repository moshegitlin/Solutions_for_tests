package A1;

import java.util.Arrays;

public class quizzical_B {
   
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String allString="";
        String allString1="";
        for (int i = 0; i < word1.length; i++) {
            allString += word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            allString1 += word2[i];
        }
        return allString.equals(allString1);
    }

    public static String restoreString(String s, int[] indices) {
        char [] chararr= s.toCharArray();
        String newString ="";
        for (int i = 0; i < indices.length; i++) {
            chararr[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i <chararr.length ; i++) {
            newString+=chararr[i];
        }
        return newString;
    }

    public static int findNumbers(int[] nums) {
     int count =0;
        for (int i = 0; i <nums.length ; i++) {
            if (String.valueOf(nums[i]).length()%2==0) count++;
        }
        return count;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
       int [] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count =0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] >nums[j]) count++;
            }
            newArr[i] = count;
        }
        return newArr;
    }

    static class Car{
    private String type_of_the_car;
    private String name_the_model;
    private String color_of_car;

        public Car(String type_of_the_car, String name_the_model, String color_of_car) {
            this.type_of_the_car = type_of_the_car;
            this.name_the_model = name_the_model;
            this.color_of_car = color_of_car;
        }

        public String getType_of_the_car() {
            return type_of_the_car;
        }

        public void setType_of_the_car(String type_of_the_car) {
            this.type_of_the_car = type_of_the_car;
        }

        public String getName_the_model() {
            return name_the_model;
        }

        public void setName_the_model(String name_the_model) {
            this.name_the_model = name_the_model;
        }

        public String getColor_of_car() {
            return color_of_car;
        }

        public void setColor_of_car(String color_of_car) {
            this.color_of_car = color_of_car;
        }

        public boolean isSameCar(Car c){
            return (this.type_of_the_car.equals(c.type_of_the_car)&&
                    (this.name_the_model.equals(c.name_the_model)));
            
        }
    }

    public static void main(String[] args) {
//        String [] strArr ={"a","bc"};
//        String [] strArr1 ={"ab","c"};
//        System.out.println(arrayStringsAreEqual(strArr,strArr1));
//        int [] intArr = {1,23,222,2222};
//        System.out.println(findNumbers(intArr));
//        int [] intArr1 = {8,7,5,3,2,1};
//        System.out.println(Arrays.toString(intArr1));
//        System.out.println(Arrays.toString(smallerNumbersThanCurrent(intArr1)));
//        Car A = new Car("MG","G3","blue");
//        Car B = new Car("MG","G3","black");
//        System.out.println(A.isSameCar(B));

    }
}
