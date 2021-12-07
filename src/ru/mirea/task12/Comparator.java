package ru.mirea.task12;
import ru.mirea.task12.Student;

import java.util.Comparator;
import java.util.Scanner;

class SortingStudentsByGPA implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    void quickSort(Student [] students, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = students[(leftMarker + rightMarker)/2].getFScore();
        do{
            while (students[leftMarker].getFScore() < pivot){
                leftMarker++;
            }
            while (students[rightMarker].getFScore() > pivot){
                rightMarker--;
            }
            if (leftMarker <= rightMarker){
                if (leftMarker < rightMarker){
                    int temp = students[leftMarker].getFScore();
                    students[leftMarker].setFScore(students[rightMarker].getFScore());
                    students[rightMarker].setFScore(temp);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder)
            quickSort(students, leftMarker, rightBorder);
        if (leftBorder < rightMarker){
            quickSort(students, leftBorder, rightMarker);
        }
    }
}

class Test2{
    public static void main(String[] args) {
        int n = 15;
        Student [] students = new Student[n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fifteen final scores: "); //6 3 4 7 8 9 2 1 12 5 21 7 10 4 1
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setFScore(sc.nextInt());
        }
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        sortingStudentsByGPA.quickSort(students, 0, students.length - 1);

        for (int i = 0; i < students.length; i++){
            System.out.print(students[i].getFScore() + " ");
        }
    }
}
