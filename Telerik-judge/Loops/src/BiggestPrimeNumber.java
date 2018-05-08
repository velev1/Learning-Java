import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean isPrime = false;
        for (int number = n; number >= 0; number--) {
            int root = (int) Math.sqrt(number);


            for (int j = 2; j <= root; j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }

            if (isPrime) {
                System.out.println(number);
                break;
            }
        }
    }
}
