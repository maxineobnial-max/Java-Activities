/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Max
 */
import java.util.Arrays;
public class FavThing {
    public static void main(String[] args) {
        String favs[]= {"baby ko", "chocolate", "katsudon", "Pastil ng mami ko", "keler black"};
     
        System.out.println("My Favorite Things:");
        for (int i = 0; i < favs.length; i++) {
            System.out.println((i + 1) + ". " + favs[i]);
        }

        System.out.println("\nTotal number of items: " + favs.length);
    }
}
    

    

