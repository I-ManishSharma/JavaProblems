public class Leetcode_Problem_28 {
    static int checkIndexOF(String str1, String str2) {
        int index = -1, s1 = str1.length(), s2 = str2.length(), j = 0;
        if (s1 < s2) {
            return index;
        }
        for (int i = 0; i < s1; i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                index = i;
                int n = i + s2 - 1;
                j++;
                for (int k = i+1; k <= n; k++) {
                    System.out.print(k+ " "+ j);
                    System.out.println();
                    if (str1.charAt(k) != str2.charAt(j)) {
                        index = -1;
                        j = 0;
                        break;
                    } else {
                        j++;
                    }
                }
            }
            if (index != -1) return index;
        }
        return index;
    }
    public static void main(String[] args) {
        String str1 = "mississippi";
        String str2 = "issipi";
        System.out.println(checkIndexOF(str1,str2));
    }
}
