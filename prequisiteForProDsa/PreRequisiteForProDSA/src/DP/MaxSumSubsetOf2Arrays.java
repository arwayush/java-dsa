package DP;

import java.util.Scanner;

public class MaxSumSubsetOf2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int [] a = new int[n+1];
        int [] b = new int [n+1];
        int [] dp = new int [n+1];

        for (int i = 1; i <= n ; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i  <=n; i++) {
            b[i] = sc.nextInt();
        }
        dp[1] = Math.max(a[1], b[1]);
        dp[2] = Math.max(Math.max(a[2], b[2]), dp[1]);

        for (int i = 3; i <=n ; i++) {
            int x = dp[i-1];
            int y = b[i] + dp[i-2];
            int z = a[i] + dp[i-2];
            dp[i] = Math.max(x, Math.max(y,z));
        }


        System.out.println("Answer to this is: " +dp[n]);
    }
}
