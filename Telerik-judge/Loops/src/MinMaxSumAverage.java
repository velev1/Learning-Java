import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double min = Double.MAX_VALUE;
        double max = -(Double.MAX_VALUE);
        double sum = 0;

        for (int i = 0; i < n; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (min > number) {
                min = number;
            }

            if (max < number) {
                max = number;
            }

            sum += number;
        }

        System.out.printf("min=%.2f", min);
        System.out.println();
        System.out.printf("max=%.2f", max);
        System.out.println();
        System.out.printf("sum=%.2f", sum);
        System.out.println();
        System.out.printf("avg=%.2f", sum / n);
    }
}
