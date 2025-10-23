package _00_CodeTest;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "ohell";

        String[] str = new String [A.length()];

        for (int i = 0; i < A.length(); i++) {
            str[i] = String.valueOf(A.charAt(i));
        }
        System.out.println(Arrays.toString(str));
    }
}
