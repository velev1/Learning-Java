package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class BlurFilter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long blur = Long.parseLong(sc.nextLine());

        String[] matrixDimentions = sc.nextLine().split(" ");
        int rows = Integer.parseInt(matrixDimentions[0]);
        int cols = Integer.parseInt(matrixDimentions[1]);

        long[][] matrix = new long[rows][cols];

        String crrRow = "";
        for (int row = 0; row < rows; row++) {
            crrRow = sc.nextLine();
            String[] numbers = crrRow.split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Long.parseLong(numbers[col]);
            }
        }

        String[] blurCoord = sc.nextLine().split(" ");
        int blurRow = Integer.parseInt(blurCoord[0]);
        int blurCol = Integer.parseInt(blurCoord[1]);

        String matrixAfterBlur = blurMatrix(matrix, blur, blurRow, blurCol);

        System.out.print(matrixAfterBlur);
    }

    public static String blurMatrix(long[][] matrix, long blur, int row, int col) {

        StringBuilder result = new StringBuilder();
        
        for (int r = row - 1; r <= row + 1; r++) {
            if (r == -1) {
                continue;
            }
            if (r > matrix.length - 1) {
                break;
            }

            for (int c = col - 1; c <= col + 1; c++) {
                if (c == -1) {
                    continue;
                }
                if (c > matrix[r].length - 1) {
                    break;
                }
                matrix[r][c] += blur;
            }
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (j < matrix[i].length - 1) {
                    result.append(matrix[i][j] + " ");
                } else {
                    result.append(matrix[i][j]);
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
