package LOOPS;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        // 3,12,48,...n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 3, r = 4;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
