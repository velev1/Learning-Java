import java.util.Scanner;

/**
 * Created by velev on 28.1.2018 г..
 */
public class Speeds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int carsCount = Integer.parseInt(scanner.nextLine());

        int groupLength = 1;
        int longestGroup = 1;

        int previousSpeed = Integer.parseInt(scanner.nextLine());
        int crrSum = previousSpeed;
        int finalSum = crrSum;

        for (int i = 0; i < carsCount - 1; i++) {
            int crrSpeed = Integer.parseInt(scanner.nextLine());

            if (previousSpeed == crrSpeed) {
                groupLength = 1;
                crrSum = crrSpeed;

                if (longestGroup == 1 && crrSum > finalSum) {
                    finalSum = crrSum;
                }

            } else if (previousSpeed < crrSpeed) {
                groupLength++;
                crrSum += crrSpeed;
            } else {
                if (groupLength == longestGroup && crrSum > finalSum) {
                    finalSum = crrSum;
                }

                groupLength = 1;
                crrSum = crrSpeed;
            }

            if (groupLength > longestGroup) {
                longestGroup = groupLength;
                finalSum = crrSum;
            }

            previousSpeed = crrSpeed;
        }

        System.out.println(finalSum);
    }
}