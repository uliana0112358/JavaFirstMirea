package ru.mirea.task10;

import java.util.Scanner;

public class Example {
    static void exercise1 (int n, int k){
        if (k <= n){
            for (int i = 0; i < k; i++)
                System.out.print(k + " ");
            k = k + 1;
            exercise1(n, k);
        }
        else
            return;
    }
    static void exercise2(int n, int k){
        if (k <= n){
            System.out.print(k + " ");
            k = k + 1;
            exercise2(n, k);
        }
        else
            return;
    }
    static void exercise3(int A, int B, int k1){
        if (A < B){
            if (k1 <= B){
                System.out.print(k1 + " ");
                k1 = k1 + 1;
                exercise3(A, B, k1);
            }
            else
                return;
        }
        else{
            if (k1 >= B){
                System.out.print(k1 + " ");
                k1 = k1 - 1;
                exercise3(A, B, k1);
            }
            else
                return;
        }
    }
    static void exercise4(int k, int k1, int k2, int d, int count){
        int sum = 0;
        int x = k1;
        for (int i = 0; i < k; i++){
            sum = sum + x % 10;
            x = x / 10;
        }
        if (sum == d) {
            count = count + 1;
            //System.out.print(k1 + " ");
        }
        k1 = k1 + 1;
        if (k1 > k2) {
            System.out.println(count);
            return;
        }
        else
            exercise4(k, k1, k2, d, count);
    }

    static void exercise5(int N, int sum){
        if (N != 0) {
            int x = N % 10;
            sum = sum + x;
            N = N / 10;
            exercise5(N, sum);
        }
        else {
            System.out.println(sum);
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        System.out.println("Enter number of exercise: ");
        if (sc.hasNextInt())
            t = sc.nextInt();
        switch (t){
            case 1:
                int k = 1;
                System.out.println("Enter the number: ");
                if (sc.hasNextInt())
                    t = sc.nextInt();
                exercise1(t, k);
                break;
            case 2:
                k = 1;
                System.out.println("Enter the number: ");
                if (sc.hasNextInt())
                    t = sc.nextInt();
                exercise2(t, k);
                break;
            case 3:
                int A = 0, B = 0;
                System.out.println("Enter two numbers: ");
                if (sc.hasNextInt())
                    A = sc.nextInt();
                if (sc.hasNextInt())
                    B = sc.nextInt();
                int k1 = A;
                exercise3(A, B, k1);
                break;
            case 4:
                int d = 0; // для k = 2, d = 5, count = 5: 14, 23, 32, 41, 50
                k = 0;
                System.out.println("Enter two numbers: ");
                if (sc.hasNextInt())
                    k = sc.nextInt();
                if (sc.hasNextInt())
                    d = sc.nextInt();
                k1 = 1; int k2 = 1; // пр. 1000..9999
                for (int i = 0; i < k - 1; i++) {
                    k1 = k1 * 10;
                    k2 = k2 * 10;
                }
                k2 = k2 * 10 - 1;
                int count = 0;
                exercise4(k, k1, k2, d, count);
                break;
            case 5:
                int N = 0;
                System.out.println("Enter the number: ");
                if (sc.hasNextInt())
                    N = sc.nextInt();
                int sum = 0;
                exercise5(N, sum);
                break;
            default:
                System.out.println("Enter other number");
        }
    }
}
