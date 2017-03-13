/*
Write a program to calculate points for all players and find who the winner is.
You will be given the count of the players, their names and initial scores. 
Score for every player depends on his name. 
To the player score add or subtract the ASCII code of each letter. If ASCII code is even, 
add it to the score. If is odd – subtract it from the score. 
Find the one with highest score and print his name and score on the console.
If two or more players are with same points – the winner is the first one.

Input
On the first input line, you will be given number N - the count of players.
On the next 2*N lines you will be given player name and hi initial score.

Output
The output should be printed on the console and consist the name of the winner and his score in the following format:
“The winner is {name} - {points} points”

Constraints
•	N – the count of players will be a positive integer in the range [1...100]
•	Names will be strings with length between 3 and 30
•	The score for each player will be an integer in the range [-100,000...100,000]

 */
package JavaSyntax;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class GameOfNames {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        //Map<String,Integer> namesAndScores = new HashMap<String,Integer>();
        String nameContainer = "";
        int pointsContainer = 0;

//        namesAndScores.put(nameContainer,pointsContainer);
//         namesAndScores.put(nameContainer, namesAndScores.get(nameContainer) - 1);
//         System.out.println(namesAndScores.get(nameContainer));
        String winner = "";
        int currentBestPoints = Integer.MIN_VALUE;

        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) {
                nameContainer = sc.nextLine();
            }
            if (i % 2 != 0) {
                pointsContainer = Integer.parseInt(sc.nextLine());
                //namesAndScores.put(nameContainer,pointsContainer);

                int calculatedPoints = calculatePointsInName(nameContainer);
                calculatedPoints += pointsContainer;
                if (calculatedPoints > currentBestPoints) {
                    currentBestPoints = calculatedPoints;
                    winner = nameContainer;
                }
                //namesAndScores.put(nameContainer, namesAndScores.get(nameContainer) + calculatedPoints);
            }
        }

        //The algorithm with the hashMap is done only for practice it do not solve corner case like equal points
        // for different kyes(names) this hapens because iterating the hashMap do not iterate with order of adding 
        // the elements
//       for(Map.Entry<String,Integer> entry: namesAndScores.entrySet()) {
//           
//           System.out.println("name " + entry.getKey() + " points - " + entry.getValue());
//           if (entry.getValue()> currentBestPoints) {
//               winner = entry.getKey();
//               currentBestPoints = entry.getValue();
//           }
//       } 
        System.out.printf("The winner is %s - %d points", winner, currentBestPoints);
    }

    public static int calculatePointsInName(String name) {

        int result = 0;

        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) % 2 == 0) {
                result += name.charAt(i);
            } else {
                result -= name.charAt(i);
            }
        }

        return result;
    }
}
