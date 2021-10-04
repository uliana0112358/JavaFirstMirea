package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CRectangle extends Shape{
    protected void paintComponent(Graphics g){ // класс для графики
        Graphics2D g2 = (Graphics2D)g;
        Rectangle rect1 = new Rectangle(x,y, 100, 100);
        g2.setPaint(cl1);
        g2.fill(rect1);
        Rectangle rect2 = new Rectangle(x + 110,y, 100, 100);
        g2.setPaint(cl2);
        g2.draw(rect2);
        Rectangle rect3 = new Rectangle(x - 5,y - 5, 600, 300);
        g2.setPaint(cl3);
        g2.draw(rect3);
        Rectangle rect4 = new Rectangle(x + 225,y, 300, 600);
        g2.setPaint(cl3);
        g2.draw(rect4);
        Rectangle rect5 = new Rectangle(x - 5,y + 300, 600, 255);
        g2.setPaint(cl4);
        g2.fill(rect5);

        Ellipse2D ell1 = new Ellipse2D.Double(x1, y1, 100, 100);
        g2.setPaint(cl2);
        g2.fill(ell1);
        Ellipse2D ell2 = new Ellipse2D.Double(x1 + 110, y1, 100, 100);
        g2.setPaint(cl2);
        g2.draw(ell2);
        Ellipse2D ell3 = new Ellipse2D.Double(x1 + 300, y1, 100, 75);
        g2.setPaint(cl1);
        g2.fill(ell3);
        Ellipse2D ell4 = new Ellipse2D.Double(x1 + 300, y1 - 100, 100, 75);
        g2.setPaint(cl3);
        g2.fill(ell4);
        Ellipse2D ell5 = new Ellipse2D.Double(x1, y + 320, 400, 200);
        g2.setPaint(cl2);
        g2.fill(ell5);

        Polygon pol1 = new Polygon(arrayX1, arrayY1, 5);
        g2.setPaint(cl1);
        g2.drawPolygon(pol1);
        Polygon pol2 = new Polygon(arrayX1, arrayY12, 5);
        g2.setPaint(cl1);
        g2.fillPolygon(pol2);
        Polygon pol3 = new Polygon(arrayX1, arrayY13, 5);
        g2.setPaint(cl4);
        g2.fillPolygon(pol3);
        Polygon pol4 = new Polygon(arrayX1, arrayY14, 5);
        g2.setPaint(cl2);
        g2.drawPolygon(pol4);
        Polygon pol5 = new Polygon(arrayX1, arrayY15, 5);
        g2.setPaint(cl3);
        g2.fillPolygon(pol5);

        Polygon tr1 = new Polygon(arrayX3, arrayY3, 3);
        g2.setPaint(cl3);
        g2.fillPolygon(tr1);
        Polygon tr2 = new Polygon(arrayX3, arrayY31, 3);
        g2.setPaint(cl2);
        g2.drawPolygon(tr2);
        Polygon tr5 = new Polygon(arrayX32, arrayY32, 3);
        g2.setPaint(cl4);
        g2.fillPolygon(tr5);

        Polygon tr3 = new Polygon(arrayX21, arrayY21, 8);
        g2.setPaint(cl3);
        g2.fillPolygon(tr3);
        Polygon tr4 = new Polygon(arrayX2, arrayY2, 8);
        g2.setPaint(cl2);
        g2.drawPolygon(tr4);
    }
}
