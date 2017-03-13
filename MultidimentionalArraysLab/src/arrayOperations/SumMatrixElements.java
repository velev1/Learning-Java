/*
Write program that read a matrix from console and print:

 Count of rows

 Count of columns

 Sum of all matrix’s elements

On first line you will get matrix sizes in format [rows, columns]
 */
package arrayOperations;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class SumMatrixElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] matrixDimentions = sc.nextLine().split(", ");

        int rows = Integer.parseInt(matrixDimentions[0]);
        int cols = Integer.parseInt(matrixDimentions[1]);

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            String[] crrRow = sc.nextLine().split(", ");

            for (int j = 0; j < crrRow.length; j++) {
                matrix[i][j] = Integer.parseInt(crrRow[j]);
                sum += matrix[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }

}
