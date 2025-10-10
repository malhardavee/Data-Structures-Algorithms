package Patterns;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            // SPACES
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            // STARS
            for (int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            // SPACES
            for (int j = 1; j<= i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
