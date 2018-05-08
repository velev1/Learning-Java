import java.util.Scanner;

/**
 * Created by velev on 30.1.2018 г..
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = Long.parseLong(scanner.nextLine());
        StringBuilder binNum = new StringBuilder();

        if (number == 0) {
            System.out.println(0);
        } else {
            while (number > 0) {
                binNum.append(number % 2);
                number = number / 2;
            }

            for (int i = binNum.length() - 1; i >= 0; i--) {
                System.out.print(binNum.charAt(i));
            }
        }
    }
}