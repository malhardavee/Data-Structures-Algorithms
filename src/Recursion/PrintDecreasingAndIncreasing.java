package Recursion;

import java.util.Scanner;

public class PrintDecreasingAndIncreasing {
    public static void Print(int x){

        if (x == 0) return;
        System.out.print(x+" ");
        Print(x -1);
        System.out.print(x+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        Print(n);
    }
}
