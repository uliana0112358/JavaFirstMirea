package ru.mirea.task14;

import java.util.Scanner;
import java.util.Stack;

class Card{
    private int x;
    Card(int x){
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public String toString() {
        return "" + x;
    }
}

public class CStack{
    static int n = 10;
    public static Stack<Card> first = new Stack<>();
    public static Stack<Card> second = new Stack<>();
    public static Stack<Card> temp = new Stack<>();
    public static int count = 0;
    public static void main(String[] args) {
        int [] x = new int [n/2];
        int [] y = new int [n/2];
        Scanner sc = new Scanner(System.in);
        for (int i = x.length - 1; i >= 0; i--) //считывание карт
            x[i] = sc.nextInt();
        for (int i = y.length - 1; i >= 0; i--)
            y[i] = sc.nextInt();

        for (int i = 0; i < x.length; i++) //заполнение стека
            first.push(new Card(x[i]));
        for (int i = 0; i < y.length; i++)
            second.push(new Card(y[i]));

        /*for (int r = 0; r < first.size(); r++)
            System.out.println(first.pop());*/

        while(true){
            count++;
            Card card1 = first.pop();
            Card card2 = second.pop();
            System.out.print("Первый:" + card1 + " ");
            System.out.println("Второй:" + card2);
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

            if (first.empty()){
                System.out.println("second, кол-во ходов до выигрыша: " + count);
                return;
            }
            if (second.empty()){
                System.out.println("first, кол-во ходов до выигрыша: " + count);
                return;
            }
            if (count == 106){
                System.out.println("bavta");
                return;
            }
        }
    }
}