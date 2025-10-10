package Patterns;

import java.util.Scanner;

public class InvertedTriangle_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            // Spaces
            for (int j = 0; j < i; j++){
                System.out.print("  ");
            }
            // Stars
            for (int j = 0; j < (n-i); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
