/*
Write a method that returns the first N odd/even elements from a collection. Return as many as you can.
Format: [Get <number of elements> <odd/even>]

Examples
Input           Output
1 2 3 4 5
Get 3 odd 	1 3 5
-----------------------
11 6 2 8 1 0
Get 8 even	6 2 8 0

 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class FirstOddOrEvenElements {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String[] numbersStr = sc.nextLine().split(" ");
        String[] getFormat = sc.nextLine().split(" ");
        
        int targetNumbersCount = Integer.parseInt(getFormat[1]);
        
        String result = extractTargetNumbers(numbersStr, targetNumbersCount, getFormat[2]);
        
        System.out.println(result);
    }
    
    public static String extractTargetNumbers(String[] numbers, int numberCount, String evenOrOdd) {
        
        StringBuilder result = new StringBuilder();
        int[] integers = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            integers[i]  = Integer.parseInt(numbers[i]);
        }
        
        int counter = 0;
        switch(evenOrOdd) {
            case "even":
                for (int i = 0; i < integers.length; i++) {
                    if (integers[i] % 2 == 0) {
                        result.append(integers[i]);
                        result.append(" ");
                        counter++;
                    }
                    if (counter == numberCount) {
                        break;
                    }
                }
                break;
            case "odd":
                for (int i = 0; i < integers.length; i++) {
                    
                    if (integers[i] % 2 != 0) {
                        result.append(integers[i]);
                        counter++;
                        result.append(" ");
                    }
                    if (counter == numberCount) {
                        break;
                    }
                }
                break;
        }
        
        return result.toString().trim();
    }
}
