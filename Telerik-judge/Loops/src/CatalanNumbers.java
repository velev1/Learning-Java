import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class CatalanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n == 0) {
            System.out.println(1);
        } else {
            BigInteger firstPart = new BigInteger("1");
            BigInteger secondPart = new BigInteger(String.valueOf(n));

            int range = 2 * n - (n + 1);
            int temp = 2 * n;

            for (int i = range; i > 0; i--) {
                firstPart = firstPart.multiply(new BigInteger(String.valueOf(temp)));
                temp--;
                if (n > 0) {
                    n--;
                    secondPart = secondPart.multiply(new BigInteger(String.valueOf(n)));
                }
            }

            System.out.println(firstPart.divide(secondPart));
        }
    }
}
