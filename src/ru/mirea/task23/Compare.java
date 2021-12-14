package ru.mirea.task23;

public class Compare {
    int code;
    String color;
    Compare(int code, String color){
        this.code = code;
        this.color = color;
    }
    @Override
    public int hashCode() {
        int result;
        if (color == null)
            result = 0;
        else
            result = color.hashCode();
        result = result + code;
        return result;
    }
    public static void main(String[] args) {
        Compare obj1 = new Compare(111, "red");
        Compare obj2 = new Compare(222, "green");
        Compare obj3 = new Compare(222, "green");
        Compare obj4 = new Compare(111, "green");
        Compare obj5 = new Compare(111, null);
        System.out.println("Хеш-код obj1: " + obj1.hashCode());
        System.out.println("Хеш-код obj2: " + obj2.hashCode());
        System.out.println("Хеш-код obj3: " + obj3.hashCode());
        System.out.println("Хеш-код obj4: " + obj4.hashCode());
        System.out.println("Хеш-код obj5: " + obj5.hashCode());
        System.out.println("Сравнить obj1 и obj2: ");
        System.out.println(obj1.hashCode() == obj2.hashCode());
        System.out.println("Сравнить obj2 и obj3: ");
        System.out.println(obj2.hashCode() == obj3.hashCode());
    }
}
