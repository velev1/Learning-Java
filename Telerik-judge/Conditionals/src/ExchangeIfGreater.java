import java.util.Scanner;

/**
 * Created by velev on 23.1.2018 г..
 */


//Exchange if Greater
//        Write a program that reads two double values from the console A and B, stores them in variables
//        and exchanges their values if the first one is greater than the second one. Use an if-statement. As a
//        result print the values of the variables A and B, separated by a space.
//        Input
//        On the first line, you will receive the value of A
//        On the second line, you will receive the value of B
//        Output
//        On the only output line, print the values of the two variables, separated by a whitespace
//        Constraints
//        A and B will always be valid real numbers between -100 and 100
//        Sample tests
//        Input      Output
//        5
//        3
//                      3 5

//        2
//        4
//                     2 4

//        3.3
//        3.3
//                     3.3 3.3


public class ExchangeIfGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

       if (firstNumber > secondNumber) {
           double numberContainer = firstNumber;
           firstNumber = secondNumber;
           secondNumber = numberContainer;
       }

       if ((int)firstNumber == firstNumber && (int)secondNumber == secondNumber ) {
           System.out.println((int)firstNumber + " " + (int)secondNumber);
       } else if ((int)firstNumber == firstNumber) {
           System.out.println((int)firstNumber + " " + secondNumber);
       } else if ((int)secondNumber == secondNumber ) {
           System.out.println(firstNumber + " " + (int)secondNumber);
       } else {
           System.out.println(firstNumber + " " + secondNumber);
       }
    }
}
