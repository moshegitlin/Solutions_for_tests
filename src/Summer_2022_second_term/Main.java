package Summer_2022_second_term;

import Summer_2022_second_term.Q11.MonthFuel;
import Summer_2022_second_term.Q4.Act;
import Summer_2022_second_term.Q4.Actor;
import Summer_2022_second_term.Q5.Country;
import Summer_2022_second_term.Q5.Status;
import Summer_2022_second_term.Q7.SportClube;
import Summer_2022_second_term.Q7.SportUnion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("Enter a question number");
        int Q = sc.nextInt();
        switch (Q){
            case 1:
                System.out.println(Solutions.Start_and_end_sum_letter());
                break;
            case 3:
                int [] arr ={1,2,6,4,5,3,9,10,7};
                System.out.println(Solutions.isPeak(arr,2));
                System.out.println(Solutions.Total_peaks(arr));
                break;
            case 4:
                Actor a = new Actor("moshe",47,6);
        Actor b = new Actor("moshe",47,6);
        Actor c = new Actor("moshe",47,10);
        Actor d = new Actor("moshe",47,6);
        Actor e = new Actor("moshe",47,12);
        Actor f = new Actor("moshe",47,6);
        Act act1 = new Act("shoping",250);
        System.out.println(act1);
        act1.Add_actor(a);
        act1.Add_actor(b);
        System.out.println(act1.The_Number_of_pro_actors());
        act1.Add_actor(c);
        act1.Add_actor(d);
        act1.Add_actor(e);
        act1.Add_actor(f);
        System.out.println(act1);
        System.out.println(act1.getActArr());
        System.out.println(act1.The_Number_of_pro_actors());
                break;
            case 5:
                Country c1 = new Country("A",200000,100000,2000);
                Country c2 = new Country("B",300000,200000,5000);
                Country c3 = new Country("C",100000,95000,10000);
                Country[] countriesArr ={c1,c2,c3};
                System.out.println(Status.worldStatus(countriesArr));
                break;
            case 7:
                SportClube s1 =new SportClube("A","AB","ABC",45,10);
                SportClube s2 =new SportClube("B","BB","BBC",60,25);

                SportUnion sp1 = new SportUnion("CBC");
                SportUnion sp2 = new SportUnion("CBf");
                System.out.println(sp1.addToSportUnion(s1));
                System.out.println(sp1.addToSportUnion(s1));
                System.out.println(sp1.addToSportUnion(s2));
                System.out.println(sp1.getNameTheMostCoaches());
                SportClube s5 =new SportClube("A","AB","ABC",70,10);
                SportClube s6 =new SportClube("F","FB","FBC",60,25);
                SportClube s3 =new SportClube("C","CB","CBC",50,10);
                SportClube s4 =new SportClube("D","DB","DBC",60,25);
                sp2.addToSportUnion(s2);
                sp2.addToSportUnion(s3);
                sp2.addToSportUnion(s4);
                sp2.addToSportUnion(s5);
                sp2.addToSportUnion(s6);
               SportUnion.Q7_C(new SportUnion[]{sp1,sp2});
                break;
            case 11:
                MonthFuel M = new MonthFuel();
                M.addInvoice(2,"123456789","A",39.54);
                M.addInvoice(7,"123456789","A",59.54);
                M.addInvoice(7,"56766543","B",45.54);
                M.addInvoice(10,"56766543","B",39.54);
                M.addInvoice(32,"34245667","C",39.54);
                System.out.println(Arrays.toString(M.fuelPerDay()));
                System.out.println(M.maxFuelPerCar());
                break;
            default:
                System.out.println("there is not such question");
                break;
        }




    }

}
