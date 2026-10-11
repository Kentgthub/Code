/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */
public class Expert {
    public static void main(String[] args) {
         
        class Student {
            String name;
            int[] quizzes;
            double avg;
            int rank;

            Student(String name, int[] quizzes) {
                this.name = name;
                this.quizzes = quizzes;

                int sum = 0;
                for (int i = 0; i < quizzes.length; i++) {
                    sum += quizzes[i];
                }

                avg = (double) sum / quizzes.length;
            }
        }

        String[] names = {
            "Leyva", "Javier L.", "Mailo", "Javier E.", "Alviar"
        };

        int[][] quizData = {
            {90, 85, 95, 90},
            {80, 85, 80, 85},
            {90, 90, 90, 90},
            {85, 80, 75, 80},
            {85, 85, 85, 85}
        };

        // Build Student objects from the 2D array
        Student[] students = new Student[names.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // highest average first
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].avg < students[j + 1].avg) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Assign ranks and handle ties
        for (int i = 0; i < students.length; i++) {
            if (i == 0) {
                students[i].rank = 1;
            } else if (students[i].avg == students[i - 1].avg) {
                students[i].rank = students[i - 1].rank;
            } else {
                students[i].rank = i + 1;
            }
        }

        // Print leaderboard
        System.out.println("========== STUDENT LEADERBOARD ==========");
        System.out.printf("%-10s %-14s %-16s%n", "Rank", "Name", "Average");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-10d %-14s %-16.2f%n",
                    students[i].rank,
                    students[i].name,
                    students[i].avg);
        }

        // Linear search for a student's rank
        String targetName = "Leyva";
        int index = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(targetName)) {
                index = students[i].rank;
                break;
            }
        }
        if (index != -1){
            int targetRank = students[index].rank;
            
              System.out.println("\nStudent Found!");
            System.out.println("Name: " + students[index].name);
            System.out.println("Average: " + students[index].avg);
            System.out.println("Rank: " + targetRank);

            // Print other students who share the same rank
            boolean hasTie = false;

            for (int i = 0; i < students.length; i++) {
                if (i != index
                        && students[i].rank == targetRank) {

                    if (!hasTie) {
                        System.out.println("Tied with:");
                        hasTie = true;
                    }

                    System.out.println(
                        students[i].name
                        + " (Average: " + students[i].avg + ")"
                    );
                }
            }

            if (!hasTie) {
                System.out.println("No tie for this rank.");
            }

        } else {
            System.out.println("Student " + targetName + " not found.");
        }
        
        }
    }

