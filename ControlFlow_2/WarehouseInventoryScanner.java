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

public class WarehouseInventoryScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] inventory = {
            {10, 5, 8, -1},
            {4, 12, -1, 7},
            {3, 6, 2, 9}
        };

        int choice;
        do {
            System.out.println("\n===== WAREHOUSE INVENTORY =====");
            System.out.println("1. Display Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find First Critically Low Shelf");
            System.out.println("4. Restock a Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nInventory:");

                    for (int i = 0; i < inventory.length; i++) {
                        for (int j = 0; j < inventory[i].length; j++) {
                            if (inventory[i][j] == -1) {
                                System.out.print("[DAMAGED] ");
                            } else {
                                System.out.print(inventory[i][j] + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    int total = 0;

                    for (int i = 0; i < inventory.length; i++) {
                        for (int j = 0; j < inventory[i].length; j++) {
                            if (inventory[i][j] == -1) {
                                continue;
                            }

                            total += inventory[i][j];
                        }
                    }

                    System.out.println("Total inventory: " + total);
                    break;

                case 3:
                    boolean found = false;

                    for (int i = 0; i < inventory.length; i++) {
                        for (int j = 0; j < inventory[i].length; j++) {
                            if (inventory[i][j] != -1 &&
                                inventory[i][j] <= 3) {

                                System.out.println(
                                    "First critically low shelf: Row "
                                    + (i + 1) + ", Column " + (j + 1)
                                    + " (" + inventory[i][j] + " items)"
                                );

                                found = true;
                                break;
                            }
                        }

                        if (found) {
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("No critically low shelf found.");
                    }
                    break;

                case 4:
                    int row;
                    int col;
                    int amount;
                    
                    while (true) {
                        System.out.print("Enter row (1-3): ");
                        row = sc.nextInt();

                        System.out.print("Enter column (1-4): ");
                        col = sc.nextInt();

                        if (row >= 1 && row <= inventory.length &&
                            col >= 1 && col <= inventory[row - 1].length) {

                            if (inventory[row - 1][col - 1] == -1) {
                                System.out.println("This shelf is damaged.");
                                break;
                            }

                            System.out.print("Enter quantity to add: ");
                            amount = sc.nextInt();

                            if (amount > 0) {
                                inventory[row - 1][col - 1] += amount;
                                System.out.println("Shelf restocked successfully!");
                            } else {
                                System.out.println("Quantity must be positive.");
                            }

                            break;

                        } else {
                            System.out.println("Invalid row or column. Try again.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting inventory system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
