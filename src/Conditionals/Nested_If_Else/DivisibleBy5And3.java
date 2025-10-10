package Conditionals.Nested_If_Else;

import java.util.Scanner;

public class DivisibleBy5And3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 5 == 0){
            if (n % 3 == 0) System.out.println("the number is divisible by 5 and 3");
            else System.out.println("The number is not divisible by 5 and 3");
        }
        else System.out.println("The number is not divisible by 5 and 3");
    }
}
