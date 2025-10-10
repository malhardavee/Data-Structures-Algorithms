package Strings;

public class Interning {
    public static void main(String[] args) {
        String s = "Hello"; // -> Heylo
        String x = "Hello";
        x = "Mello";
//        System.out.println(x);
        s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
