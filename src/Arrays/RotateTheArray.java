package Arrays;

import java.util.Scanner;

public class RotateTheArray {

    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int k) {
        int temp;
        while (i < k) {
            temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times you want to rotate the Array: ");
        int k = sc.nextInt();
        int[] arr = {13, 8, 63, 57, 100, 2, 6};
        Print(arr);
        int n = arr.length;
        if (k % n == 0) {
            Print(arr);
        } else {
            swap(arr, 0, n - k - 1);
            swap(arr, n - k, n - 1);
            swap(arr, 0, n - 1);
            Print(arr);
        }
    }
}