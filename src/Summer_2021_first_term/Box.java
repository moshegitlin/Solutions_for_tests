package Summer_2021_first_term;
import java.util.Arrays;

public class Box {
    private String color;
    private int length;
    private int width;
    private int  height;

    public Box(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
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
    public Box(String color){
        this.color = color;
        this.length = 10;
        this.width = 10;
        this.height = 10;

    }
    public static String smallBox(Box [] arr){
        Box min = arr[0];
        String colors ="";
        int sum = min.height * min.length * min.width;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i].width * arr[i].length * arr[i].height)< sum) min =arr[i];
            else if ((arr[i].width * arr[i].length * arr[i].height)==sum) colors+= " "+"\n"+arr[i].color;


        }
        return min.color + colors;
    }

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Box b1 = new Box("green",3,3,3);
        Box bb = new Box("gre",3,3,3);
        Box b2 = new Box("red",4,3,8);
        Box b3 = new Box("blue",5,7,3);
        Box b4 = new Box("orange",6,3,9);
        Box [] arrbox = {bb,b1,b2,b3,b4};
//        System.out.println(Arrays.toString(arrbox));
        System.out.println(smallBox(arrbox));
    }
}
