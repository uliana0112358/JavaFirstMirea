package ru.mirea.task25;

public interface Shape {
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

class ShapeDecorator implements Shape{
    Shape shape;
    @Override
    public void draw() {
        System.out.println("It is Decorator");
    }
    ShapeDecorator(){}
}

class RedShapeDecorator extends ShapeDecorator{
    Shape shape;
    RedShapeDecorator(){}

    public void draw(){
        System.out.println("draw red shape");
    }
    void setRedBorder(){

    }
}

class DecoratorPatternDemo{
    public static void main(String[] args) {
        ShapeDecorator shapeDecorator = new ShapeDecorator();
        shapeDecorator.draw();
        ShapeDecorator shapeDecorator2 = new RedShapeDecorator();
        shapeDecorator2.draw();
    }
}