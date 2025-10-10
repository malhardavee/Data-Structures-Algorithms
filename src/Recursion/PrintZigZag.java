package Recursion;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrintZigZag {
    public static void zig_zag(int n){
        if (n==0) return;
        System.out.print(n+" ");
        zig_zag(n-1);
        System.out.print(n+" ");
        zig_zag(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        zig_zag(n);
    }
}
