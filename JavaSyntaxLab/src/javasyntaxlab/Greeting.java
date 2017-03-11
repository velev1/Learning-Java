/*
 * Read first and last number as an input. Print a greeting starting with "Hello" 
   where if a name is missing, replace it with five stars "*":
example: 
input       output
Robert
Ford        Hello, Robert Ford!

Ford        Hello, ***** Ford!

 */
package javasyntaxlab;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class Greeting {

    public static void main(String[] args) {
       String firstName = "";
       String lastName = "";
       
       Scanner sc = new Scanner(System.in);
       
       firstName = sc.nextLine();
       lastName = sc.nextLine();
       
        if (firstName.isEmpty()) {
            firstName = "*****";
        }
        if (lastName.isEmpty()) {
            lastName = "*****";
        }
        
        System.out.printf("Hello, %s %s!", firstName,lastName);
    }
}
