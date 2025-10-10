package Patterns;

import java.util.Scanner;

public class InvertedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
