package Arrays;

public class NoOfElementsGreaterThanX {
    public static void main(String[] args) {
        int x = 70;
        int[] arr = {10 , 20, 30, 45, 60, 77, 81};
        int count = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] > x)
                count++;
            else continue;
        }
        System.out.println("No. of Elements greater than "+x+" is: "+count);
    }
}
