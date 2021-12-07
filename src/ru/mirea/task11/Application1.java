package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Application1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("App");
        jFrame.setSize(700, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // для закрытия окна
        jFrame.setVisible(true); // чтобы отобразить окно на экране
        jFrame.setLocation(400, 150); // позиция на экране

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(new BorderLayout());
        JButton jButton1 = new JButton("CENTER");
        jPanel.add(jButton1, BorderLayout.CENTER);
        JButton jButton2 = new JButton("WEST");
        jPanel.add(jButton2, BorderLayout.WEST);
        JButton jButton3 = new JButton("SOUTH");
        jPanel.add(jButton3, BorderLayout.SOUTH);
        JButton jButton4 = new JButton("NORTH");
        jPanel.add(jButton4, BorderLayout.NORTH);
        JButton jButton5 = new JButton("EAST");
        jPanel.add(jButton5, BorderLayout.EAST);
        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JDialog jDialog = new JDialog(jFrame, "Добро пожаловать в Center");
                jDialog.setSize(500, 300);
                jDialog.setVisible(true);
            }
        });
        jButton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JDialog jDialog = new JDialog(jFrame, "Добро пожаловать в West");
                jDialog.setSize(500, 300);
                jDialog.setVisible(true);
            }
        });
        jButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JDialog jDialog = new JDialog(jFrame, "Добро пожаловать в South");
                jDialog.setSize(500, 300);
                jDialog.setVisible(true);
            }
        });
        jButton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JDialog jDialog = new JDialog(jFrame, "Добро пожаловать в North");
                jDialog.setSize(500, 300);
                jDialog.setVisible(true);
            }
        });
        jButton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                JDialog jDialog = new JDialog(jFrame, "Добро пожаловать в East");
                jDialog.setSize(500, 300);
                jDialog.setVisible(true);
            }
        });
    }
}