import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by velev on 4.2.2018 г..
 */
public class MazeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<String> directions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int oddSum = 0;
            int evenSum = 0;

            int number = Integer.parseInt(scanner.nextLine());
            if (((number / 1000) % 10) % 2 == 0) {
                evenSum += (number / 1000) % 10;
            } else {
                oddSum += (number / 1000) % 10;
            }

            if (((number / 100) % 10) % 2 == 0) {
                evenSum += (number / 100) % 10;
            } else {
                oddSum += (number / 100) % 10;
            }

            if (((number / 10) % 10) % 2 == 0) {
                evenSum += (number / 10) % 10;
            } else {
                oddSum += (number / 10) % 10;
            }

            if ((number % 10) % 2 == 0) {
                evenSum += (number % 10);
            } else {
                oddSum += (number % 10);
            }

            if (evenSum > oddSum) {
                directions.add("left");
            } else if (evenSum < oddSum) {
                directions.add("right");
            } else {
                directions.add("straight");
            }
        }

        for (int i = 0; i < directions.size(); i++) {
            System.out.println(directions.get(i));
        }
    }
}
