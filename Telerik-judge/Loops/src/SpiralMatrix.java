import java.util.Scanner;

/**
 * Created by velev on 30.1.2018 г..
 */
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int row = 0;
        int col = 0;
        String direction = "R";

        for (int i = 1; i <= n * n; i++) {
            if (direction.equals("R") && (col == n || matrix[row][col] != 0)) {
                direction = "D";
                col--;
                row++;
            } else if (direction.equals("D") && (row == n || matrix[row][col] != 0)) {
                direction = "L";
                col--;
                row--;
            } else if (direction.equals("L") && (col < 0 || matrix[row][col] != 0)) {
                direction = "U";
                row--;
                col++;
            } else if (direction.equals("U") && (row < 0 || matrix[row][col] != 0)) {
                direction = "R";
                row++;
                col++;
            }

            matrix[row][col] = i;

            switch (direction) {
                case "R":
                    col++;
                    break;
                case "L":
                    col--;
                    break;
                case "D":
                    row++;
                    break;
                case "U":
                    row--;
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
