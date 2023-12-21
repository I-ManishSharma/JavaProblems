import java.util.Scanner;

public class StringReverce {

    static void reverceString(String str) {
        String str2 = "";
        for (int i = str.length()-1; i >= 0; i--) {
            str2 = str2+str.charAt(i);
        }
        System.out.print(str2+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        reverceString(str);
        sc.close();
    }
}
