/*
Write a program that converts number from a base-7 to its decimal representation.
 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class FromBaseSevenToDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String inputNumber = sc.next();
        
        int result = anyToDec(inputNumber, 7);
        
        System.out.printf("%d", result);
    }

    public static int anyToDec(String inputNumber, int baseNumSys) {
        
        int result = 0;
        
        for (int i = 0; i < inputNumber.length(); i++) {
            result = inputNumber.charAt(i) - '0' + result * baseNumSys;
        }
        
        return result;
    }
}
