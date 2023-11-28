package mit.palindromepairs;

import java.util.HashMap;

public class palindrome {
   
    public static int countPalindromePairs(String[] strings) {
        int count = 0;

        // Create a map to store the reversed form of each string
        HashMap<String, Integer> reverseMap = new HashMap<>();

        // Populate the reverseMap with the reversed form of each string
        for (int i = 0; i < strings.length; i++) {
            String original = strings[i];
            String reversed = new StringBuilder(original).reverse().toString();
            reverseMap.put(reversed, i);
        }

        // Iterate through the array of strings
        for (int i = 0; i < strings.length; i++) {
            String current = strings[i];

            // Check for possible palindromes by concatenating with other strings
            for (int j = 0; j < strings.length; j++) {
                if (i != j) {
                    String concatenated = current + strings[j];

                    // Check if the concatenated string can be rearranged as a palindrome
                    if (isPalindrome(concatenated)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    // Helper method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String args[]){
        String[] input1 = {"ab", "bb", "dd"};
        int output1 = countPalindromePairs(input1);
        System.out.println(output1);
    }
    
}
