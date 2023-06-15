package spring_2021_first_term;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a question number");
    int Q = sc.nextInt();
    switch (Q){
        case 1:
            Solutions.Q1();
            break;
        case 2:
            Box b1= new Box("red",6,5,9);
            Box b2= new Box("blue",9,8,9);
            Box b3= new Box("white",5,6,7);
            Box b4= new Box("pink",10,11,12);
            Box b5= new Box("green");
            Box.smallBox(new Box[]{b1,b2,b3,b4,b5});
            break;
        case 3:
            Tank t1 = new Tank(40,20);
            Tank t2 = new Tank(50);
            System.out.println(t1.isAmount());
            System.out.println(t2.isAmount());
            System.out.println( t2.isPossible(20,'+'));
            System.out.println(t2.isPossible(25,'-'));
            System.out.println(Tank.fill(t1,t2));
            break;
        case 6:
            System.out.println(Solutions.Q6("Lionel.Messi"));
            System.out.println(Solutions.Q6("www.sport5.il"));
            System.out.println(Solutions.Q6("ABC"));
            System.out.println(Solutions.Q6("efG."));
            System.out.println(Solutions.Q6(".ab.Cd"));
            System.out.println(Solutions.Q6("abc..def"));
            System.out.println(Solutions.Q6("abcde..f"));
            break;
        case 7:
            BatteryPack bt1 = new BatteryPack(100);
            BatteryPack.checkPrice(bt1,120);
            BatteryPack.checkPrice(bt1,100);
            BatteryPack.checkPrice(bt1,90);
            bt1.isEnough(100);
            bt1.isEnough(10000);
            break;
        case 10:
            System.out.println(Solutions.Q10_A(3467));
            System.out.println(Solutions.Q10_B(new int[]{1,12,122,12222,1222}));
            System.out.println(Solutions.Q10_c(new int[]{1,12,122,12222,1222}));
            System.out.println(Solutions.Q10_c(new int[]{12,12,122,12222,1222}));
            ImageTutorial Q10_d =new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\spring_2021_first_term\\images\\Q10_d.jpg");
            break;
        case 11:
            ImageTutorial Q11_A = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\spring_2021_first_term\\images\\Q11_A.jpg");
            ImageTutorial Q11_B = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\spring_2021_first_term\\images\\Q11_B.jpg");
            break;
        case 12:
            Task task = new Task("abc",10,7);
            System.out.println( task.doIt(10));
            System.out.println( task.doIt(12));
            TaskManager ta1 = new TaskManager();
            ta1.addTask(task);
            System.out.println(ta1);
            break;



    }






















    }

    static class ImageTutorial  {
        JFrame frame;
        JLabel displayField;
        ImageIcon image;

        public ImageTutorial(String image){
            this.frame = new JFrame("image display test");
            this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            try {
                this.image = new ImageIcon(image);
                Image img1 = this.image.getImage();
                img1.getScaledInstance(JLabel.WIDTH,JLabel.HEIGHT,Image.SCALE_SMOOTH);
                ImageIcon i = new ImageIcon(img1);
                this.displayField = new JLabel(this.image);
                this.frame.add(this.displayField);
                this.frame.pack();
                this.frame.setVisible(true);


            }catch (Exception e){
                e.printStackTrace();
            }

        }


    }

}
