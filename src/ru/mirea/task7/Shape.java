package ru.mirea.task7;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(){
        color = "red";
        filled = true;
    }
    Shape(String color, boolean filled){
    this.color = color;
    this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "color is " + getColor() + ", filled " + isFilled();
    }
    abstract double getArea();
    abstract double getPerimeter();
}

class Circle extends Shape{
    protected double radius;
    Circle(double radius){
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    double getArea(){
        return 3.14*radius*radius;
    }
    double getPerimeter(){
        return 2*radius*3.14;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String toString(){
        return "It's circle, its radius is " + getRadius() + ", its area is " + getArea() +
                ", its perimeter is " + getPerimeter() + ", its color is " + getColor();
    }
}

class Rectangle extends Shape{
    protected double width;
    protected double length;
    Rectangle(){
        width = 14.0;
        length = 8.0;
    }
    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    double getArea(){
        return width*length;
    }
    double getPerimeter(){
        return 2*width+2*length;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public String toString(){
        return "It's rectangle, its width and length is " + getWidth() + ", " + getLength() + ", its area is " + getArea() +
                ", its perimeter is " + getPerimeter() + ", its color is " + getColor();
    }
}

class Square extends Rectangle{
    private double side;
    Square(){
        side = 4.0;
    }
    Square(double side){
        this.side = side;
    }
    Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    double getArea(){
        return side*side;
    }
    double getPerimeter(){
        return 4*side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public String toString(){
        return "It's square, its side is " + getSide() + ", its area is " + getArea() +
                ", its perimeter is " + getPerimeter() + ", its color is " + getColor();
    }
}

class Test{
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius());
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength());
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide());
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4; //upcast
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
