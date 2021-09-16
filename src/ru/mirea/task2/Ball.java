package ru.mirea.task2;

public class Ball {
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    private String type;

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    private String size;

    public Ball(String type, String size){
        this.type = type;
        this.size = size;
    }
    public String toString (){
        return "This ball characteristic is " + type + ", " + size;
    }
}

class TestBall{
    public static void main(String[] args) {
        Ball b1 = new Ball ("basketball", "small");
        Ball b2 = new Ball("football",  "big");
        System.out.println(b2.getSize());
        System.out.println(b1);
        System.out.println(b1.getType());
    }
}
