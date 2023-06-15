package spring_2022_first_term;

import java.util.*;

public class Cinema {
    private static final int NUM_HALLS = 6;
    private static final int HALL_CAPACITY = 200;
    private int [][] countFree;
   private boolean [][] cinemaStart;
    static Scanner sc = new Scanner(System.in);
    public Cinema() {
    this.cinemaStart= new boolean[NUM_HALLS][HALL_CAPACITY];
    this.countFree = new int[NUM_HALLS][1];
    }
public void inputOrders(){
        int hallNum;
        int numTickets;
        do {
            System.out.println("Enter hall number (1-6) and number of tickets: ");
            hallNum = sc.nextInt();
            if (hallNum < 1 || hallNum > 7) break;
            hallNum--;
            numTickets = sc.nextInt();
            if (countFree[hallNum][0] + numTickets >200) break;
            fillingPlaces(hallNum,numTickets);
            countFree[hallNum][0]+=numTickets;
        }while (true);
    System.out.printf("Order for hall %d: %f pizzas, %f tropicals\n", 1,(float)countFree[0][0]/8,(float)countFree[0][0]/20);
    for (int i = 1; i < 6; i++) {
    if (countFree[i][0] < 10){
        System.out.printf("Hall %d will not show the film\n", i+1);
    }else {
        System.out.printf("There are spaces available in hall %d, it is possible to move %d people\n", i+1,200-countFree[i][0]);
    }
    }
    }
    private void fillingPlaces(int hallNum,int numTickets){
        for (int i =countFree[hallNum][0] ; numTickets >0; i++,numTickets--) {
            cinemaStart[hallNum][i] = true;
        }
    }

    public String getCinemaStart() {

        return  Arrays.deepToString(cinemaStart);
    }
}

