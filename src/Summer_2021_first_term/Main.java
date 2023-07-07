package Summer_2021_first_term;
import Summer_2021_first_term.Q13.*;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int Q = sc.nextInt();
        switch (Q){
            case 8:
                Gift g1 = new Gift(1,10,'M');
                Gift g2 = new Gift(2,8,'U');
                Gift g3 = new Gift(3,30,'M');
                Gift g4 = new Gift(4,9,'F');
                Gift g5 = new Gift(5,5,'K');
                Gift g6 = new Gift(6,14,'U');
                Gift g7 = new Gift(7,10,'U');
                Gift g8 = new Gift(8,24,'U');
                Gift g9 = new Gift(8,10,'U');
                g6.setType('K');
                System.out.println(g6.isForMan());
                Gift [] giftsArr ={g1,g2,g3,g4,g5,g6,g7,g8,g9};
                Gift.Q8_c(giftsArr,48);
                System.out.println("Complexity of O^2 since there is a nested loop here");
                break;
            case 9:
        System.out.println(Solutions.exchange(1634589));
        System.out.println(Solutions.exchange(163789));
                System.out.println(Solutions.Q9B(new int[]{11,66,55,859,999,12}));
        System.out.println(Solutions.Q9B(new int[]{11,66,55,859,999,11}));
                break;
            case 10:
                ImageTutorial Q10 = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2021_first_term\\images\\Q10.png");
                break;
            case 12:
                ImageTutorial Q12 = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2021_first_term\\images\\Q12.png");
                break;
            case 13:
                Time a = new Time(10,2);
                Time a1 = new Time(11,2);
                Time a2 = new Time(14,2);
                Time a3 = new Time(9,0);
                Time a4 = new Time(13,2);
                Message m1 = new Message("student@gmail.com",2,"text",a,false);
                Message m2 = new Message("student@gmail.com",4,"text",a1,true);
                Message m3 = new Message("student@gmail.com",2,"text",a2,false);
                System.out.println(m1);
                System.out.println( m1.reply("ttttttdff"));
                Mailbox mail = new Mailbox(3);

                mail.addMail(m1);
                mail.addMail(m2);
                mail.addMail(m3);
                System.out.println(mail.howManyBetweenTimes(a3,a4));
                System.out.println(mail.mostPopularSubject());
                break;
            case 14:
                System.out.println(Solutions.Q14(new int[]{1,2,4,6,13,14},new int[]{11,22,121,211}));
                System.out.println();
                System.out.println("Complexity of O^2 since there is a nested loop here");
                break;
            default:
                System.out.println("there is not such question");
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
