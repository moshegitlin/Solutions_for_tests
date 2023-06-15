package Summer_2020_first_term;

import javax.swing.*;
import java.awt.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


            int Q = sc.nextInt();
            switch (Q) {
                case 1:
                    Solutions.Q1();
                    break;
                case 4:
                    Solutions.Q4(new int[]{22, 23, 24, 12, 11, 10, 9});
                    Solutions.Q4(new int[]{22, 23, 24, 12, 11, 10, 30});
                    System.out.println("The operation complexity is o because we ran the loop only o times");
                    break;
                case 5:
                    ImageTutorial Q5 = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2020_first_term\\images\\Q5.jpg");
                    System.out.println(Solutions.Q5e(new int[]{1, 2, 3, 4, 4, 5}));
                    System.out.println(Solutions.Q5e(new int[]{1, 2, 3, 4, 5, 6}));
                    break;
                case 7:
                    Truck t1 = new Truck("12121212", "avi", 7);
                    Truck t2 = new Truck("23232323", "moshe", 5);
                    Truck t3 = new Truck("34343434", "edi", 8);
                    Truck t4 = new Truck("45454545", "barak", 9);
                    Truck t5 = new Truck("56565656", "matti", 6);
                    Truck[] tArr = {t1, t2, t3, t4, t5};
                    t1.setFree(false);
                    int maxStorage = 0;
                    Truck maxT = tArr[0];
                    for (Truck i : tArr) {
                        if (i.isFree() && maxStorage < i.getNumStorage()) {
                            maxStorage = i.getNumStorage();
                            maxT = i;
                        }
                        if (i.isFree() && i.getNumStorage() > 6) {
                            System.out.println(String.format("%s  %s", "This driver is free and has at least 7 storage spaces", i.getDriverName()));
                        }
                    }
                    if (maxStorage != 0)
                        System.out.println(String.format("%s   %s", "The license number of the truck with the largest storage spaces is", maxT.getDriverName()));
                    else System.out.println("Unable to service");
                    break;
                case 8:
                    ImageTutorial q8 = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2020_first_term\\images\\Q8.jpg");
                    System.out.println(Solutions.secret(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}));
                    System.out.println(Solutions.secret(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8, 2}));
                    break;
                case 11:
                    ImageTutorial q11 = new ImageTutorial("C:\\Users\\user\\IdeaProjects\\java_b\\src\\Summer_2020_first_term\\images\\Q11.jpg");
                    break;
                case 12:
                    while (true) {
                        Family f1 = Family.inputQ12();
                        if (f1.getName().equals("STOP") || f1.getName().equals("stop")) break;
                        f1.input();
                        System.out.println(String.format("%s  %f", "Total cost for a family", f1.getTotalSum()));
                    }
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
