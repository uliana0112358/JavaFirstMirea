package ru.mirea.task5;

public abstract class Dog {
    protected String name;
    protected int age;
    abstract int ageInHuman();
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

    public static void main(String[] args) {
        Poodle poodle = new Poodle("Mike", 8);
        Labrador labrador = new Labrador("Duk", 5);
        labrador.setAge(6);
        System.out.println(labrador);
        System.out.println(poodle);
    }
}

class Poodle extends Dog{
    private String size = "usually small";
    int ageInHuman(){
        return age*7;
    }

    Poodle(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String toString(){
        return "It's poodle. His name is " + name + ", his age is " + age + " and age in human is " + ageInHuman();
    }
}
class Labrador extends Dog{
    private String size = "usually middle";
    int ageInHuman(){
        return age*7;
    }

    Labrador(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String toString(){
        return "It's labrador. His name is " + name + ", his age is " + age + " and age in human is " + ageInHuman();
    }
}