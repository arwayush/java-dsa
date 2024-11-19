package DP;

public class PrefixSum {
    public static void main(String[] args) {
        int n = 5; // size of the array
        int[] a = {6, 7, 3, 2, 2};

        int[] dp = new int[n]; // dp array for prefix sums
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                dp[i] = a[i];
            } else {
                dp[i] = a[i] + dp[i - 1];
            }
        }

        int q = 4; // number of queries
        int[] w = {0, 3, 4, 2}; // query array
        for (int i = 0; i < q; i++) {
            int query = w[i];
            if (query < n) {
                System.out.println(dp[query]); // answering each query in O(1)
            } else {
                System.out.println("Query out of bounds"); // safety check
            }
        }
    }
}
