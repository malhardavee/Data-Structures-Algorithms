package MethodsOrFunctions;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter three Numbers: ");
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
//        int number = (Math.max(a, b));
//        System.out.println(Math.max(c, number));
        System.out.println("Greatest number: "+ Math.max(a,Math.max(b, c)));
    }
}
