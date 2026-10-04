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
       
        double bal = 1000.0;

        bal += 200.0;
        System.out.println("After adding 200: " + bal);

        bal *= 1.10;
        System.out.println("After 10% growth: " + bal);

        bal += 500.0;
        System.out.println("After adding 500: " + bal);

        int count = 5;
        System.out.println("========================");
        System.out.println("count++ result: " + count++);
        System.out.println("count after count++: " + count);
        System.out.println("========================");
        System.out.println("++count result: " + ++count);
        System.out.println("count after ++count: " + count);

        // count++ prints the current value first, then increases it.
        // ++count increases the value first, then uses the new value.
    }
}
