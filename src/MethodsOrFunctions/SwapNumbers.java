package Methods;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();

        System.out.println(x+" "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x+" "+y);
    }
}
