package C2;
import javax.swing.*;
import java.awt.*;
public class Myframe extends JFrame{
    Myframe(){
        this.setSize(420,420);
//        this.pack();
        this.setTitle("JFrame Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("C:\\Users\\LT\\IdeaProjects\\GUI\\JFrame Tutorial\\Images\\images.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0x123456));
        this.setLocation(750,350);
    }

    public static void main(String[] args) {
        Myframe i = new Myframe();
    }
}
