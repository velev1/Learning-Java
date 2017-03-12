/*
 You are given an array of integers as a single line, separated by a space.
Write a program that checks consecutive pairs and prints if both are odd/even or not.
Note that the array length should also be an even number.

Examples
Input           Output
1 2 3 4         1, 2 -> different
                3, 4 -> different

2 8 11 15 3 2	2, 8 -> both are even
                11, 15 -> both are odd
                3, 2 -> different

1 8 11 1 2	invalid length

 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class OddAndEvenPairs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] numbersStrings = sc.nextLine().split(" ");

        if (numbersStrings.length % 2 != 0) {
            System.out.println("invalid length");
        } else {
            int[] numbers = new int[numbersStrings.length];
            for (int i = 0; i < numbersStrings.length; i++) {
                numbers[i] = Integer.parseInt(numbersStrings[i]);
            }

            for (int i = 1; i < numbers.length; i += 2) {

                if (numbers[i - 1] % 2 == 0 && numbers[i] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even", numbers[i - 1], numbers[i]);
                } else if (numbers[i - 1] % 2 != 0 && numbers[i] % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd", numbers[i - 1], numbers[i]);
                } else {
                    System.out.printf("%d, %d -> different", numbers[i - 1], numbers[i]);
                }
                System.out.println();
            }
        }
    }
}
