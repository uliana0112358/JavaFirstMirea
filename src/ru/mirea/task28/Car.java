package ru.mirea.task28;

public class Car {
    private String model;
    private int yearOfProd;
    public void drive(){
        System.out.println("Машина едет");
    }
    private class wheels{
        private String model;
        private int size;
        public void descr(){
            System.out.println("Вложенный класс");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        Car.wheels wheels = car.new wheels(); //тестирование вложенного класса
        wheels.descr();
        Car car1 = new Car().new Audi();
        car1.drive();
    }

    private class Audi extends Car{
        @Override
        public void drive() {
            System.out.println("Анонимный класс");
        }
    }
}
