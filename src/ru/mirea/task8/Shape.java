package ru.mirea.task8;
import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JComponent {
    Color cl1 = new Color(34, 88, 22);
    Color cl2 = new Color(22, 54, 88);
    Color cl3 = new Color(128, 18, 18);
    Color cl4 = new Color(243, 204, 11);

    protected int x = 10, y = 10;
    protected double x1 = 10, y1 = 120;
    protected int [] arrayX1 = {650, 700, 750, 725, 675};
    protected int[] arrayY1 = {200, 250, 200, 150, 150};
    protected int[] arrayY12 = {75, 125, 75, 25, 25};
    protected int[] arrayY13 = {325, 375, 325, 275, 275};
    protected int[] arrayY14 = {450, 500, 450, 400, 400};
    protected int[] arrayY15 = {575, 625, 575, 525, 525};

    protected int[] arrayX2 = {50,200,200,270,200,200,50,50};
    protected int[] arrayY2 = {625,625,575,675,775,725,725,625};
    protected int[] arrayX21 = {250,400,400,475,400,400,250,250};
    protected int[] arrayY21 = {225,225,200,240,275,250,250,225};

    protected int[] arrayX3 = {475, 525, 575};
    protected int[] arrayY3 = {450, 350, 450};
    protected int[] arrayY31 = {550, 500, 550};
    protected int[] arrayX32 = {425, 475, 525};
    protected int[] arrayY32 = {150, 50, 150};
}

class Figures{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Figures");
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // для закрытия окна
        jFrame.setVisible(true); // чтобы отобразить окно на экране
        jFrame.setLocation(600,350); // позиция на экране
        jFrame.add(new CRectangle());
    }
}
