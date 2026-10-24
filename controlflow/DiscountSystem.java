/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlflow;

/**
 *
 * @author Max
 */
public class DiscountSystem {
    public static void main(String[] args) {
        int total = 6700;
        
        System.out.println("===== YOUR RECEIPT ===== \n");
        System.out.println("Total Amount: 6700");
        
        double totaldiscount;
        
        if (total <1000){
        System.out.println("Discount: No Discount");
        
        totaldiscount = total;
        }
        else if (total <3000 ) {
                System.out.println("Discount: 5%" );
                totaldiscount = (total * 0.05);
                }
          else if (total <5000 ) {
                System.out.println("Discount: 10% ");
                totaldiscount = (total * 0.10);
                }   
          else {
              System.out.println("Discount: 15%");
              totaldiscount = (total * 0.15);
          }
        System.out.println("Total: " + (total - totaldiscount));
        
        System.out.println("\n============================");
      
    }
}
