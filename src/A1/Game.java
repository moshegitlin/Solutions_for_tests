package A1;

import java.util.Scanner;

public class Game {
    private int numOfMatches;
    private int maxMatches;
    private int numOfGames;
    private int currentPlayer;
    private  static int ScorePOne =0;

    public Game(int numOfGames) {
        this.numOfMatches = 10;
        this.maxMatches = 3;
        this.numOfGames = numOfGames;
        this.currentPlayer =1;
    }

    private void Run() {
        for (int i = 0; i < numOfGames; i++) {
          int Score= this.ManageGame();
          ScorePOne += (Score ==1)?1:0;
           this.currentPlayer =1;
        }
        System.out.println("player number "+ ((numOfGames-ScorePOne <ScorePOne)?1:2));

    }

    void RemoveMatches (){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many matches to remove?");
        int remove =sc.nextInt();
        while (remove > this.numOfMatches || remove > this.maxMatches || remove <1){
            System.out.println("Enter a number between 1 to "+this.maxMatches);
            remove =sc.nextInt();
        }
         this.numOfMatches -= remove;
    }
     void ShowTable (){
         for (int i = 0; i < this.numOfMatches; i++) {
             System.out.print("| ");
         }
         System.out.println();
         System.out.println((currentPlayer ==1)?"current player's  1":"current player's 2");
    }
   private void GetNextPlayer(){
this.currentPlayer  *= -1;
    }
    public int ManageGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of matches for this game");
        int test = sc.nextInt();
        while (test >100 || test <10){
            System.out.println("input a number between 10 to 100");
            test = sc.nextInt();
        }
        System.out.println("Enter how many matches can be removed each turn");
        int test1 =sc.nextInt();
        while (test1 <1 || test1 >= test){
            System.out.println("input a number between 1 to " +(test -1));
            test1 =sc.nextInt();
        }
        this.numOfMatches = test;
        this.maxMatches =test1;
        while (this.numOfMatches !=0){
            this.ShowTable();
            this.RemoveMatches();
            this.GetNextPlayer();
        }
        return this.currentPlayer;
    }
    static class Main{
        public static void main(String[] args) {
            Game myGame = new Game(2);
            myGame.Run();
        }
    }


}




