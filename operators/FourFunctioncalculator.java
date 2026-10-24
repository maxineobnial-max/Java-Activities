/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operators;

/**
 *
 * @author Max
 */
import java.util.Scanner;
public class FourFunctioncalculator {
    public static void main(String[] args) {
       int a = 6;
       int b = -7;
       
        System.out.println("===== 4 Function Calculator ===== \n");
        
        System.out.println("WITH A FIXED NUMBERS \n");
        System.out.println("Addition (+): " + (a+b));
        System.out.println("Subtraction (-): " + (a-b));
        System.out.println("Multiplication (*): " + (a*b));
        System.out.println("Division (/): " + (a/b));
        System.out.println("Modulus (%): " + (a%b));
        
        System.out.println("WITH A SCANNER \n");
                
        System.out.println("Enter your first integer: ");
        
        Scanner sc = new Scanner(System.in);
        int integer1 = sc.nextInt();
        
        System.out.println("Enter your second integer: ");
        int integer2 = sc.nextInt();
        
        System.out.println("\nAddition (+): " + (integer1+integer2));
        System.out.println("Subtraction (-): " + (integer1-integer2));
        System.out.println("Multiplication (*): " + (integer1*integer2));
        System.out.println("Division (/): " + (integer1/integer2));
        System.out.println("Modulus (%): " + (integer1%integer2));
        System.out.println("\n============================");
        
        /*
 * Division (/): Integer division truncates the fractional part toward zero 
 *    (e.g., -5 / 2 = -2).
 * Modulus (%): The remainder operator % results in a negative value if and only if 
 *    the left-hand operand (dividend) is negative (e.g., -5 % 2 = -1, but 5 % -2 = 1).
 */
        
        
              
    }
    
}
