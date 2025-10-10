package Arrays;

public class ReverseArray {
    public static void Print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 7, 11, 13};
        int[] arr2 = new int[arr1.length];
        int n = arr1.length;
        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[n - 1 - i];
        }
        Print(arr1);
        Print(arr2);
    }
}

