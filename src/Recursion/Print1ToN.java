package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void Print(int x, int n){
        ///  APPROACH 1 - USING RECURSION WITH STACK
//        if (x == 0) return;
//        Print(x -1);
//        System.out.print(x+" ");
        /// APPROACH 2 - USING EXTRA PARAMETER
        if (x > n) return;
        System.out.print(x+" ");
        Print(x+1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

        Print(1, n);
    }
}
