package C2;

import javax.swing.*;
import java.awt.*;

public class ImageTutorial  {
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
