import java.util.Scanner;

/**
 * Created by velev on 30.1.2018 г..
 */
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputBin = scanner.nextLine();

        int counter = 0;
        long result = 0L;

        for (int i = inputBin.length() - 1; i >= 0; i--) {
            result += (Long.parseLong(inputBin.substring(i, i + 1)) * (long) Math.pow(2, counter));
            counter++;
        }

        System.out.println(result);
    }
}
