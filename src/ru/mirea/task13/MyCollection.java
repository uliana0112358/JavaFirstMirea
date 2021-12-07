package ru.mirea.task13;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MyCollection {
    final private int n = 10;
    private int count = 0;
    private Object[] array = new Object[n];
    private void resize(int newLength){ //метод для увеличения массива в 2 раза
        Object[] newArray = new Object[newLength];
        for (int i = 0; i < array.length; i++)
            System.arraycopy(array, 0, newArray,0, count);
        array = newArray;
    }
    private void add(Object t){ //добавление нового элемента
        if (count == array.length - 1) //если массив заполнен, увеличиваем его в 2 раза
            resize(array.length * 2);
        array[count++] = t;
    }
    private Object get(int index){ //возвращение элемента по индексу
        return array[index];
    }
    private int size(){ //возвращение количества элементов
        return count;
    }
    private void remove(int index){
        for (int i = index; i < count; i++)
            array[i] = array[i + 1];

    }
    private void print(){
        for (int i = 0; i < array.length; i++)
            if (array[i] != null)
                System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.add(4);
        myCollection.add("hello");
        myCollection.add(7);
        myCollection.print();
        System.out.println(" ");

        System.out.println("Размер: " + myCollection.size());

        System.out.println("Элемент под индексом 1: " + myCollection.get(1));

        myCollection.remove(2);
        System.out.println("Элемент под индексом 2 удален: ");
        myCollection.print();
    }
}
