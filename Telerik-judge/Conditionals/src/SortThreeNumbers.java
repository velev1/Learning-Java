import java.util.Scanner;

/**
 * Created by velev on 26.1.2018 г..
 */
public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber>= thirdNumber) {
            if (secondNumber >= thirdNumber){
                System.out.printf("%d %d %d",firstNumber, secondNumber, thirdNumber);
            } else {
                System.out.printf("%d %d %d",firstNumber, thirdNumber, secondNumber);
            }
        } else if(secondNumber > firstNumber && secondNumber>= thirdNumber){
            if (firstNumber >= thirdNumber) {
                System.out.printf("%d %d %d",secondNumber, firstNumber, thirdNumber);
            } else {
                System.out.printf("%d %d %d",secondNumber, thirdNumber, firstNumber);
            }
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            if (firstNumber >= secondNumber) {
                System.out.printf("%d %d %d", thirdNumber, firstNumber, secondNumber);
            } else {
                System.out.printf("%d %d %d", thirdNumber, secondNumber, firstNumber);
            }
        }
    }
}
