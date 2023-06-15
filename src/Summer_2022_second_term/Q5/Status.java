package Summer_2022_second_term.Q5;

public class Status {
    private int count1;
    private int count2;
    private String names;

    public Status() {
        this.count1 = 0;
        this.count2 = 0;
        this.names = "";
    }

    public int getCount1() {
        return count1;
    }

    public void setCount1(int count1) {
        this.count1 = count1;
    }

    public int getCount2() {
        return count2;
    }

    public void setCount2(int count2) {
        this.count2 = count2;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
    public static Status worldStatus(Country[] arr){
        Status a = new Status();
        int no_infections = 0;
        int more_recover=0;
        StringBuilder infected_have_recovered= new StringBuilder("Countries where most of the infected have recovered:\n");
        for (int i = 0; i < arr.length; i++) {
            no_infections += (arr[i].getInfected() ==0)?1:0;
            more_recover += (arr[i].getRecovered()>arr[i].getDead())?1:0;
            infected_have_recovered.append((arr[i].getRecovered() > arr[i].getInfected() / 2) ? " " + arr[i].getName() : "");
        }
        a.count1 =no_infections;
        a.count2 = more_recover;
        a.names = infected_have_recovered.toString();
        return a;
    }

    @Override
    public String toString() {
        return "Status{" +
                "count1=" + count1 +
                ", count2=" + count2 +
                ", names='" + names + '\'' +
                '}';
    }
}
