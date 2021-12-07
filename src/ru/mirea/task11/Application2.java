package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Application2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("App");
        jFrame.setSize(700, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // для закрытия окна
        jFrame.setVisible(true); // чтобы отобразить окно на экране
        jFrame.setLocation(400, 150); // позиция на экране

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JTextArea jTextArea = new JTextArea(10, 10);
        jPanel.add(jTextArea);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu1 = new JMenu("Цвет");
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem green = new JMenuItem("Зеленый");
        JMenuItem blue = new JMenuItem("Синий");
        jMenu1.add(red);
        jMenu1.add(green);
        jMenu1.add(blue);
        jMenuBar.add(jMenu1);
        red.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.RED);
            }
        });
        green.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.GREEN);
            }
        });
        blue.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setForeground(Color.BLUE);
            }
        });

        JMenu jMenu2 = new JMenu("Шрифт");
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem times = new JMenuItem("Times");
        JMenuItem courier = new JMenuItem("Courier");
        jMenu2.add(arial);
        jMenu2.add(times);
        jMenu2.add(courier);
        jMenuBar.add(jMenu2);
        arial.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 16));
            }
        });
        times.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("TimesRoman", Font.BOLD, 22));
            }
        });
        courier.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextArea.setFont(new Font("Courier", Font.ITALIC, 10));
            }
        });

        jFrame.setJMenuBar(jMenuBar);
    }
}
