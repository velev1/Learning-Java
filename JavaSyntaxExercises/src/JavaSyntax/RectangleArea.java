/*
 * Write a program that enters the sides of a rectangle (two integers a and b)
and calculates and prints the rectangle's area. 
Format the result to the second digit after the decimal separator. 
 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class RectangleArea {

   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double firstSide = sc.nextDouble();
       double secondSide = sc.nextDouble();
       
       System.out.printf("%.2f",firstSide * secondSide);
    }
    
}
