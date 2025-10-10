package Conditionals.Nested_If_Else;

import java.util.Scanner;

public class PositionOfPointOnThePlane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter x: ");
        x = sc.nextInt();
        System.out.println("Enter y: ");
        y = sc.nextInt();

        if (x == 0) {
            if (y == 0) System.out.println("The point lies on the ORIGIN");
            else System.out.println("The point lies on the Y-Axis");
        } else if (y == 0) {
            System.out.println("The point lies on X-Axis");
        } else System.out.println("The point lies in the X-Y Plane");
    }
}
