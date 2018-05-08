import java.util.Scanner;

/**
 * Created by velev on 2.2.2018 г..
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        printReverseString(input);
    }

    private static void printReverseString(String text) {

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }
}
