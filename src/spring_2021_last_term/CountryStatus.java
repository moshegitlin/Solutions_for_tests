package spring_2021_last_term;

import java.util.Arrays;

public class CountryStatus {
    private String date;
    private Cityk [] cites;
    private int nCity;

    public CountryStatus(String date) {
        this.date = date;
        this.cites = new Cityk[100];
        this.nCity =0;
    }

    @Override
    public String toString() {
        return "CountryStatus{" +
                "date='" + date + '\'' +
                ", cites=" + Arrays.toString(cites) +
                ", nCity=" + nCity +
                '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    boolean addCity(Cityk city){
        if(nCity >= cites.length) return false;
        cites[nCity++] = city;
        return true;
    }
    String[] CitiesByColor(String color){
        int count=0;
        String[] firstArr = new String[cites.length];
        for (Cityk c:cites){
            if (c.getCityColor().equals(color)){
                firstArr[count++] = c.getName();
            }
        }
        String [] newArr = new String[count];
        for (int i = 0; i < count; i++) {
            newArr[i] = firstArr[i];
        }
        return newArr;
    }
    static void CityColorChange(CountryStatus c1,CountryStatus c2){
        String [] redCity = c1.CitiesByColor("red");
        String [] orangeCity = c2.CitiesByColor("orange");
        String [] greenCity = c2.CitiesByColor("green");
        int sizeForC2 = Math.max(orangeCity.length, greenCity.length);
        for (int i = 0; i < redCity.length; i++) {
            for (int j = 0; j < sizeForC2; j++) {
                if (redCity[i].equals(orangeCity[j])) {
                    System.out.println("The city of "+orangeCity[j]+ " changed the color of orange");
                }
                   if (redCity[i].equals(greenCity[j])){
                       System.out.println("The city of "+greenCity[j]+ " changed the color of green");
            }
        }
            }
        }
    }

