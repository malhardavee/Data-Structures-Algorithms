package LOOPS;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n!=0){
            System.out.print(n%10 + " ");
            n /= 10;
        }
    }
}
