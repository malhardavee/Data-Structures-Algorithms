package Conditionals;

import java.util.Scanner;

public class SidesOFATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side:");
        int b =sc.nextInt();
        System.out.println("Enter 3rd side: ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b) System.out.println(a+" "+b+" "+c+ " can be the sides of the Triangle");
        else System.out.println("The numbers can't be the sides of a triangle");
    }
}
