package Conditionals;

import java.util.Scanner;

public class DivisibleBy5ButNot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 5 == 0) {
            if (n % 3 != 0) {
                System.out.println("The number is divisible by 5 but not 3");
            } else System.out.println("The number is divisible by both 5 and 3");
        }
        else System.out.println("The number is not divisible by 5");
    }
}
