/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;

/**
 *
 * @author Max
 */
public class IncrementTracker {

    private static int count;
    public static void main(String[] args) {
        int balance = 67000; 
        
        System.out.println("===== Compound Assignment Operator =====\n");
        System.out.println("Initial Balance: " + balance);
        
        balance += 500;
        System.out.println("Addition of 670: " + balance );
        
        balance *= 5;
        System.out.println("Multiply by 5: " + balance);
        
        balance += 6700;
        System.out.println("Addition by 6700: " + balance);
        
        System.out.println("===== Prefix Increment =====");

        count = 67;
        System.out.println("Initial Value: " + count);
        System.out.println("Value After Prefix Increment: " + (++count));
        System.out.println("Current Count: " + count);

        System.out.println("\n===== Postfix Increment =====");

        count = 67;
        System.out.println("Initial Value: " + count);
        System.out.println("Value Before Postfix Increment: " + (count++));
        System.out.println("Current Count: " + count);

  
        // Prefix (++count) increments before the value is used.
        // Postfix (count++) uses the current value before incrementing.
   
        
    }
    
}
