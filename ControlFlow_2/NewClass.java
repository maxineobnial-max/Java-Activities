package ControlFlow_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Max
 */
public class NewClass {
    public static void main(String[] args) {
        int size = 5;
        for (int i = 1; i <= size; i++) {
            if (i == 3) {
                continue; 
            }
            for (int j = 1; j <= i; j++) {
                if (j == 6) {
                    break; 
                }

                System.out.print(". ");
            }
            System.out.println();
        }
    }
}