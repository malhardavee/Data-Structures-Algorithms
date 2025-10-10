package Strings;

import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle

        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;

            if (ch == ' ' || ascii >= 48 && ascii <= 57) continue;
            if (ascii >= 97 && ascii <= 122) flag = false;
            else flag = true;

            if (flag) { // uppercase → lowercase
                ascii += 32;
                str.setCharAt(i, (char) ascii);
            } else { // lowercase → uppercase
                ascii -= 32;
                str.setCharAt(i, (char) ascii);
            }
        }
        System.out.println(str);
    }
}
