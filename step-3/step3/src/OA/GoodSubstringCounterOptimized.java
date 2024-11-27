package OA;

import java.util.HashMap;

public class GoodSubstringCounterOptimized {

    public static int countGoodSubstrings(String s, String t) {
        // Frequency map for string t
        HashMap<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        // Frequency map for the current window in s
        HashMap<Character, Integer> windowFreq = new HashMap<>();
        int matchCount = 0;  // Tracks the number of characters meeting tFreq
        int count = 0;      // Tracks the total number of good substrings
        int left = 0;       // Left pointer of the sliding window

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            windowFreq.put(rightChar, windowFreq.getOrDefault(rightChar, 0) + 1);

            // Check if the rightChar satisfies the frequency requirement in tFreq
            if (tFreq.containsKey(rightChar) &&
                    windowFreq.get(rightChar).equals(tFreq.get(rightChar))) {
                matchCount++;
            }

            // Shrink the window if all characters in tFreq are satisfied
            while (matchCount == tFreq.size()) {
                count += s.length() - right;  // All substrings starting here are good
                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

                // Check if removing leftChar breaks the condition
                if (tFreq.containsKey(leftChar) &&
                        windowFreq.get(leftChar) < tFreq.get(leftChar)) {
                    matchCount--;
                }
                left++;  // Shrink the window
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "bacabc";
        String t = "abc";

        int result = countGoodSubstrings(s, t);
        System.out.println("Number of good substrings with the Optimized Code are : " + result);
    }
}
