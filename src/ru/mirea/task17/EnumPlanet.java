package ru.mirea.task17;

import java.util.Scanner;

enum Planet {
    Mercury (3.3, 2440), Venus(48, 6052), Earth(59, 6371),
    Mars(6.4, 3389), Jupiter(190000, 69911), Saturn(57000, 58232),
    Uranus(900, 25362), Neptune(1000, 24622);
    private double weight;
    private double radius;
    Planet(double weight, double radius){
        this.radius = radius; //км
        this.weight = weight; // *10 в 23 кг
    }
}

public class EnumPlanet {
    public static void main(String[] args) {
        Planet planet;
        System.out.println("Введите название планеты: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (true){
            switch (name){
                case "выйти":{
                    return;
                }
                case "Меркурий":{
                    System.out.println("3.7 м/с в кв");
                    break;
                }
                case "Венера":{
                    System.out.println("8.7 м/с в кв");
                    break;
                }
                case "Земля":{
                    System.out.println("9.807 м/с в кв");
                    break;
                }
                case "Марс":{
                    System.out.println("3.721 м/с в кв");
                    break;
                }
                case "Юпитер":{
                    System.out.println("24.79 м/с в кв");
                    break;
                }
                case "Сатурн":{
                    System.out.println("10.44 м/с в кв");
                    break;
                }
                case "Уран":{
                    System.out.println("8.87 м/с в кв");
                    break;
                }case "Нептун":{
                    System.out.println("11.15 м/с в кв");
                    break;
                }
            }
        }
    }
}
