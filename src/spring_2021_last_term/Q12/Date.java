package spring_2021_last_term.Q12;

public class Date {
    private int dey;
    private int month;
    private int year;

    public Date(int dey, int month, int year) {
        this.dey = dey;
        this.month = month;
        this.year = year;
    }

    public int getDey() {
        return dey;
    }

    public void setDey(int dey) {
        this.dey = dey;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "dey=" + dey +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date date)) return false;
        return getDey() == date.getDey() && getMonth() == date.getMonth() && getYear() == date.getYear();
    }

    boolean before(int year,int month ,int dey){
        return year >= this.year && (this.year != year || month >= this.month) && (this.year != year || this.month != month || dey >= this.dey);
    }
}
