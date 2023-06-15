package Summer_2022_first_term;

public class Child {
    private String name;
    private char gender;
    private int year;
    private int month;

    public Child(String name, char gender, int year, int month) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public static void printByYear(Child[] arr, int year){
        int countMales=0;
        int countFemales=0;
        for (Child c:arr){
            if(c.getYear()== year && c.getGender()=='M')countMales++;
            else if (c.getYear()== year && c.getGender()=='F') countFemales++;
        }
        System.out.printf("In %d, %d boys and %d girls were born\n",year,countMales,countFemales);
    }
    public static void printByMonth(Child[] arr){
        for (int i = 1; i <= 12; i++) {
            int countMales=0;
            int countFemales=0;
            for (Child c:arr){
                if(c.getMonth()== i && c.getGender()=='M')countMales++;
                else if (c.getMonth()== i && c.getGender()=='F') countFemales++;
            }
            System.out.printf("In %d, %d boys and %d girls were born\n",i,countMales,countFemales);
        }
    }
}
