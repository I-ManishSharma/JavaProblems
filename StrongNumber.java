/*
 * Problem: Print nth Strong number along with all strong number b/w lower_limit and upper_limit.
 */
import java.util.ArrayList;

public class StrongNumber {

    // To find Factorial of a number.
    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // To check a number is a Strong number or not.
    static int isStrong(int n) {

        int sum = 0, i = n;

        while (i > 0) {
            int temp = i % 10;
            sum += factorial(temp);
            i /= 10;
        }

        if (sum == n)
            return n;
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);

        int ll = 1, ul = 1000000, nth = 3;

        int i = ll;
        while (i < ul) {
            int ans = isStrong(i);
            if (ans != -1)
                list.add(ans);
            i++;
        }

        System.out.println(nth + " Strong number b/w " + ll + "-" + ul + " is " + list.get(nth));

        list.remove(0);

        System.out.println("Strong number b/w " + ll + "-" + ul + " are " + list);
    }
}
