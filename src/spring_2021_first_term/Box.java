package spring_2021_first_term;

public class Box {
    private String color;
    private int length;
    private int width;
    private int height;

    public Box(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(String color) {
        this.color = color;
        this.height =10;
        this.width =10;
        this.length =10;
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

    @Override
    public String toString() {
        return "Box{" +
                "color='" + color + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
    static String smallBox(Box [] arr){
        Box small = arr[0];
    for (Box i: arr){
        if(i.length*i.width*i.height < small.height* small.width* small.length) small =i;
    }
    return small.color;
    }


}
