/*
Write a program that enters 3 points in the plane (as integer x and y coordinates),
calculates and prints the area of the triangle composed by these 3 points.
Round the result to a whole number. (cast to int ... )
In case the three points do not form a triangle, print "0" as result.
 */
package JavaSyntax;

import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class TriangleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int firstPointX = sc.nextInt();
        int firstPointY = sc.nextInt();
        int secondPointX = sc.nextInt();
        int secondPointY = sc.nextInt();
        int thirdPointX = sc.nextInt();
        int thirdPointY = sc.nextInt();

        double firstSide = vectorMagnitude(firstPointX, firstPointY, secondPointX, secondPointY);
        double secondSide = vectorMagnitude(secondPointX, secondPointY, thirdPointX, thirdPointY);
        double thirdSide = vectorMagnitude(firstPointX, firstPointY, thirdPointX, thirdPointY);

        double area = calculateAreaTriangleHeronFormula(firstSide, secondSide, thirdSide);

        System.out.print((int) (area));
    }

    public static double calculateAreaTriangleHeronFormula(double firstSide, double secondSide, double thirdSide) {

        double halfPerimeter = (firstSide + secondSide + thirdSide) / 2;

        double area = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));

        return area;
    }

    public static double vectorMagnitude(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {

        return Math.sqrt((secondPointX - firstPointX) * (secondPointX - firstPointX) + (secondPointY - firstPointY) * (secondPointY - firstPointY));
    }
}
