package ru.mirea.task3;

public class Circle {
    private float radius;
    private boolean Inscribed;

    Circle(){
        radius = 5;
        Inscribed = false;
    }
    Circle(int radius, boolean Inscribed){
        this.radius = radius;
        this.Inscribed = Inscribed;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public boolean isInscribed() {
        return Inscribed;
    }
    public void setInscribed(boolean inscribed) {
        Inscribed = inscribed;
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(6, true);

        System.out.println(circle1.getRadius());
        circle1.setRadius(7);
        System.out.println(circle1.getRadius());

        System.out.println(circle2.isInscribed());
        circle2.setInscribed(false);
        System.out.println(circle2.isInscribed());
    }
}