package Summer_2022_first_term;

import java.util.Scanner;

public class SmallBrother {
    private int[] votes;
    private int numOfPart;
    static Scanner sc = new Scanner(System.in);
    public SmallBrother(int n) {
        this.votes = new int[n];
        this.numOfPart = n;
    }

    public int getNumOfPart() {
        return numOfPart;
    }
    public void voting(){
        int numPart;
        do {
            System.out.printf("Enter a participant number between 1 and %d",votes.length);
           numPart = sc.nextInt();
           if (numPart > 0 && numPart <=votes.length && votes[numPart-1] !=-1) votes[numPart-1]++;
        }while (numPart !=0);
    }
    public void update(){
    int minVotes=-1;
    int indexMin=-1;
    for (int i =0;i< votes.length;i++){
        if (votes[i] != -1){
            minVotes =votes[i];
            indexMin =i;
            break;
        }
        }
        if (indexMin ==-1)return;
        for (int j = 0; j < votes.length; j++) {
            if (votes[j] < minVotes && votes[j]!=-1){
                minVotes = votes[j];
                indexMin = j;
            }
    }
        votes[indexMin] =-1;
        numOfPart--;
    }
    public boolean isFinish(){
        if (numOfPart != 3) return false;
        int num1 =-1,num2=-1,num3=-1;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i]!=-1 && num1 ==-1) num1 = i+1;
            else if (votes[i]!=-1 && num2 ==-1) num2 =i+1;
            else if(votes[i]!=-1) num3 = i+1;
        }
        System.out.printf("The participants who reached the final in random order:number 1: %d\nNumber 2: %d\nNumber 3: %d",num1,num2,num3);
        return true;
    }
}
