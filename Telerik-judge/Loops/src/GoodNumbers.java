import java.util.Scanner;

/**
 * Created by velev on 3.2.2018 г..
 */
public class GoodNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottom = scanner.nextInt();
        int top = scanner.nextInt();
        int counter = 0;
        boolean isFound = false;

        for (int i = bottom; i <= top; i++) {
            String strNumber = Integer.toString(i);
            for (int j = 0; j < strNumber.length(); j++) {
                if (!strNumber.substring(j, j + 1).equals("0") && i % Integer.parseInt(strNumber.substring(j, j + 1)) != 0){
                    isFound = false;
                    break;
                }

                isFound = true;
            }

            if (isFound){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
