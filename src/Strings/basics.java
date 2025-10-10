package Strings;
import java.util.*;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String str = "Malhar";
//        String s = "Hello";
//        System.out.println(str);
//        String s = sc.next();
//        String s = sc.nextLine();
//        System.out.println(s);
//        int len  = str.length();
//        System.out.println(str.length());
//        char ch = str.charAt(0);
//        System.out.println(str.charAt(1));
//        int idx = str.indexOf('l');
//        System.out.println(idx);
//        System.out.println(str.compareTo(s));

        String str = "Physics";
        String gtr = "Wallah";
        /// startsWith, contains, endsWith
        System.out.println(str.endsWith("Wallah"));
        /// toLowerCase(), toUpperCase(), concatenates()
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(gtr));


    }
}
