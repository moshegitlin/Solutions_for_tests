package Oop_homework.question_1;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x=0;
        this.y =0;
    }
    public Point(Point other){
        this.x= other.x;
        this.y = other.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point = ("+this.x+","+this.y+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point point)) return false;
        return this.x == point.getX() && this.y == point.getY();
    }

double distance (Point other){
        return Math.sqrt((Math.pow(this.x-other.x,2)+ Math.pow(this.y-other.y,2)));
}
}
