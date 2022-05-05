
public class Palindrome {
	private static boolean isPalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
        	i++;
            j--;
        }
        return true;
	}
}
