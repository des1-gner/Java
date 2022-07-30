/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.helloall;

/**
 *
 * @author ODISH
 */
public class HelloAll {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int total = num1 + num2;
        
        float radius = (float) 10.2;
        int area = (int) (3.14 * radius * radius);
        
        double fah = 100;
        double cel = (5.0/9)*(fah-32); 
        
        double miles = 100;
        final double MILE_TO_KM = 1.609;
        double km = miles * MILE_TO_KM;
        System.out.println("Km: " +km);
                
        
        
        System.out.println("Result is " +total);
        System.out.println("Result is " +area);
        System.out.println("" +fah + "fahreinheit is " +cel + "celsius");
        
    }
}
