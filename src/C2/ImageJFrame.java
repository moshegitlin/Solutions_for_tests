package C2;
import javax.swing.*;
public class ImageJFrame {
    ImageJFrame(String image){
        JFrame f = new JFrame("Add an image to JFrame");
        ImageIcon icon = new ImageIcon(image);
        f.add(new JLabel(icon));
        f.pack();
        f.setVisible(true);
        f.setLocation(750,350);
    }
    public static void main(String args[])
    {
        new ImageJFrame("C:\\Users\\user\\IdeaProjects\\java_b\\src\\C2\\images\\crash.jpg");
    }
}
