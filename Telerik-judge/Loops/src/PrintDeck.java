import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class PrintDeck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"spades", "clubs", "hearts", "diamonds"};
        boolean isReached = false;

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                if (j == 3) {
                    System.out.printf("%s of %s", cards[i], suits[j]);
                    System.out.println();
                }
                else {
                    System.out.printf("%s of %s, ", cards[i], suits[j]);
                }

                if (input.equals(cards[i])) {
                    isReached = true;
                }
            }

            if (isReached) {
                break;
            }

        }
    }
}
