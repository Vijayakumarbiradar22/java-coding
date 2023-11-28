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

            // Check if the current string itself is a palindrome
            if (isPalindrome(current)) {
                count++;
            }

            // Check if there exists a reversed string in the array that, when concatenated,
            // forms a palindrome with the current string
            if (reverseMap.containsKey(current) && reverseMap.get(current) != i) {
                count++;
            }

            // Check for possible palindromes by concatenating with other strings
            for (int j = 1; j < current.length(); j++) {
                String left = current.substring(0, j);
                String right = current.substring(j);

                // Check if the reversed form of the right substring exists in the array
                if (reverseMap.containsKey(right) && isPalindrome(left)) {
                    count++;
                }

                // Check if the reversed form of the left substring exists in the array
                if (reverseMap.containsKey(left) && isPalindrome(right)) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String args[]){
        String[] input1 = {"ab", "bb", "dd"};
        int output1 = countPalindromePairs(input1);
        System.out.println(output1);
    }
    
}
