package Strings;
import java.util.*;
public class Builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str); // hello
        // hello -> mello
        str.setCharAt(0,'m');
        System.out.println(str); // mello
        str.append(10);
        System.out.println(str); // mello10
        StringBuilder s = new StringBuilder("helo");
        System.out.println(s);// helo
        s.insert(2,'l');
        System.out.println(s);// hello
        s.deleteCharAt(0);
        System.out.println(s); // ello

    }
}
