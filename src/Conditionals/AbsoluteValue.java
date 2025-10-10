package Conditionals;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0){
            System.out.println(n);
        }
        else {
            n *= -1;
            System.out.println(n);
        }
    }
}
