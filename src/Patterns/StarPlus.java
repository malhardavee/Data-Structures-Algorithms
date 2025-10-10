package Patterns;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int mid;
        if (n%2!=0) mid = (n+1)/2;
        else mid = n / 2;

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i==mid) System.out.print("* ");
                else if (j==mid)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
