/*
Write a program that reads three floating point numbers from the console and calculates their result with the following formulae: 
((a^2 + b^2) / (a^2 – b^2))^(a + b + c) / √c             (a^2 + b^2 - c^3)^(a – b)
Then calculate the absolute value of the difference between the average of the three numbers and the average of the two formulae. 
Abs (Avg (a, b, c) – Avg (f1, f2))
You will receive a, b and c on a single line, separated by one or more white spaces.

 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class CalculateExpression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double firstFormula = Math.pow((a * a + b * b) / (a * a - b * b), (a + b + c) / Math.sqrt(c));

        double secondFormula = Math.pow((a * a + b * b - c * c * c), (a - b));

        double thirdFormula = Math.abs(((a + b + c) / 3) - ((firstFormula + secondFormula) / 2));
        
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",firstFormula,secondFormula,thirdFormula);
    }
}
