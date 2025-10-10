package Recursion;

import java.util.Scanner;

public class Maze2 {
    public static int maze(int n, int m){
        int rightWays = 0;
        int downWays = 0;
        if (n==1 && m==1) return 1;
        if (n==1){
            rightWays += maze(n, m-1);
        }
        if (m==1){
            downWays += maze(n-1, m);
        }
        if (n > 1 && m > 1){
            rightWays += maze(n, m-1);
            downWays += maze(n-1, m);
        }
        int TotalWays = rightWays + downWays;
        return TotalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        System.out.println(maze(n, m));
    }
}
