package ru.mirea.task5;

public abstract class Dish {
    protected String design;

    abstract int getCountOfTableware();
    void setDesign(String design){
        this.design = design;
    }
    String getDesign(){
        return design;
    }

    public static void main(String[] args) {
        TableService service1 = new TableService("usual", 100);
        TeaService service2 = new TeaService("gzhel", 200);
        System.out.println(service1);
        service1.setDesign("China");
        System.out.println(service1);
        System.out.println(service2);
    }
}

class TableService extends Dish{
    private int cost;
    int getCountOfTableware(){
        return 27;
    }

    TableService(String design, int cost){
        this.design = design;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String toString(){
        return "It's table service. Count of tableware is " + getCountOfTableware() + ". Cost is " + getCost() +
                ". Design is " + getDesign();
    }
}

class TeaService extends Dish{
    private int cost;
    int getCountOfTableware(){
        return 20;
    }

    TeaService(String design, int cost){
        this.design = design;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String toString(){
        return "It's tea service. Count of tableware is " + getCountOfTableware() + ". Cost is " + getCost() +
                ". Design is " + getDesign();
    }
}