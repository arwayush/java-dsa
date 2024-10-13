package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MaxMinFreq {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 2, 3, 3, 3, 3}; // Input array
        int n = arr.length;

        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int num : arr) {
            hmap.put(num, hmap.getOrDefault(num, 0) + 1);  // Efficient frequency update
        }

        // Initialize variables for max/min frequency and corresponding elements
        int maxFreq = Integer.MIN_VALUE, maxElement = arr[0];
        int minFreq = Integer.MAX_VALUE, minElement = arr[0];

        // Iterate over the HashMap to find max and min frequency elements
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();

            // Find the element with the maximum frequency
            if (frequency > maxFreq) {
                maxFreq = frequency;
                maxElement = element;
            }

            // Find the element with the minimum frequency
            if (frequency < minFreq) {
                minFreq = frequency;
                minElement = element;
            }
        }

        // Output the results
        System.out.println("Element with maximum frequency: " + maxElement + " (Frequency: " + maxFreq + ")");
        System.out.println("Element with minimum frequency: " + minElement + " (Frequency: " + minFreq + ")");
    }
}
