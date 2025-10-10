package Methods;

import java.util.Scanner;

public class Permutation {

    public static int Factorial(int n){
        int fact = 1;
        for (int i = 1; i<= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static int permutation(int a , int b){

        return Factorial(a)/(Factorial(a-b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("Permutation = "+permutation(n, r));
    }
}
