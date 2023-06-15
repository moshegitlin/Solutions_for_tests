package Summer_2022_first_term.Q12;

public class Refrigerator {
    private final int MAX_CAKES = 30;
    private Cake[] cakes;
    private int numOfCakes;

    public Refrigerator() {
        this.cakes =new Cake[MAX_CAKES];
        this.numOfCakes=0;
    }

    public void setCakes(Cake cake) {
        if (this.numOfCakes >= MAX_CAKES-1) return;
        this.cakes[this.numOfCakes++] = cake;
    }

    public Cake mostFresh(){
        if(numOfCakes ==0) return null;
        Cake c = cakes[0];
        for (int i = 1; i < numOfCakes; i++) {
            if (!(cakes[i].getLastDate().before(c.getLastDate()))) c= cakes[i];
        }
        return c;

    }
    public void removeNotFresh(Date d){
        for (int i = 0; i < numOfCakes; i++) {
            if (cakes[i].getLastDate().before(d)){
                cakes[i] = cakes[numOfCakes-1];
                cakes[--numOfCakes]=null;
            }
        }
    }
    public int purchaseOrder (String[] names){
        int sum =0;
        boolean flag1 = true;
        for(String name:names){
            boolean flag = true;
            int sumt =0;
            for (int i = 0; i < numOfCakes && flag; i++) {
                if (name.equals(cakes[i].getName())) {
                    flag = false;
                    sumt = cakes[i].getPrice();
                }
            }
            if (flag){
                flag1=false;
                System.out.println(name);
            }else if(flag1) sum+= sumt;

        }
        return flag1?sum:0;
    }
}
