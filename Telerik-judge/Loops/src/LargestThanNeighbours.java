import java.util.Scanner;

/**
 * Created by velev on 2.2.2018 г..
 */
public class LargestThanNeighbours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        String[] numbers = scanner.nextLine().split(" ");

        int biggerThanNeighbours = findCountOfGreaterNeighbours(numbers);
        System.out.println(biggerThanNeighbours);
    }

    private static int findCountOfGreaterNeighbours(String[] numbers) {
        int biggerThanNeighbours = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (
                    i != 0 &&
                            i != numbers.length - 1 &&
                            Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i - 1]) &&
                            Integer.parseInt(numbers[i]) > Integer.parseInt(numbers[i + 1])
                    ) {
                biggerThanNeighbours++;
                i++;
            }
        }
        return biggerThanNeighbours;
    }
}
