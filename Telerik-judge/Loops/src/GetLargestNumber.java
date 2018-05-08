import java.util.Scanner;

/**
 * Created by velev on 2.2.2018 г..
 */
public class GetLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int max = getMax(Integer.parseInt(numbers[0]), Integer.parseInt(numbers[1]));
        max = getMax(max, Integer.parseInt(numbers[2]));
        System.out.println(max);
    }

    static int getMax(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }
}