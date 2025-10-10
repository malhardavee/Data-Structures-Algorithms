package LOOPS;

import java.util.Scanner;

public class ProductOfNonZeroDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int product = 1;
        while (n>0){
            if (n%10 != 0) {
                product *= n % 10;
                n /= 10;
            }
            else
                n /= 10;
        }
        System.out.println(product);
    }
}
