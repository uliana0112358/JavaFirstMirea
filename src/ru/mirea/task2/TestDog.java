package ru.mirea.task2;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen");
        Dog d3 = new Dog(7);
        d3.setAge(1);
        System.out.println(d3.getAge());
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}