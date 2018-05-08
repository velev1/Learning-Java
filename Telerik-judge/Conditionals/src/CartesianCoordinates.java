import java.util.Scanner;

/**
 * Created by velev on 26.1.2018 г..
 */
public class CartesianCoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == y && x == 0) {
            System.out.println(0);
        } else if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        } else if (x == 0 && y != 0) {
            System.out.println(5);
        } else if (x != 0 && y == 0) {
            System.out.println(6);
        }
    }
}
