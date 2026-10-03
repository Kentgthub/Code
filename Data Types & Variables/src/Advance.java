/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */
public class Advance {
    public static void main(String[] args) {
         double cm = 162.0;
         
        int totalcm = (int) cm;

  
        int m = totalcm / 100;

        
        int remcm = totalcm % 100;

        System.out.println("Original Height: " + cm+ " cm");
        System.out.println("Whole Meters: " + m + " m");
        System.out.println("Remaining Centimeters: " + remcm + " cm");

      
        int num = 10;
        double widnum = num;

        System.out.println("Implicit Widening: " + widnum);
        
        double decnum = 25.75;
        int narnum = (int) decnum;

        System.out.println("Original Double: " + decnum);
        System.out.println("Explicit Narrowing: " + narnum);
    }
}
