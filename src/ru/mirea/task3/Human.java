package ru.mirea.task3;

public class Human {
    public static void main(String[] args) {
        Head head = new Head();
        Leg leg = new Leg();
        Hand hand = new Hand();

        System.out.println("Features: ");
        System.out.println(head);
        System.out.println(leg);
        System.out.println(hand);
    }
}

class Head{
    private String colorOfHair;
    private String colorOfEyes;

    Head(){
        colorOfHair = "Dark";
        colorOfEyes = "Grey";
    }
    Head(String colorOfHair, String colorOfEyes){
        this.colorOfEyes = colorOfEyes;
        this.colorOfHair = colorOfHair;
    }

    public String getColorOfHair() {
        return colorOfHair;
    }
    public void setColorOfHair(String colorOfHair) {
        this.colorOfHair = colorOfHair;
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }
    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public String toString(){
        return "Color of hair is " + colorOfHair + ", color of eyes is " + colorOfEyes;
    }
}
class Leg{
    private boolean haveBoth;

    Leg(){
        haveBoth = true;
    }
    Leg(boolean haveBoth){
        this.haveBoth = haveBoth;
    }

    public boolean isHaveBoth() {
        return haveBoth;
    }
    public void setHaveBoth(boolean haveBoth) {
        this.haveBoth = haveBoth;
    }

    public String toString(){
        return "Does he have both legs? " + haveBoth;
    }
}
class Hand{
    private boolean haveBoth;

    Hand(){
        haveBoth = true;
    }

    public boolean isHaveBoth() {
        return haveBoth;
    }
    public void setHaveBoth(boolean haveBoth) {
        this.haveBoth = haveBoth;
    }

    public String toString(){
        return "Does he have both hands? " + haveBoth;
    }
}
