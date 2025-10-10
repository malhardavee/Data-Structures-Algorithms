package Patterns;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 2*i-1; j+=2){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
