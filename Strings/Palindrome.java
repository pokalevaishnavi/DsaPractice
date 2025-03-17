import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        int n = str.length();

        for (int i = 0; i <= n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                System.out.println("Not Palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
                return true;
    }
    public static void main(String args[]) {
        String str = "non3on";
        isPalindrome(str);
    }
}
