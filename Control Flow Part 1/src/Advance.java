/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */
import java.util.Scanner;
public class Advance {
    public static void main(String[] args) {
       Scanner p = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String Username = p.next();

        System.out.print("Enter Password: ");
        String Pass = p.next();
        //if want to locked account change boolean into true
        boolean accountLocked = false;

        // Stage 1: Check username first
        if ("leyvakent@gmail.com".equals(Username)) {

            // Stage 2: Only check password if username is correct
            if ("04142007".equals(Pass)) {

                // Stage 3: Only check account status if both are correct
                if (!accountLocked) {
                    System.out.println("Login Success");
                } else {
                    System.out.println("Account is locked");
                }

            } else {
                System.out.println("Invalid password");
            }

        } else {
            System.out.println("Invalid username");
        }

        p.close();
    }
}
