package Conditionals.Nested_If_Else;

import java.util.Scanner;

public class DivisibleBy5And3ButNot15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 0 || n % 3 == 0){
                if (n % 15 != 0){
                System.out.println("the number is divisible by 5 or 3 but not 15");
                }
                else System.out.println("The number is divisible by 5, 3 and 15");
        }
        else System.out.println("The number is not divisible by 5 or 3");
    }
}

