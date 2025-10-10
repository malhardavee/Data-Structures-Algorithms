package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String str = "abc";
        print(str, "", l);
        for (String s : l) {
            System.out.println(s);
        }
    }
    public static void print(String str, String ans, List<String> l){
        if (str.equals("")){
            l.add(ans);
            return;
        }
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i); // b
            String left = str.substring(0,i); // a
            String right = str.substring(i+1); // c
            String remaining = left + right;
            print(remaining, ans+ch, l);

        }
    }
}
