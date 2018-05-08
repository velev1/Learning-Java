import java.util.Scanner;

/**
 * Created by velev on 23.1.2018 г..
 */

//Multiplication Sign
//        Write a program that shows the sign (+, - or 0) of the product of three real numbers, without
//        calculating it.
//        Use a sequence of if operators.

//        Input
//        On the first three lines, you will receive the three numbers, each on a separate line

//        Output
//        Output a single line - the sign of the product of the three numbers

//        Constraints
//        The input will always consist of valid floating-point numbers

//        Sample tests
//        Input     Output
//        2
//        5
//        2
//                   +

//        2
//        5
//        -2
//                   -

//        -0.5
//        0
//        -2
//                   0

public class MultiplicationSign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[3];
        numbers[0] = scanner.nextDouble();
        numbers[1] = scanner.nextDouble();
        numbers[2] = scanner.nextDouble();

        if (numbers[0] == 0 || numbers[1] == 0 || numbers[2] == 0) {
            System.out.println(0);
        } else {
            int negativeCount = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    negativeCount++;
                }
            }

            if (negativeCount % 2 == 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
