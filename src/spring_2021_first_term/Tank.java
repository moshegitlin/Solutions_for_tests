package spring_2021_first_term;

public class Tank {
    private int capacity;
    private int amount;

    public Tank(int capacity, int amount) {
        this.capacity = capacity;
        this.amount = amount;
    }

    public Tank(int capacity) {
        this.capacity = capacity;
        this.amount=0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    boolean isAmount(){return this.amount>0;}

    boolean isPossible (int num, char op){
     if (op =='+'&& this.capacity - this.amount <=num)
         {
             this.amount += num;
             return true;
         }
     else if (op == '-' && this.amount >= num) {
         this.amount -= num;
         return true;
     } else return false;

    }
    static int fill (Tank t1, Tank t2){
        int amountGet = t1.getCapacity() - t1.getAmount();
        return Math.min(amountGet, t2.getAmount());
    }



}
