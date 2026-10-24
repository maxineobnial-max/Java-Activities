package arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Max
 */
import java.util.Arrays;

public class SearchandSort {
    public static void main(String[] args) {
       
        int[] scores = {85, 92, 78, 90, 65, 88, 95, 72};
        int target = 90; 

        System.out.println("===== Search & Sort Mini-Tool =====");

        int foundIndex = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break; 
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target " + target + " found at index: " + foundIndex);
        } else {
            System.out.println("Target " + target + " was not found in the array.");
        }

        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.print("Original Array: ");
        printArray(scores);

        System.out.print("Sorted Copy:    ");
        printArray(sortedScores);
        System.out.println("\n==============================");
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println();
    }
}
