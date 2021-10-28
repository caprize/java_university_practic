package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

public class NullLayout extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        // super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;

        // очищаем фон
        Rectangle r= getBounds();
        g2.setBackground(Color.white);
        g2.clearRect(0, 0, r.width, r.height);

        // выводим надпись и выводим квадрат красного цвет
        g.setColor(Color.red);
        g.drawString("Hello, world", 20, 20);
        g.fillRect(60,60, 120, 120);
    }
}
