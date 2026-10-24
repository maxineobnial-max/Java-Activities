/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author USER
 */
import java.util.Scanner;

class Student {
    String name;
    int[] quizzes;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }
}

public class ClassRankingSystem {

    public static double getAverage(Student s) {
        int total = 0;

        for (int i = 0; i < s.quizzes.length; i++) {
            total += s.quizzes[i];
        }

        return (double) total / s.quizzes.length;
    }

    public static void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (getAverage(students[j]) <
                    getAverage(students[j + 1])) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static int linearSearch(Student[] students, String name) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Maxine", "Rionah", "Christian", "Haru", "Oakley"};

        int[][] quizData = {
            {90, 95, 95, 98},
            {80, 85, 82, 87},
            {92, 90, 89, 94},
            {90, 85, 95, 88},
            {75, 80, 85, 90}
        };

        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        sortStudents(students);

        System.out.println("\n===== CLASS LEADERBOARD =====");
        System.out.printf("%-8s %-12s %-10s%n",
                          "RANK", "NAME", "AVERAGE");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {
            if (i > 0 &&
                getAverage(students[i]) != getAverage(students[i - 1])) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %.2f%n",
                rank, students[i].name, getAverage(students[i]));
        }

        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        int position = linearSearch(students, searchName);

        if (position != -1) {
            int studentRank = position + 1;

            while (studentRank > 1 &&
                Double.compare(
                    getAverage(students[position]),
                    getAverage(students[studentRank - 2])
                ) == 0) {
                studentRank--;
            }

            System.out.println(searchName + "'s rank is: " + studentRank);
        } else {
            System.out.println("Student not found.");
        }

        sc.close();
    }
}  

