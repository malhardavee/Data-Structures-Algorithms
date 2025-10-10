package LOOPS;

import java.util.Scanner;

public class SumOfAllEvenDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
            if (n%2 == 0){
                sum = sum + (n%10);
                n = n/10;
            }
            else n /= 10;
        }
        System.out.println("Sum of Even Digits = "+sum);
    }
}
