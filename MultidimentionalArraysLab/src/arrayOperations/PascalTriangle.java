/*
The triangle may be constructed in the following manner: In row 0 (the topmost row), there is a unique nonzero

entry 1. Each entry of each subsequent row is constructed by adding the number above and to the left with the

number above and to the right, treating blank entries as 0. For example, the initial number in the first (or any other)

row is 1 (the sum of 0 and 1), whereas the numbers 1 and 3 in the third row are added to produce the number 4 in

the fourth row.



 */
package arrayOperations;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class PascalTriangle {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        
        int[][] matrix = new int[n][n];
        matrix[0][0] = 1;
        
        int counterCols = 1;
        for (int i = 1; i < n; i++) {
            
            counterCols++;
            for (int j = 0; j < counterCols; j++) {
                
                if (j == 0) {
                    matrix[i][j] = matrix[i - 1][j];
                } else {
                    matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
                }
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    break;
                }
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        
    }
}
