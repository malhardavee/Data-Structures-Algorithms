package Arrays;

public class MaximumValue {

    public static int Max(int[] arr){
        int maximum = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i] > maximum)
                maximum = arr[i];
            else continue;
        }
        return maximum;
    }

    public static void main(String[] args) {
     int[] numbers = {-10, -5, -31, -68, -59, -73, -22, -91, -46};
        System.out.println("Maximum number: "+ Max(numbers));
    }
}
