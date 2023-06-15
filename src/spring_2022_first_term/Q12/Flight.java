package spring_2022_first_term.Q12;

public class Flight {
    private final int MAX_CAPACITY =100;
    private String code;
    private String destination;
    private Time departureTime;
    private int duration;
    private int numOfPassengers;
    private boolean isFull;

    public Flight(String code, String destination, Time departureTime, int duration, int numOfPassengers) {
        this.code = code;
        this.destination = destination;
        this.departureTime = departureTime;
        this.duration = duration;
        this.numOfPassengers = Math.min(numOfPassengers, MAX_CAPACITY);
        this.isFull = numOfPassengers == MAX_CAPACITY;
    }
    public Flight(Flight other){
        this.code = other.code;
        this.destination = other.destination;
        this.departureTime = new Time(other.departureTime);
        this.duration = other.duration;
        this.numOfPassengers = other.numOfPassengers;
        this.isFull = other.isFull;
    }
    public int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public String getCode() {
        return code;
    }

    public String getDestination() {
        return destination;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    public boolean addPassengers (int num){
        if (this.numOfPassengers +num > MAX_CAPACITY) return false;
        this.numOfPassengers +=num;
        if (this.numOfPassengers == MAX_CAPACITY) this.isFull = true;
        return true;
    }
    public Time getArrivalTime(){
        int hours = this.duration / 60 +this.departureTime.getHour();
        int minutes = this.duration % 60+this.departureTime.getMinute();
        if (hours >24) hours -=24;
        return new Time(hours,minutes);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "MAX_CAPACITY=" + MAX_CAPACITY +
                ", code='" + code + '\'' +
                ", destination='" + destination + '\'' +
                ", departureTime=" + departureTime +
                ", duration=" + duration +
                ", numOfPassengers=" + numOfPassengers +
                ", isFull=" + isFull +
                '}';
    }

    public static void main(String[] args) {
        Time t2 = new Time(8,15);
        Time t3 = new Time(10,15);
        Flight f1 = new Flight("574","london",t2,240,56);
        Flight other = new Flight(f1);
        other.getDepartureTime().setHour(7);
        System.out.println(other.getDepartureTime());
        System.out.println(f1.getDepartureTime());
    }
}
