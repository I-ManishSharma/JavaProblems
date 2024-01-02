/*
 * Problem: 69. Sqrt(x)
 */
public class Leetcode_Problem_69 {

    static int mySqrt(int x) {
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (mid > x / mid)
                end = mid - 1;
            else if (mid < x / mid)
                start = mid + 1;
            else
                return mid;
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
