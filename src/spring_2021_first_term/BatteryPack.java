package spring_2021_first_term;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class BatteryPack {
    private double price;
    private Battery [] batteries;

    public BatteryPack(double price) {
        this.price = price;
        setBattery();
    }
    static void  checkPrice(BatteryPack b , double num){
        System.out.println((num > b.price)?String.format("%s %f","can be purchased. The surplus is:",num- b.price)
                :(num < b.price)?String.format("%s %f","Unable to purchase. The amount missing is:",b.price -num):
                "OK");
    }
   boolean isEnough(double v){
        double sum =0;
        for (Battery i: this.batteries){
            sum+= i.getVolt();
        }
        return sum > v;
   }

    @Override
    public String toString() {
        return "BatteryPack{" +
                "price=" + price +
                ", batteries=" + Arrays.toString(batteries) +
                '}';
    }

    private void setBattery(){
        this.batteries = new Battery[12];
        Random rd = new Random();
        for (int i=0;i<this.batteries.length;i++){
            char size = (char) (rd.nextInt(4)+ 'A');
            double volt = rd.nextDouble(1,100)*10.0;
            volt =Math.round(volt)/10.0;
            Battery a = new Battery(size,volt);
            this.batteries[i] = a;
        }
    }

    public static void main(String[] args) {

//        BatteryPack bc = new BatteryPack(125);
////        bc.setBattery();
//        System.out.println(Arrays.toString(bc.batteries));


            }
        }




