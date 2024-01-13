/*
 * Problem: Determine if String Halves Are Alike
 */
public class Leetcode_Problem_1704 {

    static boolean halvesAreAlike(String s) {
        String str = s.toUpperCase();
        int mid = str.length()/2;
        String s1 = str.substring(0, mid);
        String s2 = str.substring(mid);
        int count1 = 0, count2 = 0;
        for (int i = 0; i<s1.length(); i++) {
            if (s1.charAt(i) == 'A' || s1.charAt(i) == 'E'|| s1.charAt(i) == 'I' || s1.charAt(i) == 'O' || s1.charAt(i) == 'U') {
                count1++;
            }
        }
        for (int i = 0; i<s2.length(); i++) {
            if (s2.charAt(i) == 'A' || s2.charAt(i) == 'E'|| s2.charAt(i) == 'I' || s2.charAt(i) == 'O' || s2.charAt(i) == 'U') {
                count2++;
            }
        }
        if(count1==count2)
            return true;
        return false;
    }
    public static void main(String[] args) {
        String s = "boOk";
        System.out.println(halvesAreAlike(s));
    }
}
