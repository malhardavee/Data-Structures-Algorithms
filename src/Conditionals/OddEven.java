package Conditionals;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if(x % 2 == 0)
        {
            System.out.println(x+" is an Even Number");
        }
        else System.out.println(x+ " is an Odd Number");
    }
}
