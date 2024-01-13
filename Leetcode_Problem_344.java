/*
 * Problem: Reverse String
 * reverce character array
 */

import java.util.Arrays;

public class Leetcode_Problem_344 {
/*
    //Method 1
    static void reverseString(char[] s) {
        int j = s.length-1;
        int i = 0;
        while(i<j) {
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            j--;
            i++;
        }
        System.out.println(s);
    }*/
    //Method 2
    static void reverseString(char[] s) {
        char [] ch = new char[s.length];
        int j = s.length-1;
        for (int i = 0; i < s.length; i++) {
            ch[j] = s[i];
            j--;
        }
        for (int i = 0; i < ch.length; i++) {
            s[i] = ch[i];
        }
        System.out.println(ch);
    }
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
