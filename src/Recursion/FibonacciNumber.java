package Recursion;

import java.util.Scanner;

public class FibonacciNumber { /// 1 1 2 3 5 8 13 21 34 55 89 ...

    public static int Fibo(int n){
        if (n == 1 || n == 2) return 1;
        return Fibo(n-1) + Fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); int n = sc.nextInt();
        System.out.println(Fibo(n));
    }
}
