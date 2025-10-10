package ARRAYS;

public class InitialisationOfArrays {
    public static void main(String[] args) {
//        int[] arr = {76, 83, 45, 64, 25};
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[0]);
//        arr[3] = 55;
//        System.out.println(arr[3]);
//        System.out.println(arr[0]);

    int[] x = new int[7];
        x[0] = 16;
        x[1] = 55;
        x[2] = 88;
        x[3] = 100;
        x[4] = 27;
        x[5] = 76;
        x[6] = 49;

        System.out.println(x.length);

        for (int i = 0; i < x.length; i++){
            System.out.print(x[i] + " " );
        }
    }
}
