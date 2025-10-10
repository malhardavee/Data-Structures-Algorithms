package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int x){
        int fact = 1;
        if(x == 0 || x == 1) return 1; // base case
        return x * factorial(x-1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial: "+ factorial(n));
    }
}
