package ru.mirea.task14;
import ru.mirea.task14.Card;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Stack;

public class Game3 {
    public static int n = 10;
    public static Stack<Card> first = new Stack<>();
    public static Stack<Card> second = new Stack<>();
    public static Stack<Card> temp = new Stack<>();
    public static int count = 0;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Пьяница");
        jFrame.setSize(700, 500);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE); // для закрытия окна
        jFrame.setVisible(true); // чтобы отобразить окно на экране
        jFrame.setLocation(400,150); // позиция на экране

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JTextField jTextField1 = new JTextField(5);
        jPanel.add(jTextField1);
        JTextField jTextField2 = new JTextField(5);
        jPanel.add(jTextField2);
        JButton jButton1 = new JButton("Начать игру");
        jPanel.add(jButton1);
        JLabel jLabel1 = new JLabel();
        jPanel.add(jLabel1);
        JLabel jLabel2 = new JLabel();
        jPanel.add(jLabel2);
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(jTextField1.getText());
                int y = Integer.parseInt(jTextField2.getText());
                int k = 4;
                while(x != 0){ // заполнение стека
                    first.push(new Card(x % 10));
                    x = x / 10;
                    k--;
                }
                if (first.size() == 4)
                    first.push(new Card(0));
                k = 4;
                while (y != 0){
                    second.push(new Card(y % 10));
                    y = y / 10;
                    k--;
                }
                if (second.size() == 4)
                    second.push(new Card(0));
                jLabel1.setText("Первый: ");
                jLabel2.setText("Второй: ");
            }
        });
        JButton jButton2 = new JButton("Сделать ход");
        jPanel.add(jButton2);
        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) { //логика игры
                count++;
                Card card1 = first.pop();
                Card card2 = second.pop();
                jLabel1.setText("Первый: ");
                jLabel1.setText(jLabel1.getText() + card1);
                jLabel2.setText("Второй: ");
                jLabel2.setText(jLabel2.getText() + card2);

                if ((card1.getX() == 9) && (card2.getX() == 0) || (card1.getX() == 0) && (card2.getX() == 9)){
                    if (card1.getX() == 9){ //выигрывает второй
                        while (!second.empty()){
                            temp.push(second.pop());
                        }
                        temp.push(card1);
                        temp.push(card2);
                        while (!temp.empty())
                            second.push(temp.pop());
                    } else
                    if (card1.getX() == 0){ //выигрывает первый
                        while (!first.empty()){
                            temp.push(first.pop());
                        }
                        temp.push(card1);
                        temp.push(card2);
                        while (!temp.empty())
                            first.push(temp.pop());
                    }
                } else
                if (card1.getX() > card2.getX()) { //выигрывает первый
                    while (!first.empty()){
                        temp.push(first.pop());
                    }
                    temp.push(card1);
                    temp.push(card2);
                    while (!temp.empty())
                        first.push(temp.pop());
                } else
                if (card1.getX() < card2.getX()){ //выигрывает второй
                    while (!second.empty()){
                        temp.push(second.pop());
                    }
                    temp.push(card1);
                    temp.push(card2);
                    while (!temp.empty())
                        second.push(temp.pop());
                }

                JLabel jLabel3 = new JLabel();
                jPanel.add(jLabel3);
                if (first.empty()){
                    jLabel3.setText("second, кол-во ходов до выигрыша: " + count);
                    jButton2.setEnabled(false);
                }
                if (second.empty()){
                    jLabel3.setText("first, кол-во ходов до выигрыша: " + count);
                    jButton2.setEnabled(false);
                }
                if (count == 106){
                    jLabel3.setText("botva");
                    jButton2.setEnabled(false);
                }
            }
        });
    }
}
