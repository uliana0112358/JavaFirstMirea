package ru.mirea.task5;

public abstract class Furniture {
    protected String model;
    protected String color;
    protected abstract int getNumberOfSeats();
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
class Couch extends Furniture{
    private String type = "couch";

    Couch(String model, String color){
        this.model = model;
        this.color = color;
    }
    public int getNumberOfSeats(){
        return 3;
    }
    public String toString(){
        return "It's " + type + ", its color is " + getColor() + " and number of seats are " + getNumberOfSeats();
    }
}
class Wardrobe extends Furniture{
    private String type = "wardrobe";
    Wardrobe(String model, String color){
        this.model = model;
        this.color = color;
    }
    public int getNumberOfSeats(){
        return 1;
    }
    public String toString(){
        return "It's " + type + ", its model is " + getModel() + " and number of seats are " + getNumberOfSeats();
    }
}

class FurnitureShop {
    public static void main(String[] args) {
        Couch couch = new Couch("#123e", "white");
        Wardrobe wardrobe = new Wardrobe("#u45t", "black");
        couch.setModel("#567h");
        System.out.println(couch);
        System.out.println(wardrobe);
    }
}