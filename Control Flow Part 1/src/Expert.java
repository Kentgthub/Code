/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */
import java.util.Scanner;
public class Expert {
    public static void main(String[] args) {
         Scanner p = new Scanner(System.in);

        String correctUsername = "leyvakent";
        int correctPIN = 1234;

        double balance = 15000.00;
        double withdrawal;

        System.out.print("Enter Username: ");
        String username = p.next();

              if (correctUsername.equals(username)) {
        System.out.print("Enter 4-digit PIN: ");
        int pin = p.nextInt();

      
            if (pin == correctPIN) {

                System.out.println("Authentication successful.");

                String tier;

                if (balance < 5000) {
                    tier = "Bronze";
                } else if (balance < 10000) {
                    tier = "Silver";
                } else if (balance < 20000) {
                    tier = "Gold";
                } else {
                    tier = "Platinum";
                }

                System.out.println("Account Tier: " + tier);


                double limit;

                if (tier.equals("Bronze")) {
                    limit = 2000;
                } else if (tier.equals("Silver")) {
                   limit = 5000;
                } else if (tier.equals("Gold")) {
                    limit = 10000;
                } else {
                    limit = 20000;
                }

            

                double Rate;

                switch (tier) {
                    case "Bronze":
                        Rate = 0.02;
                        break;

                    case "Silver":
                        Rate = 0.015;
                        break;

                    case "Gold":
                        Rate = 0.01;
                        break;

                    case "Platinum":
                        Rate = 0.005;
                        break;

                    default:
                        Rate = 0.03;
                }
                System.out.print("Enter Withdrawal Amount: ");
        withdrawal = p.nextDouble();
        
                double fee = withdrawal * Rate;
                double deduction = withdrawal + fee;

                if (withdrawal <= balance) {

                    if (withdrawal <= limit) {

                        // Final approval
                        System.out.println("Transaction APPROVED");
                        System.out.println("Withdrawal: " + withdrawal);
                        System.out.println("Transaction Fee: " + fee);
                        System.out.println("Total Deduction: " + deduction);

                    } else {
                        System.out.println("Transaction DENIED");
                        System.out.println("Reason: Withdrawal exceeds the "
                                + tier + " daily limit of " + limit + ".");
                    }

                } else {
                    System.out.println("Transaction DENIED");
                    System.out.println("Reason: Insufficient balance.");
                }

            } else {
                System.out.println("Transaction DENIED");
                System.out.println("Reason: Incorrect PIN.");
            }

        } else {
            System.out.println("Transaction DENIED");
            System.out.println("Reason: Incorrect username.");
        }

        p.close();
    
    }
}
