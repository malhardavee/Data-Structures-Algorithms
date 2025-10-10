package LOOPS;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        // a, a+d, a+2d, a+3d
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2*n-1; i += 2){
            System.out.print(i+" ");
        }
    }
}
