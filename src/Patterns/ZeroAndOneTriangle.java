package Patterns;

import java.util.Scanner;

public class ZeroAndOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= i; j++) { // cols
                if ((i % 2 == 0 && j % 2 == 0) || (i%2==1 && j%2==1)) { // we can also use logic if (i+j)%2 ==0 sout(1) else sout(0)
                    System.out.print(1 + " ");
                }
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}