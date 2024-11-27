//26-November-2024
//Hashing, hashmap,
// Link to Code :- https://docs.google.com/document/d/1ikYR5XAGxezzaVPe9uU-UfprH5NXMIBP3bkR2C4D-_E/edit?tab=t.0

package OA;

import java.util.HashMap;

public class GoodSubstringCounter {

    // Function to check if sFreq satisfies the "good substring" condition
    private static boolean isGoodSubstring(HashMap<Character, Integer> sFreq, HashMap<Character, Integer> tFreq) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (tFreq.containsKey(c) && sFreq.getOrDefault(c, 0) < tFreq.get(c)) {
                return false;
            }
        }
        return true;
    }

    public static int countGoodSubstrings(String s, String t) {
        // Frequency map for string t
        HashMap<Character, Integer> tFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }

        int count = 0; // Counter for good substrings

        // Traverse all substrings of s
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> sFreq = new HashMap<>();
            for (int j = i; j < s.length(); j++) {
                // Update frequency of current character in the substring map
                char c = s.charAt(j);
                sFreq.put(c, sFreq.getOrDefault(c, 0) + 1);

                // Check if the current substring [i...j] is good
                if (isGoodSubstring(sFreq, tFreq)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "bacabc";
        String t = "abc";

        int result = countGoodSubstrings(s, t);
        System.out.println("Number of good substrings: " + result);
    }
}


//this is the code with the Time Complexity O(n^2)