package ru.mirea.task12;
import ru.mirea.task12.Student;

import java.util.Scanner;

public class TwoListUnity {
    public static Student[]  mergeSort(Student[] students1, Student[] students2) {
        Student[] students3 = new Student[students1.length + students2.length];
        int pos1 = 0, pos2 = 0;
        for (int i = 0; i < students3.length; i++)
        {
            if (pos1 > students1.length - 1)
            {
                Student temp = students2[pos2];
                students3[i] = temp;
                pos2++;
            }
            else if (pos2 > students2.length - 1)
            {
                Student temp = students1[pos1];
                students3[i] = temp;
                pos1++;
            }
            else if (students1[pos1].getIDNumber() < students2[pos2].getIDNumber())
            {
                Student temp = students1[pos1];
                students3[i] = temp;
                pos1++;
            }
            else
            {
                Student temp = students2[pos2];
                students3[i] = temp;
                pos2++;
            }
        }
        return students3;
    }
}

class Test3{
    public static void main(String[] args) {
        int n = 15;
        Student [] students1 = new Student[n];
        Student [] students2 = new Student[n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fifteen ID numbers for the first list: "); //6 3 4 7 8 9 2 1 12 5 21 7 10 4 1
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student();
            students1[i].setIDNumber(sc.nextInt());
        }
        System.out.println("Enter fifteen ID numbers for the second list: "); //8 7 7 7 9 8 4 2 3 4 1 2 4 2 5
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student();
            students2[i].setIDNumber(sc.nextInt());
        }
        Student student = new Student();
        student.sort(students1);
        student.sort(students2);
        TwoListUnity twoListUnity = new TwoListUnity();
        Student students3 [] = twoListUnity.mergeSort(students1, students2);
        for (int i = 0; i < students3.length; i++){
            System.out.print(students3[i].getIDNumber() + " ");
        }
    }
}
