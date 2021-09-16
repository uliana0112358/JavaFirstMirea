package ru.mirea.task2;

public class Shape {
    int size;
    String type;

    Shape(int size, String type) {
        this.size = size;
        this.type = type;
    }
    Shape(){
        size = 10;
        type = "circle";
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String toString(){
        return "Тип фигуры: " + type + ", размер: " + size;
    }

    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.setType("Triangle");
        System.out.println(sh);
    }
}
