
package A2;

import java.util.Objects;

enum type {
    DIGITAL,ANALOG
}
public class Clock {
    private int hour;
    private  int minute;
    private int second;
    private type typeClock;

    public Clock(int hour, int minute, int second, type typeClock){
       setHour(hour);
       setMinute(minute);
        setSecond(second);
        setTypeClock(typeClock);
    }

    public Clock() {
    }

    Clock(Clock other){
        this.hour = other.hour;
        this.minute = other.minute;
        this.second = other.second;
        this.typeClock = other.typeClock;
    }

    public void setHour(int hour) {
        if (hour > 25 || hour<0)
          this.hour =1;
       else this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute > 60 || minute<0)
        this.minute = 0;
        else this.minute =minute;
    }

    public void setSecond(int second) {
        if (second > 60 || second <0)
        this.second = 0;
        else this.second =second;
    }

    public void setTypeClock(type typeClock){
        this.typeClock = typeClock;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public type getTypeClock() {
        return typeClock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clock clock)) return false;
        return getHour() == clock.getHour() && getMinute() == clock.getMinute() && getSecond() == clock.getSecond() && getTypeClock() == clock.getTypeClock();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHour(), getMinute(), getSecond(), getTypeClock());
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                ", typeClock=" + typeClock +
                '}';
    }

    public static void main(String[] args) {
        Clock c = new Clock(2,40,60,type.DIGITAL);
        System.out.println("hgf");
        Clock c1= new Clock(c);
        System.out.println(c1);
        c.setTypeClock(type.ANALOG);
        System.out.println(c);
    }
}
