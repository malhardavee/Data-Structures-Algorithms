package Conditionals.Nested_If_Else;

import java.util.Scanner;

public class CoordinatesOnAStraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y1 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int x2 = sc.nextInt();
        System.out.print("Enter 4th number: ");
        int y2 = sc.nextInt();
        System.out.print("Enter 5th number: ");
        int x3 = sc.nextInt();
        System.out.print("Enter 6th number: ");
        int y3 = sc.nextInt();

        float m1 = (float) (y2 - y1) /(x2-x1);
        float m2 = (float) (y3-y2)  /(x3-x2);

        if (m1 == m2) System.out.println("All the Three Points fall on one straight line");
        else System.out.println("The Three Points are not on the same Line");
    }
}
