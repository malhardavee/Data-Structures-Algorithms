package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number you'd like to search: ");
        int num = sc.nextInt();
int count = 0;
        for (int i=0;i< arr.length;i++)
            if (num == arr[i]){
                count++;
                System.out.print(i+" ");
            }
            else continue;

        if (count < 1)
            System.out.println("The number "+num+" is not in the array");
    }
}
