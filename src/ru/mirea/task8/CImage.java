package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;

public class CImage extends JComponent{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Image");
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // для закрытия окна
        jFrame.setVisible(true); // чтобы отобразить окно на экране
        jFrame.setLocation(600,350); // позиция на экране
        jFrame.add(new Comp(args[0])); // путь C:\Users\Ульяна\IdeaProjects\gif22.jpg
    }
}

class Comp extends CImage{
    private String s;
    Comp(String s){
        this.s = s;
    }
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        Image image = new ImageIcon(s).getImage();
        g2.drawImage(image, 220, 50, null);
    }
}