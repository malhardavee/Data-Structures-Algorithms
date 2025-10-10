package Patterns;

import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++){
            // SPACES
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            // ALPHABETS
            for (int j = 1; j <= (2*i-1); j++){
                System.out.print((char)(j+64)+ " ");
            }
            // SPACES
            for (int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
