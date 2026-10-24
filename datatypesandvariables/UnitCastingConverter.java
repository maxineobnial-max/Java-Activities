/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypesandvariables;

/**
 *
 * @author Max
 */
public class UnitCastingConverter {
    public static void main(String[] args) {
        double cm = 675.75;
        
        System.out.println("===== Converter =====\n");
        System.out.println("CentiMeter: " + cm);
        
        int meters = (int) (cm / 100);
        
        System.out.println("Meters: " + meters);
       
        double remainingcm = (cm - (meters*100));
        
        System.out.println("Remaining Centimeter: " + remainingcm);
        System.out.println("\n===== Implicit Widening =====");
        
        int sixseven = 67;
      
        double hehe = sixseven;
        
        System.out.println("\nOriginal Value: " + sixseven);
        System.out.println("Implicit Widening: " + hehe);
        
        // No explicit cast is needed here because a 'double' has a larger capacity 
        // than an 'int'. Java automatically promotes (widens) the int value to a double.
        
        System.out.println("\n===== Explicit Narrowing =====");
        
        double chichan = 69;
        
        int chachin = (int) chichan;
        
        System.out.println("\nOriginal Value: " + chichan);
        System.out.println("Explicit Narrowing: " + chachin);
        
        // An explicit cast is required here because converting a 'double' to an 'int' 
        // risks data loss. Java truncates the fractional part, dropping everything after the decimal.
        System.out.println("\n============================");
        
    }
    
    
}
