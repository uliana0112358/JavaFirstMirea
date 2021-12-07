package ru.mirea.task13;

import java.util.ArrayList;

public class CArrayList {
    public static void main(String[] args) {
        ArrayList<String> month = new ArrayList<>(); //список
        month.add("February");
        month.add("March");
        month.add(0, "January");
        month.add(0, "December");
        for (int i = 0; i < month.size(); i++)
            System.out.println(month.get(i));
        System.out.println(" ");
        if (month.contains("January")) //проверка наличия элемента
            System.out.println("ArrayList contains January");
        month.remove("December"); //удаление по значению (элементы смещаются наверх)
        month.remove(1); //удаление по индексу (элементы смещаются наверх)
        System.out.println(" ");
        for (int i = 0; i < month.size(); i++)
            System.out.println(month.get(i));
    }
}
