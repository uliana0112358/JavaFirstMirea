package ru.mirea.task14;
import ru.mirea.task14.Card;

import java.util.*;

public class CQueue {
    static int n = 10;
    public static Queue<Card> first = new LinkedList<>();
    public static Queue<Card> second = new LinkedList<>();
    public static int count = 0;

    public static void main(String[] args) {
        int[] x = new int[n / 2];
        int[] y = new int[n / 2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) //считывание карт
            x[i] = sc.nextInt();
        for (int i = 0; i < y.length; i++)
            y[i] = sc.nextInt();

        for (int i = 0; i < x.length; i++) //заполнение стека
            first.add(new Card(x[i]));
        for (int i = 0; i < y.length; i++)
            second.add(new Card(y[i]));

        while (true) {
            count++;
            Card card1 = first.poll(); //то же, что и pop()
            Card card2 = second.poll();
            System.out.print("Первый:" + card1 + " ");
            System.out.println("Второй:" + card2);
            if ((card1.getX() == 9) && (card2.getX() == 0) || (card1.getX() == 0) && (card2.getX() == 9)) {
                if (card1.getX() == 9) { //выигрывает второй
                    second.add(card1);
                    second.add(card2);
                } else if (card1.getX() == 0) { //выигрывает первый
                    first.add(card1);
                    first.add(card2);
                }
            } else if (card1.getX() > card2.getX()) { //выигрывает первый
                first.add(card1);
                first.add(card2);
            } else if (card1.getX() < card2.getX()) { //выигрывает второй
                second.add(card1);
                second.add(card2);
            }
            if (first.peek() == null) {
                System.out.println("second, кол-во ходов до выигрыша: " + count);
                return;
            }
            if (second.peek() == null) {
                System.out.println("first, кол-во ходов до выигрыша: " + count);
                return;
            }
            if (count == 106) {
                System.out.println("bavta");
                return;
            }
        }
    }
}
