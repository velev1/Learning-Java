import java.util.Scanner;

/**
 * Created by velev on 27.1.2018 г..
 */
public class Flask {
    public static void main(String[] args) {
        // 0 1 2 3 4  5
        // 1 2 3 4 5  6   7   8   9   10  11 12 13
        // 0 1 3 6 10 15  21  28  36  45  55 66 78
        // 1 1 2 3 5  8
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        long litr = Long.parseLong(input[1]);

        long crrLitr = 0;
        int index = 0;
        for (int i = 1; i <= n; i++) {
            crrLitr = crrLitr + index;
            index++;
            if (crrLitr >= litr && i % 2 != 0){
                System.out.println(i);
                break;
            }
        }
    }
}