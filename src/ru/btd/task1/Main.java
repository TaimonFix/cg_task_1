package ru.btd.task1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Простейшие геометрические объекты");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FrameMain gui = new FrameMain();
        gui.setBackground(Color.PINK);
        frame.add(gui);
        frame.setSize(700, 600);
        frame.setVisible(true);
        frame.setResizable(true);



    }
}
