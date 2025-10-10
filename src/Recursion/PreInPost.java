package Recursion;

import java.util.Scanner;

public class PreInPost {

    public static void pre_in_post(int n){
        if (n==0) return;
        System.out.println("Pre "+n);
        pre_in_post(n-1);
        System.out.println("In "+n);
        pre_in_post(n-1);
        System.out.println("Post "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        pre_in_post(n);
    }
}
