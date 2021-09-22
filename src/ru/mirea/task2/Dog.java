package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;

    public Dog (String n, int a){
        name = n;
        age = a;
    }
    public Dog(String n){
        name = n;
        age = 0;
    }
    public Dog (int a){
        name = "Martin";
        age = a;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString (){
        return name + ", age " + age;
    }
    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age*7 + " years");
    }
}
