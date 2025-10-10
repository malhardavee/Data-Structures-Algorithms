package Conditionals;

import java.util.Scanner;

public class YoungestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ajay's age: ");
        int ajay = sc.nextInt();
        System.out.print("Enter Shyam's Age: ");
        int shyam = sc.nextInt();
        System.out.print("Enter Ram's Age: ");
        int ram = sc.nextInt();

        if (ajay < shyam && ajay < ram){
            System.out.println("ajay is youngest");
        } else if (shyam < ajay && shyam < ram) {
            System.out.println("shyam is youngest");
        }
        else System.out.println("Ram is youngest");
    }
}
