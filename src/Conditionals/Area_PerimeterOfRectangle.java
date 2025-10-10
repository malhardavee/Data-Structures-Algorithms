package Conditionals;

import java.util.Scanner;

public class Area_PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        int Area = length * breadth;
        int Perimeter = 2*(length + breadth);

        if (Area > Perimeter){
            System.out.println("Area is greater than Perimeter");
        } else if (Perimeter > Area) {
            System.out.println("Perimeter is greater than Area");
        }
        else System.out.println("both Area and Perimeter are Equal");
    }
}
