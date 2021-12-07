package ru.mirea.task11;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Game2 {
    static private int x = (int)(Math.random() * 20);
    static private int count = 0;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Угадайка");
        jFrame.setSize(700, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // для закрытия окна
        jFrame.setVisible(true); // чтобы отобразить окно на экране
        jFrame.setLocation(400,150); // позиция на экране

        System.out.println(x);
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JTextField jTextField = new JTextField(2);
        jPanel.add(jTextField);
        JButton jButton1 = new JButton("Угадать!");
        jPanel.add(jButton1);
        JLabel jLabel = new JLabel();
        jPanel.add(jLabel);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int y = 0;
                y = Integer.parseInt(jTextField.getText());
                if (y == x) {
                    jLabel.setText("Победа!");
                    return;
                }
                if (y > x)
                    jLabel.setText("Введенное число больше загаданного(");
                if (y < x)
                    jLabel.setText("Введенное число меньше загаданного(");
                if (y > 20)
                    jLabel.setText("Число загадано в диапазоне [0, 20]");
                count++;
                if (count == 3)
                    jLabel.setText("Игра окончена");
            }
        });
    }
}
