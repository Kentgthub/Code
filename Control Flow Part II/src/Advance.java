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
        int size = 5;

        for (int row = 1; row <= size; row++) {

            // CONTINUE
            if (row == 4) {
                continue;
            }

            for (int col = 1; col <= row; col++) {

                // BREAK
                if (col == 5) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
