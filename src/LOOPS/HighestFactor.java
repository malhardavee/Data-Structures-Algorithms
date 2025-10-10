package LOOPS;

import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int factor = 0;
        for (int i=1;i<n;i++){
            if (n%i == 0){
                if (factor < i) factor = i;
                else return;
            }
            else continue;
        }
        System.out.println("Highest Factor: "+factor);
    }
}
