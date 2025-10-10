package Methods;

import java.util.Scanner;

public class Combination {

    public static int Factorial(int n){
        int fact = 1;
        for (int i = 1; i<= n; i++){
            fact *= i;
        }
        return fact;
    }

    public static int combination(int a , int b){
        int n_fact = 1, r_fact = 1, n_rFact = 1;

        return Factorial(a)/(Factorial(b) * Factorial(a-b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("combination = "+ combination(n, r));
    }
}
