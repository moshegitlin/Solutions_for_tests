package spring_2022_first_term;

import spring_2022_first_term.Q12.*;
import spring_2022_first_term.Q5.*;
import spring_2022_first_term.Q8.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a question number");
        int Q = sc.nextInt();
        switch (Q){
            case 2:
                System.out.println(Arrays.toString(Solutions.Q2(4)));
                break;
            case 4:
        Cinema c = new Cinema();
        c.inputOrders();
        break;
            case 5:
                Song ns=new Song("Ququ","Buku",120);
                Song ns1=new Song("Lala","Bu",120);
                Song ns2=new Song("bb","cc",120);
                System.out.println(ns.status());
                Disc dic = new Disc("num1",new Song[]{ns,ns1,ns2});
                System.out.println(dic.exist("Ququ","Buku"));
                System.out.println(dic.exist("Ququy","Bukuj"));
                Disc dic2 = new Disc("num2",new Song[]{ns,ns1});
                System.out.println(Disc.largeDiscName(dic,dic2));
                System.out.println();
                break;
            case 7:
                Student st = new Student("316287456",new int[]{60,50, 80, -1, 60,70},new int[]{80,90,90,75,-1,70});
                Student st1 = new Student("208567843",new int[]{60,50, 80, -1, 60,70},new int[]{80,90,90,75,-1,60});
                Student st2 = new Student("416287256",new int[]{60,50, 80, -1, 60,70},new int[]{80,100,90,75,-1,70});
                System.out.println(st.isImproved());
                Student [] students = {st,st1,st2};
                System.out.println(Arrays.toString(Student.Q7_b(students)));
                break;
            case 8:
                Participant p1 = new Participant("koko","324590876",700);
                Participant p2 = new Participant("moshe","208767934",900);
                Participant p3 = new Participant("avi","324590876",310);
                Participant p4 = new Participant("bob","324590876",250);
                VickeryAuction v1 = new VickeryAuction("parking",200);
                System.out.println(v1.addParticipant(p1));
                System.out.println(v1.addParticipant(p2));
                System.out.println(v1.addParticipant(p3));
                System.out.println(v1.addParticipant(p4));
                System.out.println(v1.winner());
                break;
            case 11:
                System.out.println(Solutions.specialNumber(12551));
                System.out.println(Solutions.specialNumber(4254));
                int[] arr ={12551, 6215, 77, 4254, 4,-561};
                int [] arr2= {12551, 4, 6215, 77, 4254, -561};
                System.out.println(Solutions.isSpecialArray(arr));
                System.out.println(Solutions.isSpecialArray(arr2));
                System.out.println(Arrays.toString(Solutions.buildSpecialArray(arr,arr2)));
                break;
            case 12:
                Time t1 = new Time(9,15);
                Time t2 = new Time(8,15);
                Time t3 = new Time(10,15);
                Flight f1 = new Flight("574","london",t1,240,56);
                Flight f2 = new Flight("575","london",t2,240,36);
                Flight f3 = new Flight("576","Zurich",t3,240,66);
                System.out.println(f1.isFull());
                System.out.println(f1.addPassengers(32));
                System.out.println(f1.getArrivalTime());
                Airport a1 = new Airport(20);
                a1.setFlight(f1);
                a1.setFlight(f2);
                a1.setFlight(f3);
                System.out.println(a1.firstFlightToPlace("london"));
                System.out.println(a1.movePassengers("574",5));
                break;
            case 14:
                int [][] mat ={
                        {5 ,4,1,0  ,0,3},
                        {1,10,7,1,123,3},
                        {6, 1,7,0,  0,2},
                        {1,10,21,5, 5,2},
                        {1,10,1,10,10,1}
                };
                int [][] mat1 ={
                        {5 ,4,1,0  ,0,3},
                        {1,1,7,1,3,3},
                        {6, 1,7,0,  0,2},
                        {1,10,1,5, 5,2},
                        {1,10,1,10,10,1}
                };
//                A
        System.out.println(Solutions.hasSadCellWithValue(mat,10));
//        B
                System.out.println(Arrays.toString(Solutions.AllTheSadValues(mat1)));
//                C
                Solutions.bigTwDigitForArr(mat);
                Solutions.bigTwDigitForArr(mat1);
                break;
            default:

                System.out.println("there is not such question");

        }
    }
}
