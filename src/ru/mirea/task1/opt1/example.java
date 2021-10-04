package ru.mirea.task1.opt1;

import java.util.Scanner;

public class example {
    static void exercise_1(){
        int [] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        System.out.println(sum);
        sum = 0; int t = arr.length - 1;
        while (t != -1){
            sum = sum + arr[t];
            t--;
        }
        System.out.println(sum);
        sum = 0; t = arr.length - 1;
        do{
            sum = sum + arr[t];
            t--;
        } while (t != -1);
        System.out.println(sum);
    }

    static void exercise_2(String [] s){
        for (int i = 0; i < s.length; i++)
            System.out.println(s[i]);
    }

    static void exercise_3(){
        for (int i = 1; i < 11; i++)
            System.out.println((float)1/i);
    }

    static void exercise_4(){
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++)
            arr[i] = (int)(Math.random() * 100);
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        for (int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr.length - 1; j++)
                if(arr[j] > arr[j + 1]){
                    int ob = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = ob;
                }
        System.out.println("Change array");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    static void exercise_5(){
        Scanner sc = new Scanner(System.in);
        int i = 04;
        System.out.println("Enter number: ");
        if (sc.hasNextInt())
            i = sc.nextInt();
        int f = 1;
        while (i != 0){
            f = f * i;
            i--;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        //exercise_1();
        exercise_2(args);
        //exercise_3();
        //exercise_4();
        //exercise_5();
    }
}
