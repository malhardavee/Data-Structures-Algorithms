package Arrays;

public class SecondLargestElement {
    static int i;
    public static int Max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i <arr.length;i++){
            if (arr[i] > max)
                max = arr[i];
        }
    return max;
    }

    public static int S_Max(int[] arr){
        int s_max = Integer.MIN_VALUE;
        for (int i=0; i <arr.length;i++){
            if (arr[i] > s_max && arr[i] != Max(arr))
                s_max = arr[i];
        }
        return s_max;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 7, 2, 3};
        System.out.println("Largest Number: "+Max(numbers));
        System.out.println("Second Largest Number: "+S_Max(numbers));
    }
}
