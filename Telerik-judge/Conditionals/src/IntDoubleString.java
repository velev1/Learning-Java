import java.util.Scanner;

/**
 * Created by velev on 26.1.2018 г..
 */
public class IntDoubleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputType = scanner.nextLine();

        switch (inputType) {
            case "integer":
                int intNumber = scanner.nextInt() + 1;
                System.out.println(intNumber);
                break;
            case "real":
                double doubleNumber = scanner.nextDouble() + 1;
                System.out.printf("%.2f",doubleNumber);
                break;
            case "text":
                String stringValue = scanner.nextLine() + "*";
                System.out.println(stringValue);
                break;
        }
    }
}
