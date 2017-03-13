/*
Write a program that:

 Read array of strings from the console
 Sort array alphabetically
 Print new array to the console

On first line, you will always have number of rows of matrix
 */
package arrayOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class ReadSortPrintArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());

        List<String> names = new ArrayList<String>();
        String[] sortedNames = new String[rows];

        for (int i = 0; i < rows; i++) {
            names.add(sc.nextLine());
        }
        
        String crrMinString = "";
        int index = 0;
        while(names.size() > 0) {
            crrMinString = names.get(0);
            
            for (int j = 0; j < names.size(); j++) {
                
                if (names.get(j).compareTo(crrMinString) < 0) {
                    crrMinString = names.get(j);
                }
            }
            sortedNames[index] = crrMinString;
            index++;
            names.remove(crrMinString);
        }
        
        for (int i = 0; i < sortedNames.length; i++) {
            System.out.println(sortedNames[i]);
        }
    }

}
