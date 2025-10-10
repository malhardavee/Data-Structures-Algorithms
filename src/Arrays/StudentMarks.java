package ARRAYS;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ënter total number of Students: ");
        int n = sc.nextInt();
        int [] S_marks = new int[n];
        System.out.println("Enter Student marks");
        // TAKING INPUT
        for (int i = 0; i < n; i++){
            S_marks[i] = sc.nextInt();
        }
    // CHECK FOR MARKS < 35
        for (int i=0;i<n;i++){
            if (S_marks[i] < 35)
                System.out.print((i+1) + " ");
        }
    }
}
