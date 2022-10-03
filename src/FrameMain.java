import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameMain extends JPanel {
    private int x1 = 50;
    private int y1 = 400;
    private int x2 = 500;
    Color color1;
    private boolean flagWight = true;
    private boolean flagHeight = true;
    FrameMain() {
        Timer timer = new Timer(1, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;


        super.paint(g2);
        g2.setBackground(Color.BLACK);

        g2.setColor(Color.BLACK);
        g2.drawLine(0, 250, 700, 250);
        g2.drawLine(325,0,325,700);

        g2.setColor(Color.ORANGE);
        g2.fillOval(x1, 400, 75, 50);

        g2.setColor(Color.RED);
        g2.fill3DRect(50, y1, 50, 100, true);


        g2.setColor(color1);
        g2.fillArc(225, 200, 200, 100, 0, 90);


        g2.setColor(Color.BLACK);
        g2.fillArc(225, 200, 200, 100, 90, 90);

        g2.setColor(Color.GREEN);
        g2.fillArc(225, 200, 200, 100, 180, 90);

        g2.setColor(Color.BLUE);
        g2.fillArc(225, 200, 200, 100, 270, 90);

        g2.setColor(Color.blue);
        g2.fillOval(x2, 50, 75, 50);

        if (flagWight) {
            x1++;
            x2--;
            if (x1 == 500)
                flagWight = false;
        } else {
            x1--;
            x2++;
            if (x1 == 50) {
                flagWight = true;
            }
        }
        if(flagHeight) {
            y1--;
            if (y1 == -10)
                flagHeight = false;
        } else {
            y1++;
            if (y1 == 400)
                flagHeight = true;
            color1 = Color.MAGENTA;
        }





    }


}