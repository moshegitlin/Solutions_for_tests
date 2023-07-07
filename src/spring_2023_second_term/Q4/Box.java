package spring_2023_second_term.Q4;

import java.util.Random;

public class Box {
    private  String color;
    private  int length;
    private  int width;
    private  int height;
    private static Random rd = new Random();

    public Box(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box() {
        this.color = "black";
        this.length = rd.nextInt(20,101);
        this.width = rd.nextInt(20,101);
        this.height = rd.nextInt(20,101);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public static boolean isBlackWhite(Box[] arr){
        int countBlack=0;
        int countWhite=0;
        for (Box b:arr){
            if(b.color.equals("black")) countBlack++;
            else if (b.color.equals("white")) countWhite++;
            else return false;
        }
        return countWhite >=1 && countBlack >=1;
    }
}
