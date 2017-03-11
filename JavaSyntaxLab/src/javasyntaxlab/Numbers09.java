/*
 * Using a while loop, print the numbers from 0 to 9 inclusive.
 */
package javasyntaxlab;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class Numbers09 {

  
    public static void main(String[] args) {
        
        int counter = 0;
        
        while(true) {
            System.out.println("Number: " + counter);
            counter++;
            if (counter == 10) {
                break;
            }
        }
    }
}
