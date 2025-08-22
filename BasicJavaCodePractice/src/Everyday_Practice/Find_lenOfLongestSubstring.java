package Everyday_Practice;

import java.util.HashMap;

public class Find_lenOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        int length = lengthOfLongestSubstring(s);

        System.out.println("Length of the longest substring without repeating characters: " + length);
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // Move the start pointer to the right of the previous occurrence of the character
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the index of the current character
            charIndexMap.put(currentChar, end);

            // Update the maximum length if needed
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
