import java.util.Scanner;

/**
 * Created by velev on 30.1.2018 г..
 */
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrNums = scanner.nextLine().split(" ");

        int firstNumber = Integer.parseInt(arrNums[0]);
        int secondNumber = Integer.parseInt(arrNums[1]);

        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);
        int remainder = 1;
        while (remainder > 0) {
            remainder = max % min;
            max = min;
            min = remainder;
        }

        System.out.println(max);
    }
}
