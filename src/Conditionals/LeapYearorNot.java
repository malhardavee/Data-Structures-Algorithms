package Conditionals;

import java.util.Scanner;

public class LeapYearorNot {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 400 != 0) {
                System.out.println(year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println(year + " is a Leap Year");
            }
            else System.out.println(year + " : Not a Leap Year");
        }
        else System.out.println(year + " : Not a Leap Year");
    }
}