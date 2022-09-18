import javax.swing.*;
import java.awt.*;

public class FrameMain extends JPanel {
    public void paint(Graphics g) {
        this.setBackground(Color.black);

        g.setColor(Color.ORANGE);
        g.fillOval(100, 350, 75, 50);

        g.setColor(Color.BLACK);
        g.drawLine(0, 250, 700, 250);


    }
}