package ru.mirea.task6;

import org.w3c.dom.ls.LSOutput;

public interface Nameable {
    String getName();
}

class Planet implements Nameable {
    public String getName(){
        return "Earth";
    }
}
class Car implements Nameable{
    public String getName(){
        return "Mercedes";
    }
}

class Test{
    public static void main(String[] args) {
        Planet planet = new Planet();
        System.out.println(planet.getName());
        Car car = new Car();
        System.out.println(car.getName());
    }
}
