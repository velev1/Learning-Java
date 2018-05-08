import java.util.Scanner;

/**
 * Created by velev on 2.2.2018 г..
 */
public class AppearanceCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");
        String number = scanner.nextLine();

        int numberCount = getNumberCount(input, number);
        System.out.println(numberCount);
    }

    private static int getNumberCount(String[] numbers, String number) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals(number)) {
                count++;
            }
        }
        return count;
    }
}
