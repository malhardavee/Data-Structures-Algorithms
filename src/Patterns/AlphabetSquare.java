package Patterns;

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i=65;i<65+n;i++)
        {
            for (int j=65;j<65+n;j++)
            {
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }
}
