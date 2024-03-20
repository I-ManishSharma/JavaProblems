public class PalindromeNumber {
    static void isPalindrome (int num) {
        int check = 0, i = num;
        while (i > 0) {
            int temp = i % 10;
            check = (check * 10) + temp;
            i /= 10; 
        }
        if (check == num) System.out.println(num + " num is palindrome"); else System.out.println(num + " is not Palindrome");
    }
    public static void main(String[] args) {
        int num = 212;
        isPalindrome(num);
    }    
}