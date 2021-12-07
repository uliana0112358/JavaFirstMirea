package ru.mirea.task13;

import java.util.LinkedList;

public class CLinkedList { //В ArrayList вся работа (по большому счету) сводится к работе с внутренним массивом.
    //Вся работа с LinkedList сводится к изменению ссылок.
    public static void main(String[] args) {
        LinkedList<Integer> date = new LinkedList<Integer>(); //двунаправленный список
        date.add(1); //У LinkedList много общих методов с ArrayList
        date.add(3);
        date.add(1,2);
        for (int i = 0; i < date.size(); i++)
            System.out.print(date.get(i) + " ");
        System.out.println(" ");
        System.out.println(date);
        date.remove(0);
        System.out.println(date);
        date.clear();
        System.out.println(date);
        date.addFirst(2); //методы, которых нет в ArrayList: addFirst, addLast(вставка в начало/конец);
        //peekFirst(), peekLast(): возвращают первый/последний элемент списка. Возвращают null, если список пуст;
        //pollFirst(), pollLast(): возвращают первый/последний элемент списка и удаляют его из списка. Возвращают null, если список пуст
        date.addFirst(1);
        date.addLast(3);
        System.out.println(date);
        System.out.println(date.peekFirst());
    }
}
