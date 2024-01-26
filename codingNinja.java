import java.util.ArrayList;
import java.util.Scanner;

/**
 * codingNinja Moderate Problem date: 26-01-2024: input- arr = 10 5 6 7 9 , int n = 5, int k = 2.
 */
public class codingNinja {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter "+n+ " the elements of Arraylist: ");
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            arr.add(input);
        }
        int ans = 0;
		int start = 0;
		int end = n-1;
		while (k > 0) {
			if(arr.get(start) > arr.get(end)) {
				ans += arr.get(start);
				start++;
			} else {
				ans += arr.get(end);
				end--;
			}
			k--;
		}
        System.out.println(ans);
        sc.close();
    }
}