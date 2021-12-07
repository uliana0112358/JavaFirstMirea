package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    static private int mil = 0, mad = 0;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Image");
        jFrame.setSize(700, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // для закрытия окна
        jFrame.setVisible(true); // чтобы отобразить окно на экране
        jFrame.setLocation(400,150); // позиция на экране

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton1 = new JButton("Milan");
        JButton jButton2 = new JButton("Madrid");
        JButton jButton3 = new JButton("End game");
        JLabel jLabel = new JLabel("Result " + mil + "x" + mad + "  ");
        JLabel jLabel2 = new JLabel("Winner: ");
        Font font = new Font("Arial", Font.ITALIC, 18);
        jLabel.setFont(font);
        jLabel2.setFont(font);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jLabel);
        jPanel.add(jLabel2);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mil++;
                jLabel.setText("Result " + mil + "x" + mad + "  ");
            }
        });
        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mad++;
                jLabel.setText("Result " + mil + "x" + mad + "  ");
            }
        });
        jButton3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Last score: " + mil + "/" + mad + "  ");
                if (mil > mad)
                    jLabel2.setText("Winner: Milan");
                else
                    jLabel2.setText("Winner: Madrid");
            }
        });
    }
}
