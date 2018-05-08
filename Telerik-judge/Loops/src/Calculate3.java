import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class Calculate3 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            int n = Integer.parseInt(scanner.nextLine());
            int k = Integer.parseInt(scanner.nextLine());

            BigInteger firstPart = new BigInteger("1");
            BigInteger range = new BigInteger(String.valueOf(n - k));
            int upBorder = n - k;
            int temp = upBorder - 1;
            for (int i = upBorder; i > 0; i--) {
                firstPart = firstPart.multiply(new BigInteger(String.valueOf(n)));
                n--;
                if (temp > 0) {
                    range = range.multiply(new BigInteger(String.valueOf(temp)));
                    temp--;
                }
            }

            System.out.println(firstPart.divide(range));
    }
}
