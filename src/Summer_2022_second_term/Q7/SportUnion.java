package Summer_2022_second_term.Q7;

public class SportUnion {
    private String unionName;
    private SportClube[] unionData;
    private int numberUnion;

    public SportUnion(String unionName) {
        this.unionName = unionName;
        this.unionData = new SportClube[100];
        this.numberUnion = 0;
    }

    public String getUnionName() {
        return unionName;
    }

    public void setUnionName(String unionName) {
        this.unionName = unionName;
    }

    public SportClube[] getUnionData() {
        return unionData;
    }

    public void setUnionData(SportClube[] unionData) {
        this.unionData = unionData;
    }

    public int getNumberUnion() {
        return numberUnion;
    }

    public void setNumberUnion(int numberUnion) {
        this.numberUnion = numberUnion;
    }
    public boolean addToSportUnion(SportClube s){
        if (numberUnion >= this.unionData.length) return false;
        for (SportClube sp: unionData){
            if(sp ==null) break;
            if (sp.getName().equals(s.getName())
                    && sp.getCity().equals(s.getCity())
                    && sp.getSportName().equals(s.getSportName()))return false;
        }
        unionData[numberUnion++] = s;
        return true;
    }
    public String getNameTheMostCoaches(){
//    The function returns the name of the club that has the most coaches
        int maxOfCoach =unionData[0].getCountOfCoach();
        String nameMaxOfCoach =unionData[0].getName();
        for (int i = 1; i < numberUnion; i++) {
         if(unionData[i].getCountOfCoach()>maxOfCoach){
             maxOfCoach = unionData[i].getCountOfCoach();
             nameMaxOfCoach= unionData[i].getName();
         }
        }
        return nameMaxOfCoach;
    }
    public static void Q7_C(SportUnion[]arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].numberUnion>=5){
                int count =0;
                for (int j = 0; j < arr[i].numberUnion; j++) {
                    if(arr[i].unionData[j].getCountOfPlayer()>=50)count++;
                }
                if (count==arr[i].numberUnion){
                    System.out.printf("The %s Sports Association is an outstanding association",arr[i].getUnionName());
                }
            }
        }
    }
}
