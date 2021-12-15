package ru.mirea.task27;

import java.util.*;

public class City {
    private String city;
    private String country;
    City(String city, String country){
        this.city = city;
        this.country = country;
    }
    public static void main(String[] args) {
        City city1 = new City("Moscow", "Russia");
        City city2 = new City("Krasnodar", "Russia");
        City city3 = new City("Washington", "USA");
        City city4 = new City("Ottawa", "Canada");
        City city5 = new City("Lisbon", "Portugal");
        City city6 = new City("Madrid", "Spain");
        City city7 = new City("LosAngeles", "USA");
        City city8 = new City("Chelyabinsk", "Russia");

        ArrayList<City> cities = new ArrayList<>() {};
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);
        cities.add(city7);
        cities.add(city8);
        Map <String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < cities.size(); i++){
            if (!map.containsKey(cities.get(i).country)){
                map.put(cities.get(i).country, null);
            }
        }
        for (Map.Entry entry: map.entrySet()) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < cities.size(); i++){
                if (entry.getKey().equals(cities.get(i).country))
                    arrayList.add(cities.get(i).city);
            }
            entry.setValue(arrayList);
        }
        System.out.println(map);
    }
}
