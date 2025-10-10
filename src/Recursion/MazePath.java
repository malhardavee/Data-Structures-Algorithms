package Recursion;

import java.util.Scanner;

public class MazePath {

    public static int maze(int cr, int cc,int er, int ec){
        int rightWays = 0;
        int downWays = 0;

        if (cr == er && cc == ec) return 1;
        if (cr == er) { // only right call
            rightWays += maze(cr,cc + 1,er,ec);
        }
        if (cc == ec){ // only downwards call
            downWays += maze(cr + 1, cc, er, ec);
        }
        if (cr<er && cc<ec){
            rightWays += maze(cr,cc + 1,er,ec);
            downWays += maze(cr + 1, cc, er, ec);
        }
        int totalWays = rightWays + downWays;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int m = sc.nextInt();
        int NoOfWays = maze(1,1 , n, m);
        System.out.println(NoOfWays);
    }
}
