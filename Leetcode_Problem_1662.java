/*
 * Problem: Check If Two String Arrays are Equivalent
 */
public class Leetcode_Problem_1662 {

    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = "";
        String w2 = "";
        for (String i : word1)
            w1 += i;
        for (String i : word2)
            w2 += i;
        if (w1.equals(w2))
            return true;
        return false;
    }
    public static void main(String[] args) {
        String [] word1 = {"a","bc"};
        String [] word2 = {"ab","c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
        
    }
}
