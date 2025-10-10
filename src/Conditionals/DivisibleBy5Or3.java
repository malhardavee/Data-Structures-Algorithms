package Conditionals;

import java.util.Scanner;

public class DivisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 || n % 5 == 0){
            System.out.println("Number is divisible by 3 or 5");
        }
        else System.out.println("Number is not divisible by 3 or 5");
    }
}
