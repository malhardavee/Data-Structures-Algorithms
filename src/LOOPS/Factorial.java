package LOOPS;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long factorial = 1;
        int n = sc.nextInt();
        if (n == 0) System.out.println("factorial = 0");
        for (int i = n; i > 0; i--)
        {
            factorial *= i;
        }
        System.out.print("factorial = "+factorial);
    }
}
