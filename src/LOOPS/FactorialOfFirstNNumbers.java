package LOOPS;

import java.util.Scanner;

public class FactorialOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial = 1;

        for (int i = 1; i <= n; i++)
        {
            factorial *= i;
            System.out.print(factorial +" ");
        }
    }
}
