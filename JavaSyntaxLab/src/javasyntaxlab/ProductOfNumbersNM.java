/*
 * Write a program that calculates the product of all numbers in the interval [n..m] by given n and m:
 */
package javasyntaxlab;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class ProductOfNumbersNM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger m = sc.nextBigInteger();
        
        String interval = "product["+ n +".." + m + "] = "; 
        
        BigInteger result = BigInteger.ONE;
        
        while(true) {
            result = result.multiply(m);
            m = m.subtract(BigInteger.ONE);
            
            if (m.compareTo(n) == -1) {
                break;
            }
        }
        
        System.out.print(interval + result);
    }
}
