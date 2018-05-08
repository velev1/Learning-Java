import java.util.Scanner;

/**
 * Created by velev on 29.1.2018 г..
 */
public class AllocateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(i * 5);
        }
    }
}

// template
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//    }