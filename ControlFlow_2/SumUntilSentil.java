package ControlFlow_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Max
 */
import java.util.Scanner;
public class SumUntilSentil {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int number = 0;
        int sum = 0;

        while (number != -1) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if (number != -1) {
                sum += number;
            }
        }

        System.out.println("Total sum: " + sum);

       
    }
}
           
        
    

