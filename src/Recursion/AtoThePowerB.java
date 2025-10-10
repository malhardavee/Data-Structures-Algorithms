package Recursion;

import java.util.Scanner;

public class AtoThePowerB {
    public static int Power(int a , int b){
        if (b == 0) return 1;
        return a * Power(a, b-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println(a+"^"+b+" = "+Power(a, b));
    }
}
