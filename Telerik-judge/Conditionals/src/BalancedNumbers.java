import java.util.Scanner;

/**
 * Created by velev on 28.1.2018 г..
 */
public class BalancedNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
            int firstDigit = number / 100;
            int secondDigit = (number / 10) % 10;
            int thirdDigit = number % 10;

            if (firstDigit + thirdDigit == secondDigit) {
                sum += number;
            } else {
                System.out.println(sum);
                break;
            }
        }
    }
}