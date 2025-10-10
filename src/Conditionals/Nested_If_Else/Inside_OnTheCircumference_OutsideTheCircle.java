package Conditionals.Nested_If_Else;

import java.util.Scanner;

public class Inside_OnTheCircumference_OutsideTheCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 2, y = 3, r = 6;
        System.out.print("Enter x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1: ");
        int y1 = sc.nextInt();

        float d = ((x-x1)*(x-x1)) + ((y-y1)*(y-y1));

        if (d == r*r) System.out.println("The point lies on the circumference");
        else if (d > r*r) System.out.println("The point lies outside the circle");
        else System.out.println("The point lies inside the circle");
    }
}
