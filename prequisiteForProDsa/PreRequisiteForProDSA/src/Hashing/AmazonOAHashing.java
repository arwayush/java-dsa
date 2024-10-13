// Given an array find two subarrays of maximum sum which are not intersecting
// There must be 2 subarrays whose sum must be maximum

package Hashing;

import java.util.Map;
import java.util.Scanner;

public class AmazonOAHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        for (int i = 1; i <= n; i++) {
            nums[i] = sc.nextInt();
        }


        System.out.println(maxTwoOverlappingArrays(nums));
    }


    private  static  int maxTwoOverlappingArrays(int[] nums){
        int n = nums.length -1;
        if(n == 0) return 0;


        int[] prefixMaxSum = calculatePrefixMaxSum(nums);
        int[] suffixMaxSum = calculateSuffixMaxSum(nums);
        int[] maxPrefixSum = new int[n+2];

        maxPrefixSum[1] =  prefixMaxSum[n+2];
        for(int i = 2; i<=n; i++){
            maxPrefixSum[i] = Math.max(maxPrefixSum[i-1], prefixMaxSum[i]);
        }

        int[] maxSuffixSum = new int[n+2];
        maxSuffixSum[n] = suffixMaxSum[n];
        for (int i = n-1; i >=1 ; i--) {
            maxSuffixSum[i] = Math.max(maxSuffixSum[i+1], suffixMaxSum[i]);
        }


        int maxSum = 0;
        for (int i = 0; i <=n; i++) {
            maxSum = Math.max(maxSuffixSum[i+1], maxPrefixSum[i]);
        }
        return maxSum;

    }



    private  static  int[] calculatePrefixMaxSum(int[]  nums){
        int n = nums.length - 1;
        int[] prefixMaxSum = new int[n+1];
        int currentMAx = nums[1];
        prefixMaxSum[1] = nums[1];

        for (int i = 2 ; i <=n ; i++) {
            currentMAx = Math.max(0, Math.max(nums[i], currentMAx + nums[i]));
            prefixMaxSum[i] =  currentMAx;
        }
        return prefixMaxSum;
    }



    private  static  int[] calculateSuffixMaxSum(int[] nums){
        int n = nums.length - 1;
        int[] suffixMaxSum = new int[n + 1];
        int currentMax = nums[n];
        suffixMaxSum[n] = nums[n];

        for (int i = n - 1; i >= 1; i--) {
            currentMax = Math.max(0, Math.max(nums[i], currentMax + nums[i]));
            suffixMaxSum[i] = currentMax;
        }

        return suffixMaxSum;
    }
}
