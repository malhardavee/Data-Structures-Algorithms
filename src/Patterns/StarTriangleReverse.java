package Patterns;

import java.util.Scanner;

public class StarTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            // spaces
            for (int j =0; j < n-i; j++)
            {
                System.out.print("* ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}