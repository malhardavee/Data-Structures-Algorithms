package Patterns;

import java.util.Scanner;

public class AlphabetTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            // spaces
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // Alphabets
            for (int j = 1; j <= i; j ++){
                System.out.print((char)(j + 64));
            }
            System.out.println();
        }
    }
}
