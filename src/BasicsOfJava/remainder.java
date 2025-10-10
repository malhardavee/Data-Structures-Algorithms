package BasicsOfJava;

import java.util.Scanner;

public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter dividend and divisor: ");
        int div = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(div%divisor);
    }
}
