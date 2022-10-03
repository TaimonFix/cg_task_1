import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Простейшие геометрические объекты");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FrameMain gui = new FrameMain();
        gui.setBackground(Color.PINK);
        frame.add(gui);
        frame.setSize(700, 600);
        frame.setVisible(true);
        frame.setResizable(false);

    }
}
