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
       
        public static double calculateDiscount(double price, double percentage) {
        return price - (price * percentage / 100);
    }
}
