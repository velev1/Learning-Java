import java.util.Scanner;

/**
 * Created by velev on 30.1.2018 г..
 */
public class HexToDecimal {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            String inputHex = scanner.nextLine();

            int counter = 0;
            long result = 0L;

            for (int i = inputHex.length() - 1; i >= 0; i--) {
                switch (inputHex.charAt(i)) {
                    case 'A': result += (10 * (long)Math.pow(16, counter)); break;
                    case 'B': result += (11 * (long)Math.pow(16, counter)); break;
                    case 'C': result += (12 * (long)Math.pow(16, counter)); break;
                    case 'D': result += (13 * (long)Math.pow(16, counter)); break;
                    case 'E': result += (14 * (long)Math.pow(16, counter)); break;
                    case 'F': result += (15 * (long)Math.pow(16, counter)); break;
                    default:
                        result += (Long.parseLong(String.valueOf(inputHex.charAt(i))) * (long)Math.pow(16, counter));
                        break;
                }
                counter++;
            }

            System.out.println(result);
    }
}