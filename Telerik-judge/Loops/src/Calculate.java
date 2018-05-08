import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class Calculate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double sum = 1.0;
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact / Math.pow(x, i);
        }

        System.out.printf("%.5f", sum);
    }
}