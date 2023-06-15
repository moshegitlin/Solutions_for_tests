package Summer_2021_first_term;

import java.util.*;
public class Gift{
    private int code;
    private  double price;
    private char type;

    public Gift(int code, double price, char type) {
        this.code = code;
        this.price = price;
        setType(type);
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        if (type =='M'|| type =='F'||type =='U'|| type =='K')
        this.type = type;
        else this.type = 'M';

    }
     boolean isForMan(){
        return this.type =='M'||this.type =='U';
     }
     static void Q8_c(Gift [] arr,int sum){
        int count =0;
        boolean flag=true;
        Gift [] newArr = new Gift[arr.length];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i].isForMan()){
                 for (int j = i+1; j < newArr.length; j++) {
                    if (arr[i].getCode() == arr[j].getCode()) {
                        if (j == arr.length-1) newArr[count++] = arr[i];
                        flag =false;
                        break;
                    }
                 }
                 if (flag) {
                     newArr[count++] = arr[i];
                     flag=true;
                 }
             }

         }
         if (count < 3) {
             System.out.println("No suitable combination of three gifts found.");
             return;
         }
        for (int i = 0; i < count - 2; i++) {
        for (int j = i + 1; j < count - 1; j++) {
            for (int k = j + 1; k <count; k++) {
                double totalPrice = newArr[i].getPrice() +
                        newArr[j].getPrice() +
                        newArr[k].getPrice();
                if (totalPrice == sum) {
                    System.out.println("Gifts codes: " +
                            newArr[i].getCode() + ", " +
                            newArr[j].getCode() + ", " +
                            newArr[k].getCode());
                }
            }
        }
    }
     }
}
