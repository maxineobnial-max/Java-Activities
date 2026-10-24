/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operators;

/**
 *
 * @author Max
 */
import java.util.Scanner;
public class GradeThresholdChecker {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===== GRADE CHECKER =====");
        System.out.println("Enter your Average: ");
      int avg = sc.nextInt();
        System.out.println("Enter your absences: ");
        int absents = sc.nextInt();
        
       if (avg >= 75 && absents <= 3) {
       System.out.println("Passed!");
       } else if (avg >= 75 && absents > 3) {
       System.out.println("You Failed :<, number of absences is too much!");
       } else {
        System.out.println("You failed bcs ur average is too low :<, better luck next time!");
} 
    } 
}
