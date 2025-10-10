package Recursion;

import java.util.Scanner;

public class LogarithmicPowerFunction {
    public static int PowerLog(int a , int b){
        if (b == 0) return 1;
        int x = PowerLog(a,b/2);
        if(b%2==0) return x * x;
        else return x * x * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println(a+"^"+b+" = "+ PowerLog(a, b));
    }
}
