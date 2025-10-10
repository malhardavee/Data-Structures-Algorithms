package MethodsOrFunctions;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter three Numbers: ");
        int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
        System.out.println("Smallest Number: "+ Math.min(a,Math.min(b, c)));
    }
}
