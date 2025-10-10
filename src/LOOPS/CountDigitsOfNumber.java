package LOOPS;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        if (n==0) count++;
        while (n!=0){
            n /= 10;
            count++;
        }
        System.out.println("Total Count = "+count);
    }
}
