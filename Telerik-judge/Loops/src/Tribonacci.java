import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by velev on 2.2.2018 г..
 */
public class Tribonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> trSequence = new ArrayList<>();

        long firstNumber = Long.parseLong(scanner.nextLine());
        long secondNumber = Long.parseLong(scanner.nextLine());
        long thirdNumber = Long.parseLong(scanner.nextLine());
        int indexOfNumberToFind = Integer.parseInt(scanner.nextLine());

        trSequence.add(firstNumber);
        trSequence.add(secondNumber);
        trSequence.add(thirdNumber);

        for (int i = 3; i < indexOfNumberToFind; i++) {
            trSequence.add(trSequence.get(i - 3) + trSequence.get(i - 2) + trSequence.get(i - 1));
        }

        System.out.println(trSequence.get(trSequence.size() - 1));
    }
}
