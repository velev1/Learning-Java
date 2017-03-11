/*
 * Create a method that calculates a triangle area by a given:
•	Base
•	Height
Return the area as an output of the program. Format the result to the second digit after the decimal separator.

 */
package javasyntaxlab;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class CalculateTriangleArea {

   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        double result  = calculateTriangleArea(base,height);
        
        System.out.printf("Area = %.2f", result);
    }
    
    public static double calculateTriangleArea(double base, double height) {
        
        return (base * height) / 2;
    }
}
