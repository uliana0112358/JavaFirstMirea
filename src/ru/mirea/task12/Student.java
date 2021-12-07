package ru.mirea.task12;

import java.util.Scanner;

public class Student {
    private int IDNumber;
    private int FScore;
    Student() {
        FScore = 0;
        IDNumber = 0;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    public int getIDNumber() {
        return IDNumber;
    }
    public int getFScore() {
        return FScore;
    }
    public void setFScore(int FScore) {
        this.FScore = FScore;
    }

    public void sort(Student [] students){
        for (int left = 0; left < students.length; left++){
            int value = students[left].getIDNumber();
            int i = left - 1;
            for (; i >= 0; i--){
                if (value < students[i].getIDNumber())
                    students[i + 1].setIDNumber(students[i].getIDNumber());
                else
                    break;
            }
            students[i + 1].setIDNumber(value);
        }
    }
}

class Test{
    public static void main(String[] args) {
        int n = 15;
        Student [] students = new Student[n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fifteen ID numbers: "); //6 3 4 7 8 9 2 1 12 5 21 7 10 4 1
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setIDNumber(sc.nextInt());
        }
        Student student = new Student();
        student.sort(students);
        for (int i = 0; i < students.length; i++){
            System.out.print(students[i].getIDNumber() + " ");
        }
    }
}
