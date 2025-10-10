package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
     int[] arr = {10, 20, 40, 60 ,80, 30};
     int x = 100;
     for (int i=0;i< arr.length;i++){
         for (int j=0;j<arr.length;j++){
             if ((arr[i] != arr[j]) && (arr[i] + arr[j] == x)){
                 System.out.println(arr[i]+" "+arr[j]);
             }
             else continue;
         }
     }
    }
}
