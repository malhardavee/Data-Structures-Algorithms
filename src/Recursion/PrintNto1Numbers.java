package Recursion;

import java.util.Scanner;

public class PrintNto1Numbers {
    public static void Print(int x){
        if (x == 0) return;
        System.out.print(x+" ");
        Print(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Print(n);
    }
}
