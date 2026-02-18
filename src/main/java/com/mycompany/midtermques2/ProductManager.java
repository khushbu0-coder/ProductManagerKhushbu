/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.midtermques2;

/**
 *
 * @author khush
 */
public class ProductManager {
       public String greeting(){
        return "Welcome to Product Manager Class";
    }
       
       // This method calculates the discounted price based on percentage provided
        public static double calculateDiscount(double price, double percentage) {
        return price - (price * percentage / 100);
    }
        
         public String message(){
        return "Hey prof! I have created this branch only to display the network graph.";
    }
        
}
