package Summer_2021_first_term.Q13;

import Oop_homework.question_2.Date;

public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return "Time [" +hour+":"+minute+']';
    }

    public boolean before(Time other) {
        return other.hour >= hour && (hour != other.hour || other.minute > minute);
    }

    public Time addFiveMinutes () {
        return new Time(hour,minute+5);
    }










}
