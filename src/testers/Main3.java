package testers;

import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) throws InterruptedException {

        the_last_match();


    }
    public static void the_last_match() throws InterruptedException {

        start_game();
    }
    public static void start_game() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of matches:");
        int num_of_matches = input.nextInt();

        while(num_of_matches < 2) {
            System.out.println("Please try again,\n(choose the number of matches that is at least 2, to start the game).");

            Thread.sleep(500);

            System.out.println("Enter the number of matches:");
            num_of_matches = input.nextInt();
        }
        System.out.println("Enter the max number of matches to draw:");
        int max_num_of_matches = input.nextInt();
        while(max_num_of_matches  < 1 || max_num_of_matches >= num_of_matches){
            System.out.println("Please try again,\n(the number has to be grater then '0' and lesser then " + num_of_matches);
            Thread.sleep(500);
            System.out.println("Enter the max number of matches to draw:");
            max_num_of_matches = input.nextInt();
        }
        System.out.println("Choose the first player to play: 1 / 2 ?");
        String player = input.next();
        boolean first_player_approved = false;
        while(!first_player_approved) {
            if (!(player.equals("1")) && !(player.equals("2"))) {
                System.out.println("NoT A PlAyEr, please try again: ");
                System.out.println("Choose the first player to play: 1 / 2 ?");
                player = input.next();
            } else {
                first_player_approved = true;
            }
        }
        if(player.equals("1")){
            player = "Player TWO";
        } else if (player.equals("2")){
            player = "Player ONE";
        }
        Thread.sleep(500);
        System.out.println("Game Table is READY!");
        Thread.sleep(1000);
        System.out.println("The number of matches is: "+num_of_matches);
        Thread.sleep(500);
        System.out.println("The max number of matches to draw is: "+ max_num_of_matches+"\n"+"\n");
        Thread.sleep(500);
        boolean winner = false;
        while(!winner) {
            if(player.equals("Player ONE")){
                player = "Player TWO";
            } else if (player.equals("Player TWO")) {
                player = "Player ONE";
            }
            System.out.println(player + " turn, ");
           num_of_matches =  RemoveMatches(num_of_matches, max_num_of_matches);
           if(num_of_matches == 0){
               winner = true;
               System.out.println(player +" is the winner!");
           }
        }
    }
    public static int RemoveMatches(int num_of_matches,int max_num_of_matches){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of matches you'd like to remove:");
        int remove_num_of_matches = input.nextInt();
        if (max_num_of_matches >= num_of_matches){
            max_num_of_matches = num_of_matches -1;
        }
        else if (num_of_matches == 1){
            max_num_of_matches = 1;
        }
        if(remove_num_of_matches > max_num_of_matches){
            System.out.println("-1");
        }
        else {
            num_of_matches -= remove_num_of_matches;
            if (num_of_matches <= 0) {
                num_of_matches = 0;
                System.out.println("The number of matches is: "+num_of_matches);
                System.out.println("The max number of matches to draw is: "+ max_num_of_matches);
            }
            else {
                System.out.println("----------  Game Table  ----------");
                System.out.println("The current number of matches is: "+num_of_matches);
                System.out.println("The current max number of matches to draw is: "+ max_num_of_matches+"\n");
            }
        }
        return num_of_matches;
    }
}