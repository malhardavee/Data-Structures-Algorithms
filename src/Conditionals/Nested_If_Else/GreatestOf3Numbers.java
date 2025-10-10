package Conditionals.Nested_If_Else;

import java.util.Scanner;

public class GreatestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b){
            if (a > c){
                System.out.println("A is Greatest");
            }
            else System.out.println("C is Greatest");
        }
        else if (b > c) {
            System.out.println("B is Greatest");
        }
        else System.out.println("C is Greatest");
    }
}
