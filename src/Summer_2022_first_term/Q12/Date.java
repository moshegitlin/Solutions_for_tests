package Summer_2022_first_term.Q12;

public class Date {
    private  int dey;
    private  int month;
    private  int year;

    public Date(int dey, int month, int year) {
        this.dey = dey;
        this.month = month;
        this.year = year;
    }

    public Date() {
        this.dey = 1;
        this.month = 1;
        this.year = 2020;
    }
    public Date(Date o){
        this.dey = o.dey;
        this.month = o.month;
        this.year = o.year;
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
        return "Date = "+((dey <10)?String.format("%s%d","0",dey):dey)+"/"
                +(month <10?String.format("%s%d","0",month):month)+"/"+year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Date date)) return false;
        return getDey() == date.getDey() && getMonth() == date.getMonth() && getYear() == date.getYear();
    }
    boolean before(Date o){
        return o.year >= year && (year != o.year || o.month >= month) && (year != o.year || month != o.month || o.dey >= dey);
    }


}
