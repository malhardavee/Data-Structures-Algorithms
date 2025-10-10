package BinarySearch;

public class SmallestMissingNonNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int n = arr.length, missing = n;
        int lo = 0, hi = n-1;

        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid] == mid) lo = mid+1;
            else{
                missing = mid;
                hi = mid-1;
            }
        }
        System.out.println(missing);
    }
}
