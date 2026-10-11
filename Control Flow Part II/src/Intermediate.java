/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */
import java.util.Scanner;
public class Intermediate {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);

        int number = 0;
        int total = 0;

        while (number != -1) {
            System.out.print("Enter an integer (-1 to stop): ");
            number = p.nextInt();

            if (number != -1) {
                total += number;
            }
        }

        System.out.println("Total: " + total);

        p.close();
    }
    }

