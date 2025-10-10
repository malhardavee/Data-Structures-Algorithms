package Recursion;

import java.util.Scanner;

public class TowerOfHANOI {
    public static void tower(int n, char s, char h, char d){
        if (n==0) return;
        tower(n-1,s,d,h);
        System.out.println(s+" -> "+d);
        tower(n-1, h, s, d);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int n = sc.nextInt();
        tower(n,'A','B', 'C');
    }
}
