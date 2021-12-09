package ru.mirea.task18;

import java.util.Scanner;
import java.lang.Exception;

public class ExceptionTask {
    public static void main(String[] args) {
        while (true){
            System.out.println("Оформление заказа");
            System.out.println("Введите ФИО и ИНН");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            long inn = scanner.nextLong();
            try{
                if ((inn < 100000000000L) || (inn > 999999999999L)){
                    throw new Exception();
                }
                else
                    return;
            } catch (Exception e) {
                System.out.println("Номер ИНН введен неверно попробуйте еще раз");
            }
        }
    }
}
