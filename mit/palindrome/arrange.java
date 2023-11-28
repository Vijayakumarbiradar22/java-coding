package mit.palindrome;
import java.util.Map;
import java.util.HashMap;
public class arrange {
    public static void main(String args[]){
        String input = "711";
        
        if (isPalindrome(input)) {
            System.out.println("The input string is a palindrome.");
        } else {
            if (canRearrangeToPalindrome(input)) {
                System.out.println("It can be arranged as a palindrome.");
            } else {
                System.out.println("It cannot be arranged as a palindrome.");
            }
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean canRearrangeToPalindrome(String str) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;

        for (int count : charFrequency.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // If there is at most one character with an odd frequency, it can be rearranged into a palindrome
        return oddCount <= 1;
    }
    
}
