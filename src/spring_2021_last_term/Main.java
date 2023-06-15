package spring_2021_last_term;

import spring_2021_last_term.Q12.Date;
import spring_2021_last_term.Q12.FoodItem;
import spring_2021_last_term.Q12.Stock;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int Q = sc.nextInt();
        switch (Q){
            case 1:
                break;
            case 2:
                Snack s = new Snack("chocolate",200,7.5,200);
                System.out.println(s.isHealthy());
                Snack s1 = new Snack("chocolate",200,7.5,200);
                Snack s2 = new Snack("chocolate",400,7.5,200);
                Snack s3 = new Snack("chocolate",300,7.5,200);
                System.out.println(Snack.goodSnacks(new Snack[]{s,s1,s2,s3}));
                break;
            case 3:
                break;
            case 4:
                System.out.println( Solutions.Q4_A("123456"));
                Solutions.Q4_B();
                break;
            case 5:
                Solutions.Q5(10);
                break;
            case 6:
                break;
            case 7:
                Cityk c1 = new Cityk("jerusalem",2000000,200000);
                Cityk c2 = new Cityk("talmon",20000,200);
                System.out.println(c1.EqualityPatients(c2));
                c2.getCityColor();
                CountryStatus cs = new CountryStatus("01/02/2020");
                System.out.println(cs.addCity(c1));
                cs.addCity(c2);
                System.out.println(Arrays.toString(cs.CitiesByColor("red")));
                c1.setNumOfPatents(5);
                CountryStatus cs1 = new CountryStatus("01/02/2021");
                cs1.addCity(c1);
                CountryStatus.CityColorChange(cs,cs1);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                Date a = new Date(10,1,2023);
                Date b = new Date(10,3,2023);
                Date c = new Date(10,2,2023);
                FoodItem f =new FoodItem("milk",4,a,b,10,40,5.6);
                System.out.println(f.isFresh(c));
                f.howManyItems(10);
                Stock stock = new Stock();
                stock.howMany(5);
                stock.removeAfterDate(a);
                break;
            case 13:
                break;


        }
    }
}
