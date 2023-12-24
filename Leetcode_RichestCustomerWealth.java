public class Leetcode_RichestCustomerWealth {

    static int maximumWealth(int[][] accounts) {

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[][] accounts = { { 7, 1, 3 }, { 1, 9, 5 }, { 2, 8, 7 } };
        System.out.println(maximumWealth(accounts));
    }
}