package ru.mirea.task7;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    MovablePoint(){
        x = 0;
        y = 0;
        xSpeed = 0;
        ySpeed = 0;
    };
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};
    public String toString(){
        return "Coords: " + x + ", " + y;
    }
}

class MovableCircle extends MovablePoint{
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center.x = x;
        center.y = y;
        center.xSpeed = xSpeed;
        center.ySpeed = ySpeed;
        this.radius = radius;
    }
    public String toString(){
        return "Radius: " + radius;
    }
}

class MovableRectangle extends MovablePoint{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft.x = x1;
        topLeft.y = y1;
        bottomRight.x = x2;
        bottomRight.y = y2;
        topLeft.xSpeed = xSpeed;
        topLeft.ySpeed = ySpeed;
        bottomRight.xSpeed = xSpeed;
        bottomRight.ySpeed = ySpeed;
    }
    public void moveUp(){};
    public void moveDown(){};
    public void moveLeft(){};
    public void moveRight(){};
    public String toString(){
        return "Coords: " + topLeft.x + ", " + topLeft.y + "; " + bottomRight.x + ", " + bottomRight.y;
    }
}