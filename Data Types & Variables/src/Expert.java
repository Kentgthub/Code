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
        
        byte num = 127;

        System.out.println("Before Overflow: " + num);
        num++;
        System.out.println("After Overflow: " + num);

        String k1 = new String("Kent");
        String k2 = new String("Kent");
        String k3 = "Kent";
        
        System.out.println("k1 == k2: " + (k1 == k2));

        System.out.println("k1.equals(k2): " + k1.equals(k2));

        System.out.println("k1 == k3: " + (k1 == k3));

        System.out.println("k1.equals(k3): " + k1.equals(k3));

        System.out.println("k2 == k3: " + (k2 == k3));

        System.out.println("k2.equals(k3): " + k2.equals(k3));
        
        int[] Exam1 = {10, 20, 30};

        int[] Exam2 = Exam1;

        System.out.println("\nBefore Modification:");
        System.out.println("Score: " + Exam1[0]);
        System.out.println("Score: " + Exam2[0]);

        Exam2[0] = 99;

        System.out.println("\nAfter Modification:");
        System.out.println("Score: " + Exam1[0]);
        System.out.println("Score: " + Exam2[0]);
    }
}
