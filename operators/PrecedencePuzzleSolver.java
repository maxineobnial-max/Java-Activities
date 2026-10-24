/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;

/**
 *
 * @author USER
 */

public class PrecedencePuzzleSolver {

    public static void main(String[] args) {

        int a = 5, b = 3, c = 2;

        System.out.println("Expression 1: " +
            (a + b * c > 10 && a != b));
        
        int x = 4, y = 7;

        System.out.println("Expression 2: " +
            (++x * 2 < y || x-- == 5));
        
        int n = 3;

       
        System.out.println("Expression 3: " +
            (n++ + 2 >= 6 && --n == 3));
      
    }
}
