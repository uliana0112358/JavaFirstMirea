package ru.mirea.task26;

import java.util.Scanner;

public class Shop {
    PayStrategy payStrategy;
    public void placeOrder(){
        System.out.println("Оформить заказ");
    }
    public void pay(){
        payStrategy.paymentMethod();
    }
}

interface PayStrategy{
    void paymentMethod();
}

class CardData implements PayStrategy{
    @Override
    public void paymentMethod() {
        System.out.println("Ввод данных карты");
    }
}

class Wallet implements PayStrategy{
    @Override
    public void paymentMethod() {
        System.out.println("Выбрать кошелек");
    }
}

class Qiwi extends Shop{
    Qiwi(){
        this.payStrategy = new Wallet();
    }
}

class CreditCard extends Shop{
    CreditCard(){
        this.payStrategy = new CardData();
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как оплатить покупку?");
        String payment = scanner.next();
        switch (payment){
            case "Карта":{
                Shop creditCard = new CreditCard();
                creditCard.placeOrder();
                creditCard.pay();
                break;
            }
            case "Кошелек":{
                Shop qiwi = new Qiwi();
                qiwi.placeOrder();
                qiwi.pay();
                break;
            }
            default:{
                System.out.println("Неверный способ оплаты");
            }
        }
    }
}