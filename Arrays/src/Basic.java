/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lek16
 */
public class Basic {
    public static void main(String[] args) {
       String [] favs = {
           "Motor", "Music", "Gaming", "Food"
       };
       for(int i = 0; i<favs.length; i++){
           System.out.println((i+1) + ". "+ favs[i]);
       }
       System.out.println("Favorites: " + favs.length);
    }
}
