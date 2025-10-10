package Arrays;

public class ReverseArrayUsingPointers {

    public static void Print(int[] arr){
        for (int i=0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {13, 8, 63, 57, 100, 2, 6};
        Print(arr);
        int i = 0;
        int j = arr.length - 1;
        int temp = arr[0];
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        Print(arr);
    }
}
