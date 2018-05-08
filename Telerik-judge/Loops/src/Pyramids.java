import java.util.Scanner;

/**
 * Created by velev on 5.2.2018 г..
 */
public class Pyramids {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTwos = 0;
        int countFives = 0;
        int countSevens = 0;

        int number = Integer.parseInt(scanner.nextLine());

        if (number % 2 == 0) {
            countTwos = number /2;
        } else {
            countFives = 1;
            countTwos = (number - 5) / 2;
        }

    }
}
