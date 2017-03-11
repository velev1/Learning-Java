/*
 * A student travels n kilometers using only one type of transport based on the distance that he will travel:
    •	Taxi: Initial tax: 0.70 USD. Daytime cost: 0.79 USD/km. Night time cost: 0.90 USD/km.
    •	Bus: Day / Night tariff: 0.09 USD/km. For at least 20 kilometers.
    •	Train: Day / Night tariff: 0.06 USD/km. For at least 100 kilometers.
   Write a program that calculates the price of the trip by a given distance and time of day.
   Format the output to the second digit after the decimal separator.

 */
package javasyntaxlab;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class TransportPrice {

    
    public static void main(String[] args) {
        
        int distance = 0;
        
        double taxiInitialTax = 0.7; 
        double taxiDayCost = 0.79;
        double taxiNightCost = 0.9;
        double busCost = 0.09;
        double trainCost = 0.06;
        
        Scanner sc = new Scanner(System.in);
        
        distance = sc.nextInt();
        
        String partOftheDay = "";
        
        partOftheDay = sc.next();
        double result = 0;
        
        if (distance < 20) {
            switch(partOftheDay)
            {
                case "day": result = distance * taxiDayCost + taxiInitialTax;break;
                case "night": result = distance * taxiNightCost + taxiInitialTax;break;
            }
        }
        else if (distance >= 20 && distance < 100) {
            result = distance * busCost;
        }
        else {
            result = distance * trainCost;
        }
        
        System.out.printf("%.2f", result);
    }
}
