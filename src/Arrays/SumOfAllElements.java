package ARRAYS;

import java.util.Scanner;

public class SumOfAllElements {

    public static int sum(int[] arr){
        int sum = 0;
        for (int i=0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of elements in the array = "+sum(arr));
    }
}
