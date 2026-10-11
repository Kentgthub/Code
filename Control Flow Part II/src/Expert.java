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

        int damaged = -1;
        int lowstock = 5;
        int[][] warehouse = {
            {10, 3, 8},
            {6, -1, 2},
            {12, 7, 4}
        };

        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. Display inventory total");
            System.out.println("2. Find first critically low shelf");
            System.out.println("3. Restock a shelf");
            System.out.println("4. Display warehouse shelves");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            choice = p.nextInt();

            switch (choice) {
                case 1:
                    int total = 0;

                    // Skip damaged shelves
                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0;
                                col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == damaged) {
                                continue;
                            }

                            total += warehouse[row][col];
                        }
                    }

                    System.out.println("Total inventory: " + total);
                    break;

                case 2:
                    boolean found = false;

                    
                    // Stop both loops after finding the first low shelf
                    search:
                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0;
                                col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == damaged) {
                                continue;
                            }

                            if (warehouse[row][col] <= lowstock) {
                                System.out.println(
                                        "First low-stock shelf: Row " + (row + 1) + ", Column " + (col + 1)  + ", Items: " + warehouse[row][col]
                                );

                                found = true;
                                break search;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println("No low-stock shelves found.");
                    }
                    break;

                case 3:
                    restock(warehouse, p, damaged);
                    break;

                case 4:
                    System.out.println("\nWarehouse Shelves:");

                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0;
                                col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == damaged) {
                                System.out.print("[DAMAGED] ");
                            } else {
                                System.out.print(
                                        "[" + warehouse[row][col] + "] "
                                );
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exiting inventory system...");
                    break;

                default:
                    System.out.println("Invalid menu choice. Try again.");
            }

        } while (choice != 0);

        p.close();
    }

    
    public static int restock(int[][] warehouse, Scanner p, int damaged) {
        int row;
        int col;

        while (true) {
            System.out.print(
                    "Enter row number (1-" + warehouse.length + "): "
            );
            row = p.nextInt();

            if (row >= 1 && row <= warehouse.length) {
                break;
            }

            System.out.println("Invalid row. Please try again.");
        }

        
        while (true) {
            System.out.print(
                    "Enter column number (1-"
                    + warehouse[row - 1].length + "): "
            );
            col = p.nextInt();

            if (col >= 1 && col <= warehouse[row - 1].length) {
                break;
            }

            System.out.println("Invalid column. Please try again.");
        }

        //Stop restocking if the shelf is damaged
        if (warehouse[row - 1][col - 1] == damaged) {
            System.out.println("Cannot restock a damaged shelf.");
            return 0;
        }

        int quantity;

        while (true) {
            System.out.print("Enter quantity to add: ");
            quantity = p.nextInt();

            if (quantity > 0) {
                break;
            }

            System.out.println("Quantity must be greater than zero.");
        }

        warehouse[row - 1][col - 1] += quantity;

        System.out.println("Restocking successful!");
        System.out.println(
                "Updated shelf quantity: " + warehouse[row - 1][col - 1]
        );

        return quantity;
    }
}
