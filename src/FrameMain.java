import javax.swing.*;
import java.awt.*;

public class FrameMain extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        super.paint(g2);
//        g2.setBackground(Color.BLACK);


        g2.setColor(Color.ORANGE);
        g2.fillOval(100, 350, 75, 50);

        g2.setColor(Color.BLACK);
        g2.drawLine(0, 250, 700, 250);

        g2.setColor(Color.RED);
        g2.fill3DRect(50, 100, 50, 100, true);

        g2.setColor(Color.MAGENTA);
        g2.fillArc(100, 200, 200, 100, 0, 90);

        g2.setColor(Color.BLACK);
        g2.fillArc(100, 200, 200, 100, 90, 90);

        g2.setColor(Color.GREEN);
        g2.fillArc(100, 200, 200, 100, 180, 180);



    }
}