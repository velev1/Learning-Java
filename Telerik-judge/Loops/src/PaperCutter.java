import java.util.Scanner;

/**
 * Created by velev on 4.2.2018 г..
 */
public class PaperCutter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1    2   3   4   5    6   7    8    9    10    11
        // A10  A9  A8  A7  A6  A5   A4   A3   A2   A1    A0
        // 1    2   4   8   16  32   64  128   256  512   1024

        String[] formats = {"A10", "A9", "A8", "A7", "A6", "A5", "A4", "A3", "A2", "A1", "A0"};
        int[] sheets = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int sheetsNeeded = Integer.parseInt(scanner.nextLine());

        for (int i = sheets.length - 1; i >= 0; i--) {
            if (sheetsNeeded - sheets[i] >= 0) {
                sheetsNeeded -= sheets[i];
                formats[i] = null;
            }
        }

        for (int i = formats.length - 1; i >= 0; i--) {
            if (formats[i] != null) {
                System.out.println(formats[i]);
            }
        }
    }
}
