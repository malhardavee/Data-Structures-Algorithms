package MethodsOrFunctions;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int pow = 1;
//        for (int i = 1; i<=b;i++)
//            pow *= a;
//        System.out.println(pow);
        System.out.println(Math.pow(4,3));
        System.out.println(Math.abs(-38));
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(Math.max(a, b));
        System.out.println();
    }
}
