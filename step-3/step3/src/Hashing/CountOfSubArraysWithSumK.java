package Hashing;

import java.util.HashMap;

public class CountOfSubArraysWithSumK {

    //This is the brute force code with the Time Complexity of O(n^2)
    private static void brute(int[] arr, int k){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println("The total subarrays with the sum as K are: " +count);
    }


    //Brute force approach using the prefix array also uses T.C. O(n^2)
    private static void brute2(int[] arr, int k) {
        int n = arr.length;
        int[] prefix = new int[n + 1];

        // Creation of the prefix array
        prefix[0] = 0; // Initialize prefix[0] to 0
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }

        int count = 0;

        // Iterate through all pairs (i, j) and check the subarray sum
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (prefix[i] - prefix[j] == k) {
                    count++;
                }
            }
        }

        System.out.println("From the Brute force 2 numbers of such subarrays are: " + count);
    }



    //This is the optimized code using hashmap and with the time complexity of O(n)
    private static void optimized(int[] arr, int k){
        int count = 0, sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        // Initialize the map with prefix sum 0 (important for subarrays starting at index 0)
        mp.put(0,1);
        for(int num : arr){
            sum += num;
            if(mp.containsKey(sum - k)){
                count += mp.get(sum - k);
            }
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }
        System.out.println("The total subarrays with the sum as K are: " +count);
    }



    public static void main(String[] args) {
        int[] arr = {4,2,6,5,7,3,2,1};
        int k = 6;
        brute(arr, k);
        brute2(arr, k);
        optimized(arr, k);
    }
}
