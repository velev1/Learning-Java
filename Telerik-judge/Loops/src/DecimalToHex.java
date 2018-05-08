import java.util.Scanner;

/**
 * Created by velev on 30.1.2018 г..
 */
public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input = Long.parseLong(scanner.nextLine());
        StringBuilder hexNum = new StringBuilder();
        long remainder;

        if (input == 0) {
            System.out.print(0);
        } else {
            while (input > 0) {
                remainder = input % 16;

                switch ((int) remainder) {
                    case 10:
                        hexNum.append("A");
                        break;
                    case 11:
                        hexNum.append("B");
                        break;
                    case 12:
                        hexNum.append("C");
                        break;
                    case 13:
                        hexNum.append("D");
                        break;
                    case 14:
                        hexNum.append("E");
                        break;
                    case 15:
                        hexNum.append("F");
                        break;
                    default:
                        hexNum.append(remainder);
                        break;
                }
                input = input / 16;
            }

            for (int i = hexNum.length() - 1; i >= 0; i--) {
                System.out.print((hexNum.charAt(i)));
            }
        }
    }
}
