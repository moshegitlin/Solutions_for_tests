package spring_2022_first_term.Q12;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public Time(Time other){
        this.hour = other.hour;
        this.minute = other.minute;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return "Time{" +
                 hour +
                ":" + minute +
                '}';
    }

    public boolean before(Time other) {
        return other.hour >= hour && (hour != other.hour || other.minute > minute);
    }
}
