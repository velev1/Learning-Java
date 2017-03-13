/*
Write a program that read a matrix from console. Then find biggest sum of 2x2 submatrix and print it to console.

On first line you will get matrix sizes in format rows, columns.

One next rows lines you will get elements for each column separated with coma.
 */
package arrayOperations;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class MaximumSumOf2x2Submatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] matrixDimentions = sc.nextLine().split(", ");
        int rows = Integer.parseInt(matrixDimentions[0]);
        int cols = Integer.parseInt(matrixDimentions[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] crrRow = sc.nextLine().split(", ");

            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(crrRow[j]);
            }
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int indexRow = 0;
        int indexCol = 0;

        for (int i = 0; i < matrix.length - 1; i++) {

            for (int j = 0; j < matrix[i].length - 1; j++) {

                sum += matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (sum > max) {
                    max = sum;
                    indexRow = i;
                    indexCol = j;
                }
                sum = 0;
            }
        }

        for (int i = indexRow; i < indexRow + 2; i++) {
            for (int j = indexCol; j < indexCol + 2; j++) {

               
                if (j == j + 1) {
                    System.out.printf("%d", matrix[i][j]);
                } else {
                     System.out.printf("%d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
        
        System.out.print(max);
    }
}
