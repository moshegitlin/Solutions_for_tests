package Summer_2022_second_term.Q7;

public class SportClube {
    private String name;
    private String sportName;
    private String city;
    private int countOfPlayer;
    private int countOfCoach;

    public SportClube(String name, String sportName, String city, int countOfPlayer, int countOfCoach) {
        this.name = name;
        this.sportName = sportName;
        this.city = city;
        this.countOfPlayer = countOfPlayer;
        this.countOfCoach = countOfCoach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountOfPlayer() {
        return countOfPlayer;
    }

    public void setCountOfPlayer(int countOfPlayer) {
        this.countOfPlayer = countOfPlayer;
    }

    public int getCountOfCoach() {
        return countOfCoach;
    }

    public void setCountOfCoach(int countOfCoach) {
        this.countOfCoach = countOfCoach;
    }

    @Override
    public String toString() {
        return "SportClube{" +
                "name='" + name + '\'' +
                ", sportName='" + sportName + '\'' +
                ", city='" + city + '\'' +
                ", countOfPlayer=" + countOfPlayer +
                ", countOfCoach=" + countOfCoach +
                '}';
    }
}
