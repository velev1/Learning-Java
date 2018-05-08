import java.util.Scanner;

/**
 * Created by velev on 27.1.2018 г..
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ++ +* *+ **
        int number = scanner.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int max = 0;
        int currentValue = firstDigit + secondDigit + thirdDigit;
        if (currentValue > max) {
            max = currentValue;
        }

        currentValue = firstDigit + secondDigit * thirdDigit;
        if (currentValue > max) {
            max = currentValue;
        }
        currentValue = firstDigit * secondDigit + thirdDigit;
        if (currentValue > max) {
            max = currentValue;
        }
        currentValue = firstDigit * secondDigit * thirdDigit;
        if (currentValue > max) {
            max = currentValue;
        }

        System.out.println(max);
    }
}