package spring_2023_second_term.Q10;

public class BallPack {
    private Ball[] balls;
    private String [] colors;
    private int numOfBalls;
    private String material;
    private int minSize;
    public BallPack (int num, String[] cols, int min, String mat){
        this.balls = new Ball[num];
        this.colors = cols;
        this. numOfBalls = 0;
        this.minSize = min;
        this.material = mat;
    }
    public boolean isFit ( Ball b ){
        if(b.getSize() < minSize) return false;
        boolean flag = false;
        for (String color : colors) {
            if (color.equals(b.getColor())) {
                flag = true;
                break;
            }

        }
        return flag;
    }
    public boolean add ( Ball b ){
        if(numOfBalls >= balls.length || isFit(b)) return false;
        balls[numOfBalls++]= b;
        return true;
    }
    public int countColor (String color){
        int numOfBallsC=0;
        for (int i = 0; i <numOfBalls ; i++) {
            if (balls[i].getColor().equals(color)) numOfBallsC++;
        }
        return numOfBallsC;
    }
    public String[] missingColors(){
        String[] arr = new String[colors.length];
        int count =0;
        for (String color:colors){
            boolean flag = false;
            for (Ball ball:balls){
                if(color.equals(ball.getColor())){
                    flag =true;
                    break;
                }
            }
            if (!flag) arr[count++]= color;
        }
        if (count ==0) return null;
        String[] result = new String[count];
        /*
        System.arraycopy זאת השיטה בלי
         for (int i = 0; i < count; i++) {
            result[i] = arr[i];
        }
        */
        System.arraycopy(arr, 0, result, 0, count);
        return result;
    }
}
