import java.util.Scanner;

/**
 * Created by velev on 30.1.2018 г..
 */
public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int zeros = 0;
        int temp = 0;

        for (int i = n; i > 0; i--) {
            if (i % 5 == 0) {
                temp = i;

                while (temp >= 5 && temp % 5 == 0) {
                    temp = temp / 5;
                    zeros++;
                }
            }
        }

        System.out.println(zeros);
    }
}
