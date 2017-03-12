/*
Write a program that takes as input an integer – the target – 
and outputs to the console all pairs of numbers between 1 and 20, 
which, if added or subtracted, result in the target.

Examples
Target	Output
5	1 + 4 = 5
        2 + 3 = 5
        3 + 2 = 5
        …
        19 - 14 = 5
        20 - 15 = 5
----------------------
35	15 + 20 = 35
        16 + 19 = 35
        17 + 18 = 35
        18 + 17 = 35
        19 + 16 = 35
        20 + 15 = 35
-----------------------
0	1 - 1 = 0
        2 - 2 = 0
        …
        19 - 19 = 0
        20 - 20 = 0

 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class HitTheTarget {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number < 0) {
            int counter = 1;
            for (int i = ((number * -1) + 1); i <= 20; i++) {
                System.out.printf("%d - %d = %d", counter,i,number);
                counter++;
                System.out.println();
            }
        }
        else if (number < 20) {
            //addition
            int counter = 1;
            for (int i = number - 1; i > 0; i--) {
                System.out.printf("%d + %d = %d", counter, i, number);
                counter++;
                System.out.println();
            }
            //substraction
            counter = 1;
            for (int i = number + 1; i <= 20; i++) {
                System.out.printf("%d - %d = %d", i, counter, number);
                counter++;
                System.out.println();
            }
        } else if (number > 20) {
            int difference = number - 20;
            int len = 20 - difference  + 1;
            for (int i = 0; i < len; i++) {
                System.out.printf("%d + %d = %d", difference, 20 - i, number);
                difference++;
                System.out.println();
            }
        }
    }
}
