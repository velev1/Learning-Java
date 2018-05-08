import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by velev on 3.2.2018 г..
 */
public class Ranks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String[] strNumbers = scanner.nextLine().split(" ");

        int[] numbers = new int[strNumbers.length];
        HashMap<String, Integer> ranks = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        Arrays.sort(numbers);

        for (int i =0; i<numbers.length; i++ ){
            ranks.put(Integer.toString(numbers[i]), numbers.length - i);
        }

        for (int i = 0; i < strNumbers.length; i++) {
            System.out.printf("%d ", ranks.get(strNumbers[i]));
        }

    }
}
