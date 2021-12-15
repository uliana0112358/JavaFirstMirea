package ru.mirea.task27;

import java.util.*;

public class MapClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Иванова", "Анна");
        map.put("Сидорова", "Анна");
        map.put("Петров", "Саша");
        map.put("Дудь", "Юра");
        map.put("Щербаков", "Леша");
        map.put("Семенов", "Леша");
        map.put("Абрамов", "Илья");
        map.put("Сабуров", "Нурлан");
        map.put("Харламов", "Борис");
        map.put("Хомякова", "Юля");
        System.out.println(map);
        Map <String, String> newMap = new HashMap<>();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = (String) iterator.next();
            String value = map.get(key);
            if (!newMap.containsValue(value))
                newMap.put(key, value);
        }
        System.out.println(newMap);
    }
}
