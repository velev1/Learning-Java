/*
 Print all combinations from TOTO 3/10 lottery (like 6/49 but with less combinations):
 */
package javasyntaxlab;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class Lottery {

   
    public static void main(String[] args) {
        
        int firstPos = 1;
        //int counter = 0;
        
        for (int i = firstPos; i <= 8; i++) {
            
            for (int j = 1 + i; j <= 9; j++) {
                
                for (int k = 1 + j; k <= 10; k++) {
                    System.out.printf("%d %d %d",i,j,k);
                    //counter++;
                    System.out.println();
                }
            }
        }
        //System.out.println(counter);
    }
}
