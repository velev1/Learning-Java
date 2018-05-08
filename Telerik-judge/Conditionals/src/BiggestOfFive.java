import java.util.Scanner;

/**
 * Created by velev on 26.1.2018 г..
 */
public class BiggestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float firstNumber = scanner.nextFloat();
        float max = firstNumber;
        float secondNumber = scanner.nextFloat();
        if (secondNumber > max) {
            max = secondNumber;
        }
        float thirdNumber = scanner.nextFloat();
        if (thirdNumber > max) {
            max = thirdNumber;
        }

        float fourthNumber = scanner.nextFloat();
        if (fourthNumber > max) {
            max = fourthNumber;
        }

        float fifthNumber = scanner.nextFloat();
        if (fifthNumber > max) {
            max = fifthNumber;
        }

        if (max - (int) max == 0) {
            int numToPrint = (int) max;
            System.out.println(numToPrint);
        } else {
            System.out.println(max);
        }
    }
}
