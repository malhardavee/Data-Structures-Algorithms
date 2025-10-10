package Conditionals;
import java.util.*;
public class DivisibleBy5orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 5 == 0){
            System.out.println("It is divisible by 5");
        }
        else System.out.println("It is not divisible by 5");
    }
}
