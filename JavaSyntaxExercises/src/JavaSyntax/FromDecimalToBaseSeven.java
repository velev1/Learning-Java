/*
Write a program that takes an integer number and converts it to base-7.
 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class FromDecimalToBaseSeven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String result = decToAny(number, 7);

        System.out.printf("%s", result);
    }

    public static String decToAny(int decNumber, int baseNumSystem) {
        StringBuilder remainder = new StringBuilder();
        while (decNumber > 0) {
            remainder.insert(0, (decNumber % baseNumSystem));
            decNumber /= baseNumSystem;
        }
        return remainder.toString();
    }
}
