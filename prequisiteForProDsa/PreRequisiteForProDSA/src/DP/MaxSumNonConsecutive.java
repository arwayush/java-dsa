package DP;


    public class MaxSumNonConsecutive {
        public static int maxSum(int[] a) {
            if (a.length == 0) return 0;
            if (a.length == 1) return a[0];

            int[] dp = new int[a.length];
            dp[0] = a[0];
            dp[1] = Math.max(a[0], a[1]);

            for (int i = 2; i < a.length; i++) {
                dp[i] = Math.max(a[i] + dp[i - 2], dp[i - 1]);
            }

            return dp[a.length - 1];
        }

        public static void main(String[] args) {
            int[] arr = {3, 2, 5, 10, 7};
            System.out.println("Maximum sum of non-consecutive elements: " + maxSum(arr));
        }
    }

