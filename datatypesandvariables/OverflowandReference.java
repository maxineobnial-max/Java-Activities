/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypesandvariables;

/**
 *
 * @author Max
 */
public class OverflowandReference {
    public static void main(String[] args) {
        byte bit = 127;
        
        System.out.println("===== Overflown Byte =====\n");
        System.out.println("Byte Value: " + bit);
        byte overflown = (byte) (bit + 1);
        System.out.println("Overflow: " + overflown);

        System.out.println("===== String Comparisons =====\n");
        
        String lit = "Hi Max";
        String string1 = new String ("Hi Max");
        String string2 = new String ("Hi Max");
        
        System.out.println("String one == String two: " + (string1==string2));
        System.out.println("String one == String Literal: " + (string1==lit));
        System.out.println("String Literal == String two: " + (lit==string2));
        
        //evaluates to false because both are created with 'new', pointing to two completely separate values
        
        System.out.println("\n===== Using Equals =====\n");
        System.out.println("String one 'equals' String two: " + (string1.equals(string2)));
        System.out.println("String one 'equals' String Literal: " + (string1.equals(lit)));
        System.out.println("String Literal 'equals' String two: " + (lit.equals(string2)));
        
        //the text sequence matches across all of them, so it results true
        
        System.out.println("\n===== Array mo =====\n");
        int array[] = {1,2,3,4,5,6,7};
        
        int[] editedarray = array;  
        
        System.out.println("Before Editing (Original Array[4]): " + array[4]);
        System.out.println("Before Editing (Edited Array[0]): " + editedarray[0]);

       editedarray[3] = 99;
        
        System.out.println("After Editing (Original Array[3]): " + array[3]);
        System.out.println("After Editing (Edited Array[0]): " + editedarray[0]);
        
       System.out.println("\n============================");

        // I changed the 3rd value of the original array into '99' that's why in the original array is 99 while the edited array is still at its original value--
        
    }
    
}
