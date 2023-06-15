package spring_2022_first_term.Q8;

import java.util.Arrays;

public class VickeryAuction {
    private String product;
    private int realPrice;
    private Participant[] Participant;
    private int current;

    public VickeryAuction(String product, int realPrice) {
        this.product = product;
        this.realPrice = realPrice;
        this.Participant = new Participant[100];
        this.current=0;
    }

    public String getProduct() {
        return product;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public spring_2022_first_term.Q8.Participant[] getParticipant() {
        return Participant;
    }

    @Override
    public String toString() {
        return "VickeryAuction{" +
                "product='" + product + '\'' +
                ", realPrice=" + realPrice +
                ", Participant=" + Arrays.toString(Participant) +
                ", current=" + current +
                '}';
    }
    public boolean addParticipant(Participant a){
        int numPercent= 100*(a.getPrice()-realPrice)/realPrice;
        if ((numPercent >50) && current < 100){
            Participant[current++] = a;
            return true;
        }
        return false;
    }
    public Winner winner(){
        Participant win = this.Participant[0];
        for (int i = 0; i < this.current; i++) {
            if (this.Participant[i].getPrice()> win.getPrice()) win =this.Participant[i];
        }
        int lastPrice =0;
        for (int i = 0; i < this.current; i++) {
            if (this.Participant[i].getPrice()> lastPrice && this.Participant[i].getPrice() < win.getPrice()) lastPrice = this.Participant[i].getPrice();
        }
        return new Winner(win.getName(),lastPrice);
    }
}
