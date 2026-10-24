/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflow;

/**
 *
 * @author Max
 */
import java.util.Scanner;
public class LoginValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("===== Login your Account =====\n");
        System.out.println("Enter your username: ");
        String username = sc.next();
        
        if (username.equals("maxinecutie")){
            System.out.println("Enter your password: ");
            String password = sc.next();
            
            if(password.equals("@ilobjungkook77")){
                System.out.println("\nLogin Successfully! Welcome back student:>");
            }else{
                System.out.println("Wrong Password");
            }
        
        }else{
            System.out.println("Wrong Username");
        
        }
        System.out.println("\n============================");
    }
}
