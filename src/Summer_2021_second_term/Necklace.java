package Summer_2021_second_term;

public class Necklace {
    private  int numRed;
    private  int numYellow;
    private  int numGreen;

    public Necklace(int numRed, int numYellow, int numGreen) {
        this.numRed = numRed;
        this.numYellow = numYellow;
        this.numGreen = numGreen;
    }

    public int getNumRed() {
        return numRed;
    }

    public int getNumYellow() {
        return numYellow;
    }

    public int getNumGreen() {
        return numGreen;
    }

    private boolean uniformNecklace(){
        return (numRed > 0 && numGreen == 0 && numYellow == 0) || (numRed == 0 && numGreen > 0 && numYellow == 0) || (numRed == 0 && numGreen == 0 && numYellow > 0);
    }
   private boolean perfectNecklace(){
        return numRed == numGreen && numGreen == numYellow;
    }
    private boolean boringNecklace(){
        return (numRed > 0 && numGreen > 0 && numYellow == 0) || (numRed > 0 && numGreen == 0 && numYellow > 0) || (numRed == 0 && numGreen > 0 && numYellow > 0);
    }

    public int Q2_b(){
        return uniformNecklace()?1:perfectNecklace()?2:boringNecklace()?3:4;
    }
    public static int Q2_c(Necklace[]arr,int num){
        int sum=0;
        for (Necklace i:arr){
            if (i.boringNecklace() && (i.getNumGreen()+i.getNumRed()+i.getNumYellow())>num) sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Necklace n = new Necklace(3,3,7);
        System.out.println(n.Q2_b());
    }
}
