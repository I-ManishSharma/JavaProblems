/*
 * Binary Operators.
 * oprators         rules           example
 * --------------------------------------------
 * ANd (&)          0 & 0 = 0       5 & 6
 *                  0 & 1 = 0       0101 --5
 *                  1 & 0 = 0     & 0110 --6
 *                  1 & 1 = 1       0100 --4
 * --------------------------------------------
 * OR (|)           0 | 0 = 0       5 & 6
 *                  0 | 1 = 1       0101 --5
 *                  1 | 0 = 1     | 0110 --6
 *                  1 | 1 = 1       0111 --7
 * --------------------------------------------
 * XoR (^)          0 ^ 0 = 0       5 & 6
 *                  0 ^ 1 = 1       0101 --5
 *                  1 ^ 0 = 1     ^ 0110 --6
 *                  1 ^ 1 = 0       0011 --3
 * --------------------------------------------
 * Binary One's Complement (or NOT operator (~))
 * Rule             ~0 = 1
 *                  ~1 = 0
 * Example          ~5 = ~101 = 010
 * Note: But in this we check LSB (Least Significant Bit) and MSB (Most Significant Bit). So when we perform NOT on 5 it will give Output -6.
 * ------------------------------------------------------------------------------------------------------------------------------------------
 * Binary Left Shift (<<)
 * this operator shifts the bits to left.
 * Rule             a<<b(2)
 * Example          5<<2
 *                  5 = 000101
 * After operation: 010100 that is 20 
 * tip: a<<b = a*2(power b)
 * --------------------------------------
 * Binary Right Shift (>>)
 * This operator is Opposite of left Shift operator.
 */

public class BitManipulation {

    //Problem: check odd even without using +,-,*,/.
    static void checkOddEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) System.out.println("Even"); else System.out.println("Odd");
    }

    //Problem: check if a number is a Power of 2 or Not.
    static boolean checkPower(int n) {
        return (n & (n-1)) == 0;
    }

    //Problem: Fast Exponentiation (find n power of num.)
    static int findPower(int num, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= num;
            }
            num *= num;
            n = n >> 1;
        }
        return ans;
    }

    //Problem: Swap two numbers using bit manipulation.
    static void swap(int n, int num) {
        // n = 8 == (1000) in binary and num = 2 == (0010) in binary.
        n = n ^ num;            // 1000 ^ 0010 = 1010
        num = n ^ num;          // 1010 ^ 0010 = 1000
        n = n ^ num;            // 1010 ^ 1000 = 0010
        System.out.println(n + " "+ num);
    }

    //Problem: Convert Uppercase to Lowercase using bit manipulation.
    static void convertChar() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char) (ch | ' ')+" ");
        }
    }
    public static void main(String[] args) {
        int n = 8, num = 2;
        checkOddEven(n);
        System.out.println(checkPower(n));
        System.out.println(findPower(num, n));
        System.out.println(n^n);
        System.out.println(-~n);
        swap(n, num);
        convertChar();
        System.out.println(~5);
    }
}
