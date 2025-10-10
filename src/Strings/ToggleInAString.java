package Strings;
import java.util.*;
public class ToggleInAString {
    public static void main(String[] args) {
        String str = "phYSiCS";
        StringBuilder sb = new StringBuilder(str);
        boolean flag = true;
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ch == ' ' || ascii >= 48 && ascii <= 57) continue;
            if (ascii >= 97 && ascii <= 122) flag = false;
            else flag = true;

            if (flag) { // uppercase → lowercase
                ascii += 32;
                char dh = (char) ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            } else { // lowercase → uppercase
                ascii -= 32;
                char dh = (char) ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
