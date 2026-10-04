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
        int k = 5;
        int f = 3;
        int l = 2;

        // EXPRESSION 1

        // PREDICTED RESULT: true
        System.out.println((k + f * l) > 10 && k++ > 5);

        // EXPRESSION 2

        // PREDICTED RESULT: false
        System.out.println(k * 2 + f > 15 || l++ == 3);

        // EXPRESSION 3

        // PREDICTED RESULT: true
        System.out.println(++l + k > 10 && f-- == 3);
    }
}
