import java.util.Scanner;

/**
 * Created by velev on 26.1.2018 г..
 */
public class LeastMajorityMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();

        int number = 4;
        while (true) {
            int dividend = 0;

            if (number % a == 0) {
                dividend++;
            }

            if (number % b == 0) {
                dividend++;
            }

            if (number % c == 0) {
                dividend++;
            }

            if (number % d == 0) {
                dividend++;
            }

            if (number % e == 0) {
                dividend++;
            }

            if (dividend >= 3) {
                System.out.println(number);
                break;
            }

            number++;
        }
    }
}