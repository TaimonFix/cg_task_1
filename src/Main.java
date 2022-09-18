import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Простейшие геометрические объекты");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FrameMain gui = new FrameMain();
        gui.setBackground(Color.BLACK);
        frame.add(gui);
        frame.setSize(700, 500);
        frame.setVisible(true);


    }
}
