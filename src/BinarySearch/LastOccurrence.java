package BinarySearch;

import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 5, 5, 6, 7, 7, 8};
        int target, answer = -1;
        int low = 0, high = arr.length - 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        target = sc.nextInt();

        while (low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                answer = mid;    // Found a match, but keep looking to the right
                low = mid + 1;
            }
        }

        System.out.println(answer); // index of last occurrence or -1
    }
}
