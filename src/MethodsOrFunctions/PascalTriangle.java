package MethodsOrFunctions;

import java.util.Scanner;

public class PascalTriangle {

    public static int Fact(int n){
        int factorial = 1;
        for (int i =1 ; i<=n;i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i <=n; i++){
            // SPACES
            for (int j = 1 ; j <= (n-i); j++)
                System.out.print(" "+" ");
            // NUMBERS
            for (int j = 0; j <= i; j++){
                System.out.print(Fact(i)/(Fact(j) * Fact(i-j))+"   ");
            }
            System.out.println();
        }
    }
}

