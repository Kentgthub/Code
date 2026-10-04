/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */

public class Intermediate {
    public static void main(String[] args) {
   double avg = 85.0;
        int abs = 2;
        
        boolean passes = ((avg >= 75 && abs <= 3)
                          || avg >= 90);


        System.out.println("Average Grade: " + avg);
        System.out.println("Absences: " + abs);

     
        if (passes) {
            System.out.println("Result: PASS");
            System.out.println("Reason: The student meets the grade and attendance requirements.");
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: The student does not meet the required grade and attendance conditions.");
        }
    }
}
