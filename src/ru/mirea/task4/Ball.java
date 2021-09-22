package ru.mirea.task4;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball (double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Ball(){
        x = 0.0;
        y = 0.0;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public String toString (){
        return "x: " + x + ", y: " + y;
    }
    public void move (double xDisp, double yDisp){
        x = x + xDisp;
        y = y + yDisp;
    }
}

class TestBall{
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball(1.7, 5.4);
        System.out.println(ball1);
        ball1.move(2.4, 7);
        System.out.println(ball1);
        System.out.println(ball2);
        ball2.setX(8.7);
        System.out.println(ball2);
    }
}

