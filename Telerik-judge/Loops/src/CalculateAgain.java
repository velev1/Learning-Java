import java.math.BigInteger;
        import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class CalculateAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        BigInteger result = new BigInteger("1");
        int range = n - k;
        for (int i = range; i > 0; i--) {
            result = result.multiply(new BigInteger(String.valueOf(n)));
            n--;
        }
        System.out.println(result);
    }
}