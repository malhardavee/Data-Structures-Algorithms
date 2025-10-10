package Conditionals;

import java.util.Scanner;

public class ThreeDigitNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if ((n > 99 && n < 1000) || (n < -99 && n > -1000)){
            System.out.println(n+" is a three Digit Number");
        }
        else System.out.println(n+" is not a Three Digit Number");
    }
}
