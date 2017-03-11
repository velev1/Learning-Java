//Write program that reads three numbers. Print the average of the three, 
//formatted to the second digit after the decimal point.
package javasyntaxlab;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class AverageOfThreeNumbers {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        double sum = 0;
        
        sum += scan.nextDouble();
        sum += scan.nextDouble();
        sum += scan.nextDouble();
        
        double avg = sum / 3;
        
        System.out.printf("%.2f", avg);
    }
}
