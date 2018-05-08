import java.util.Scanner;

/**
 * Created by velev on 2.2.2018 г..
 */
public class FirstLargestThanNeighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        String[] numbers = scanner.nextLine().split(" ");

        int firstBiggerThanNeighbours = getFirstBiggerThanNeighboursIndex(numbers);
        System.out.println(firstBiggerThanNeighbours);
    }

    private static int getFirstBiggerThanNeighboursIndex(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {

            if (
                    i != 0 &&
                            i != numbers.length - 1 &&
                            Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i - 1]) &&
                            Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i + 1])
                    ) {
               return i;
            }
        }
        return -1;
    }
}
