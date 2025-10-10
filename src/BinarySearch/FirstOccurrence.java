package BinarySearch;
import java.util.*;
public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3, 5, 5, 6, 7, 7, 8};
        int target, answer = -1;
        int low = 0, high = arr.length - 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you'd like to search in the array: ");
        target = sc.nextInt();

        while (low <= high){
            int mid = (low+high)/2;

            if (arr[mid] < target) low = mid+1;
            else if (arr[mid] > target) high = mid - 1;
            else {
                if (mid > 0 && arr[mid] == arr[mid - 1]){
                    high = mid - 1;
                }
                else{answer = mid;
                    break;
                }
            }
            }
        System.out.println(answer);
        }
    }
