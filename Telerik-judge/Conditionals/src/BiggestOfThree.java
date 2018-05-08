import java.util.Scanner;

/**
 * Created by velev on 23.1.2018 г..
 */
public class BiggestOfThree {
    public static void main(String[] arrgs) {
        Scanner scanner = new Scanner(System.in);

        float firstNumber = scanner.nextFloat();
        float secondNumber = scanner.nextFloat();
        float thirdNumber = scanner.nextFloat();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            if (firstNumber - (int)firstNumber == 0) {
                int numberToPrint = (int)firstNumber;
                System.out.println(numberToPrint);
            } else {
                System.out.println(firstNumber);
            }
        } else if (firstNumber < secondNumber && secondNumber >= thirdNumber) {
            if (secondNumber - (int)secondNumber == 0) {
                int numberToPrint = (int)secondNumber;
                System.out.println(numberToPrint);
            } else {
                System.out.println(secondNumber);
            }
        } else if (secondNumber < thirdNumber) {
            if (thirdNumber - (int)thirdNumber == 0){
                int numberToPrint = (int)thirdNumber;
                System.out.println(numberToPrint);
            } else{
                System.out.println(thirdNumber);
            }
        }
    }
}