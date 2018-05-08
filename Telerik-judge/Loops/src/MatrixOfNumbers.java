import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class MatrixOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print((j + i + 1) + " ");
            }

            System.out.println();
        }
    }
}
