package Summer_2021_first_term.Q13;

import java.util.Arrays;

public class Mailbox {
    private Message[] inbox;
    private int noOfMes;

    public Mailbox(int num) {
        this.inbox = new Message[num];
        this.noOfMes =0;
    }
    public void addMail(Message m){
        if (noOfMes >= inbox.length) return;
       inbox[noOfMes++] = m;
    }
    public int howManyBetweenTimes(Time first, Time second){
        if (noOfMes==0) return -1;
        int sum =-1;
        for (Message m:inbox){
            if (m.getReceivingTime().before(second) && (!(m.getReceivingTime().before(first)))) sum++;
        }
        return sum+1;
    }
    private int numSubject(int num){
        int sum=0;
        for (Message message: inbox){
            if (message.getSubject() == num) sum++;
        }
        return sum;
    }
    public int mostPopularSubject() {
        int sum =numSubject(inbox[0].getSubject());
        int popular= inbox[0].getSubject();
        for (Message message: inbox){
           if (numSubject(message.getSubject()) > sum) {
               sum = numSubject(message.getSubject());
               popular = message.getSubject();
           }

        }
        return popular;
    }
}
