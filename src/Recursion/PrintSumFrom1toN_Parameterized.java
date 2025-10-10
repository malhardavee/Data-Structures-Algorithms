package Recursion;

import java.util.Scanner;

public class PrintSumFrom1toN_Parameterized {

    public static void Sum(int n, int s){
        if (n == 0) {
            System.out.println("Sum = "+s);
            return;
        }
        Sum(n-1, s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        Sum(n, 0);
    }
}
