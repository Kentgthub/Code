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
        double amount = 2500.00;
        double rate;
        String discount;

        
        if (amount <=1000) {
            rate = 0.00;
            discount = "0%";
        } else if (amount <=2000) {
            rate = 0.05;
            discount = "5%";
        } else if (amount <=3000) {
            rate = 0.10;
            discount = "10%";
        } else {
            rate = 0.15;
            discount = "15%";
        }

        
        double price = amount * rate;
        double total = amount - price;

        System.out.println("Purchase Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Discounted Price: " + total);
    
    }
}
