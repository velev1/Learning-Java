/*

 */
package arrayOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class GroupNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] inputNumbers = sc.nextLine().split(", ");

        List<Integer> zeroRemainder = new ArrayList<Integer>();
        List<Integer> oneRemainder = new ArrayList<Integer>();
        List<Integer> twoRemainder = new ArrayList<Integer>();

        int numberContainer = 0;

        for (int i = 0; i < inputNumbers.length; i++) {
            
            if (Integer.parseInt(inputNumbers[i]) < 0) {
                numberContainer = ((Integer.parseInt(inputNumbers[i]) * -1) % 3);
            } else {
                numberContainer = (Integer.parseInt(inputNumbers[i]) % 3);
            }
            

            switch (numberContainer) {

                case 0:
                    zeroRemainder.add(Integer.parseInt(inputNumbers[i]));
                    break;
                case 1:
                    oneRemainder.add(Integer.parseInt(inputNumbers[i]));
                    break;
                case 2:
                    twoRemainder.add(Integer.parseInt(inputNumbers[i]));
                    break;
            }
        }

        String output = remainderExtractor(zeroRemainder);
        System.out.println(output);

        output = remainderExtractor(oneRemainder);
        System.out.println(output);

        output = remainderExtractor(twoRemainder);
        System.out.println(output);

    }

    public static String remainderExtractor(List<Integer> arr) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.size(); i++) {

            if (i == arr.size() - 1) {
                result.append(arr.get(i));
            } else {
                result.append(arr.get(i) + " ");
            }

        }

        return result.toString();
    }
}
