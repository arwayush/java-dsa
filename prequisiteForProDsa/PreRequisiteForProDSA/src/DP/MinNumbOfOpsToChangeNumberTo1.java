package DP;
import java.util.*;
public class MinNumbOfOpsToChangeNumberTo1 {
    public static int mini(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int solve(int x) {
        int[] dp = new int[x + 1];
        Arrays.fill(dp, 0);

        dp[1] = 0;
        dp[2] = 1;

        for (int i = 3; i <= x; i++) {
            if (i % 7 == 0) {
                dp[i] = mini(dp[i - 1] + 1, dp[i - 2] + 1, dp[i / 7] + 1);
            } else {
                dp[i] = Math.min(dp[i - 1] + 1, dp[i - 2] + 1);
            }
        }
        return dp[x];
    }


    public static void main(String[] args) {
        int x = 93;
        System.out.println("Minimum number of steps required to make the given number to 1: " + solve(x));
    }
}
