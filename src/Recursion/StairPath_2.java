package Recursion;

import java.util.Scanner;

public class StairPath_2 {

    public static int stair(int n) {
        if (n == 0) return 1;  // one valid way (do nothing)
        if (n < 0) return 0;   // no way if negative
        return stair(n - 1) + stair(n - 2) + stair(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n = sc.nextInt();
        System.out.println("Ways: " + stair(n));
    }
}
