package LOOPS;

import java.util.Scanner;

public class PrimeOrCompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factor = 0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                factor +=1;
            }
            else continue;
        }
        if (factor > 2) System.out.println("It is a Composite Number");
        else System.out.println("It is a Prime Number");
    }
}
