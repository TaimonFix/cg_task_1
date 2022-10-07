package ru.btd.task1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameMain extends JPanel {
    private int x1 = 50;
    private int y1 = 500;
    private int x2 = 500;
    private int y2 = 50;
    Color colorR = Color.RED, color1 = Color.CYAN, color2 = Color.RED, color3 = Color.GREEN, color4 = Color.WHITE;
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
        g2.scale(1,1);

        super.paint(g2);
        g2.setBackground(Color.BLACK);

        g2.setColor(Color.BLACK);
        g2.drawLine(0, 250, 700, 250);
        g2.drawLine(325,0,325,700);

        g2.setColor(color2);
        g2.fillOval(x1, 500, 75, 50);

        g2.setColor(color4);
        g2.fillOval(50, y2, 75, 50);

        g2.setColor(colorR);
        g2.fill3DRect(650, y1, 50, 100, true);

        g2.setColor(color1);
        g2.fillArc(225, 200, 200, 100, 0, 90);

        g2.setColor(Color.BLACK);
        g2.drawArc(225, 200, 200, 100, 0, 90);

        g2.setColor(color4);
        g2.fillArc(225, 200, 200, 100, 90, 90);

        g2.setColor(Color.BLACK);
        g2.drawArc(225, 200, 200, 100, 90, 90);

        g2.setColor(color3);
        g2.fillArc(225, 200, 200, 100, 180, 90);

        g2.setColor(Color.BLACK);
        g2.drawArc(225, 200, 200, 100, 180, 90);

        g2.setColor(color2);
        g2.fillArc(225, 200, 200, 100, 270, 90);

        g2.setColor(Color.BLACK);
        g2.drawArc(225, 200, 200, 100, 270, 90);
        if (flagWight) {
            x1++;
            x2--;
            if ((x1 == 500) && (x2 == 50)) {
                flagWight = false;
                colorR = color4;
                color1 = Color.MAGENTA;
                color2 = Color.lightGray;
                color3 = Color.RED;
                color4 = Color.GREEN;
            }
        } else {
            x1--;
            x2++;
            if ((x1 == 50) && (x2 == 500)) {
                flagWight = true;
                colorR = color2;
                color1 = Color.RED;
                color2 = Color.BLUE;
                color3 = Color.LIGHT_GRAY;
                color4 = Color.CYAN;
            }
        }
        if(flagHeight) {
            y1--;
            y2++;
            if (y1 == 20)
                flagHeight = false;
        } else {
            y1++;
            y2--;
            if (y1 == 450)
                flagHeight = true;
        }

    }


}