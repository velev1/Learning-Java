/*
 * Write program that reads:
    •Two strings from the first line
    •Three Integers which may be on multiple lines
    •A string from the next line
Print the output in the following format {firstWord secondWord thirdWord sumOfNumbers}.

 */
package javasyntaxlab;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class ReadInput {

    public static void main(String[] args) {
        String firstWord = "";
        String secondWord = "";
        String thirdWord = "";
        int sum = 0;
        
        Scanner scan = new Scanner(System.in);
        firstWord = scan.next();
        secondWord = scan.next();
        sum += scan.nextInt();
        sum += scan.nextInt();
        sum += scan.nextInt();
        thirdWord = scan.next();
        
        System.out.printf("%s %s %s %d",firstWord,secondWord,thirdWord,sum);
    }
}
