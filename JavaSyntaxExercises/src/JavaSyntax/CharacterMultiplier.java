/*
Create a method that takes two strings as arguments and returns the sum 
of their character codes multiplied 
(multiply str1.charAt (0) with str2.charAt (0) and add to the total sum).
Then continue with the next two characters. 
If one of the strings is longer than the other, 
add the remaining character codes to the total sum without multiplication.
 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class CharacterMultiplier {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String firstStr = sc.next();
        String secondStr = sc.next();
        
        int result = sumMultiplied(firstStr, secondStr);
        
        System.out.println(result);
    }
    
    public static int sumMultiplied(String firstWord, String secondWord) {
        
        int sum = 0;
        if (firstWord.length() == secondWord.length()) {
            
            for (int i = 0; i < firstWord.length(); i++) {
                sum+= firstWord.charAt(i) * secondWord.charAt(i);
            }
            
        } else if (firstWord.length() > secondWord.length()) {
            
            for (int i = 0; i < firstWord.length(); i++) {
                if (i >= secondWord.length()) {
                    sum+= firstWord.charAt(i);
                } else {
                    sum += firstWord.charAt(i) * secondWord.charAt(i);
                }
            }
            
        } else {
            for (int i = 0; i < secondWord.length(); i++) {
                if (i >= firstWord.length()) {
                    sum+= secondWord.charAt(i);
                } else {
                    sum += firstWord.charAt(i) * secondWord.charAt(i);
                }
            }
        }
        return sum;
    }
}
