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
        int [] grades = {85, 90, 78, 92, 88, 76, 95, 80};
        int sum = 0;
        int highest = grades [0];
        int lowest = grades [0];
        
        for (int i = 0; i< grades.length; i++){
            sum += grades[i];
            if (grades [i] > highest){
                highest = grades[i];
            }
            if (grades [i] < lowest){
                lowest = grades[i];
            }
        }
        double avg = (double) sum/ grades.length;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
