/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypesandvariables;

/**
 *
 * @author Max
 */
public class ShoppingCalculator {
    public static void main(String[] args) {
        String storename = "Mga Pampaganda ni Maxine Store";
        double delilotion = 290.88;
        double aladasoap = 242.40;
        double johnsonbodoil = 146.00;
        double sunfloweroil = 299.00;
        double bodscrub = 179.00;
        double nivealotion = 345.00;
        int quantity = 6;
        
        System.out.println("===== Mga Pampaganda ni Maxine Store =====");
        System.out.println("Deli Lotion: " + delilotion);
        System.out.println("Alada Whitening Soap: " + aladasoap);
        System.out.println("Johnson's Baby Oil Aloe Vera: " + johnsonbodoil);
        System.out.println("Human Nature Sunflower Oil: " + sunfloweroil);
        System.out.println("Abonne Body Salt Scrub: " + bodscrub);
        System.out.println("Nivea Body Lotion Intensive Moisture: " + nivealotion);
        System.out.println("");
        System.out.println("\nQuantity: "  + quantity);
        
        
        double total = (delilotion + aladasoap + johnsonbodoil + sunfloweroil + bodscrub + nivealotion);
        
        System.out.println("\nTotal: " + total);
      
        System.out.println("============================");
        
        /** Because the total cost may contain decimal values. Using double allows the program to store amounts with decimal places. 
         * 
         */
        
    }

    
}
