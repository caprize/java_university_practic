package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class DrawCircle extends JFrame {
    Circle1 circle1;
    Rectangle1 rectangle1;

    public DrawCircle(){
        setTitle("Drawing a Circle");
        setSize(1200, 1200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {
        Shape1[] a = new Shape1[]{circle1,rectangle1};
        Graphics2D g2d = (Graphics2D) g;
        for (int i=0;i<20;i++) {
            int t = (int) (Math.random())+i;
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int gr = (int) (Math.random() * 255);
            g2d.setColor(new Color(r,gr,b));
            if (t%2==0){
                System.out.println("circle");
                Shape1 circleShape1 = new Circle1("red", (int) (Math.random() * 170)*i%1200, (int) (Math.random() * 160*i)%1200, (int) (Math.random() * 180)%1200);
                Ellipse2D circleShape = new Ellipse2D.Double(circleShape1.get_xPosition(), circleShape1.get_yPosition(), ((Circle1)circleShape1).getR(), ((Circle1)circleShape1).getR());
                g2d.draw(circleShape);
            }
            if (t%2==1){
                System.out.println("rect");
                Shape1 rectangleShape1 = new Rectangle1("red", (int) (Math.random() * 100)*i%1200, (int) (Math.random() * 260*i)%1200, (int) (Math.random() * 80)%1200,(int) (Math.random() * 40)%1200);
                Rectangle2D rectangleShape = new Rectangle2D.Double(rectangleShape1.get_xPosition(), rectangleShape1.get_yPosition(), ((Rectangle1)rectangleShape1).width, ((Rectangle1)rectangleShape1).height);
                g2d.draw(rectangleShape);
            }
        }

    }
}

