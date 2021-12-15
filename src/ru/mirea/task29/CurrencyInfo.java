package ru.mirea.task29;

import java.io.*;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String place;
    private String time;

    public CurrencyInfo(String place, String time){
        this.place = place;
        this.time = time;
    }

    public String toString(){
        return place + ", " + time;
    }
}

class Main{
    public static void main(String[] args) throws IOException {
        String place = "Moscow";
        String time = "18:00";
        CurrencyInfo currencyInfo = new CurrencyInfo(place, time);
        FileOutputStream fileOutputStream =
                new FileOutputStream("C:\\Users\\Ульяна\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\task29\\tempInfo.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(currencyInfo);
        objectOutputStream.close();
    }
}
