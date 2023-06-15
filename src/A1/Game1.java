package A1;

import java.util.Scanner;

public class Game1 {
    private int numOfMatches;
    private int maxMatches;
    private int currentPlayer;

    public Game1(int numOfMatches, int maxMatches) throws Exception {
        setNumOfMatches(numOfMatches);
        setMaxMatches(maxMatches);
        this.currentPlayer = 1;
    }

    public void setNumOfMatches(int numOfMatches) throws Exception {
        if (numOfMatches > 100 || numOfMatches < 10)
            throw new Exception("input a number between 10 to 100");
        else
            this.numOfMatches = numOfMatches;
    }

    public void setMaxMatches(int maxMatches) throws Exception {
        if (maxMatches < 1 || maxMatches >= this.numOfMatches)
            throw new Exception("input a number between 1 to " + (this.numOfMatches - 1));
        else
            this.maxMatches = maxMatches;
    }

    private void checkRemoveMatches() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many matches to remove?");
        int remove = sc.nextInt();
        if (remove > this.numOfMatches)
            throw new Exception("You entered more than the amount available");
        else if (remove > this.maxMatches || remove < 1)
            throw new Exception("Enter a number between 1 to " + this.maxMatches);
        else this.numOfMatches -= remove;
    }

    void RemoveMatches() {
        try {
            this.checkRemoveMatches();
        } catch (Exception e) {
            e.printStackTrace();
            this.RemoveMatches();
        }
    }

    private void ShowTable() {
        for (int i = 0; i < this.numOfMatches; i++) {
            System.out.print("| ");
        }
        System.out.println();
        System.out.println((currentPlayer == 1) ? "current player's  1" : "current player's 2");
    }

    private void GetNextPlayer() {
        this.currentPlayer *= -1;
    }

    public int ManageGame() {
        while (this.numOfMatches != 0) {
            this.ShowTable();
            this.RemoveMatches();
            this.GetNextPlayer();
        }
        return this.currentPlayer;
    }

   static class main {
        private int numOfGames;
        private int ScorePerWin;

        public main(int numOfGames) {
            this.numOfGames = numOfGames;
            this.ScorePerWin = 0;
        }

        private void Run() {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < numOfGames; ) {
                System.out.println("Enter number of matches for this game and how many matches can be removed each turn");
                int numOfMatches = sc.nextInt();
                int maxMatches = sc.nextInt();
                try {
                    Game1 a = new Game1(numOfMatches, maxMatches);
                    int Score = a.ManageGame();
                    this.ScorePerWin += (Score == 1) ? 1 : 0;
                    i++;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            boolean check = ((this.numOfGames - this.ScorePerWin) <= this.ScorePerWin);
            System.out.println("player number " + (check ? 1 : 2)+ " to win!!");
        }

        public static void main(String[] args) {
            main m = new main(2);
            m.Run();
        }
    }
}