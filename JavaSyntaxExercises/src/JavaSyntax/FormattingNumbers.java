/*
Write a program that reads 3 numbers: 
•	an integer a (0 ≤ a ≤ 500)
•	a floating-point b
•	floating-point c

Print them in 4 virtual columns on the console, separated with a pipe '|'. Each column should have a width of 10 characters. 
•	First, the number a should be printed in hexadecimal, left aligned
•	Second, the number a should be printed in binary form, padded with zeroes
•	Third, the number b should be printed with 2 digits after the decimal point, right aligned
•	Lastly, the number c should be printed with 3 digits after the decimal point, left aligned
You will receive a, b and c on a single line, separated by one or more white spaces.

 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class FormattingNumbers {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int firstNumber  = sc.nextInt();
        double secondNumber = sc.nextDouble();
        double thirdNumber = sc.nextDouble();
        
        String hexValue = Integer.toHexString(firstNumber).toUpperCase();
        String binaryValue = String.format("%10s", Integer.toBinaryString(firstNumber)).replace(' ', '0');
        System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hexValue,binaryValue,secondNumber,thirdNumber);
    }
}
