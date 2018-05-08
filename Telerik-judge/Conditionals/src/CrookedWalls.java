import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class CrookedWalls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        long[] walls = new long[input.length];
        for (int i = 0; i < input.length; i++) {
            walls[i] = Integer.parseInt(input[i]);
        }

        long sum = 0;
        long finalSum = 0;

        for (int i = 1; i < walls.length; i++) {
            sum = Math.abs(walls[i] - walls[i - 1]);

            if (sum % 2 == 0) {
                i++;
                finalSum += sum;
            }
        }

        System.out.println(finalSum);
    }
}