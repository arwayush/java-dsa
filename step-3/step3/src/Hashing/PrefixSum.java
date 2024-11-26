package Hashing;

public class PrefixSum {


    //this code will take O(N*q)
    private static void brute(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        System.out.println("Brute force sum is: " + sum);
    }


    //Creating the prefix array will take O(n)
    private static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixArr = new int[n + 1];
        prefixArr[0] = 0; // Initialize the first element to 0 for easier calculations
        for (int i = 1; i <= n; i++) {
            prefixArr[i] = prefixArr[i - 1] + arr[i - 1]; // Use `i-1` to index into `arr`
        }
        return prefixArr;
    }


    //for traversing the queries it will take O(q)
    static int optimisedSum(int[] prefix, int l, int r) {
        return prefix[r + 1] - prefix[l]; // Adjusted for 0-based indexing
    }

    public static void main(String[] args) {
        // We will try to find the prefix sum in the range from l----r, using prefix sum
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int l = 2, r = 7; // 0-based indices for the range
        brute(arr, l, r);

        int[] prefix = prefixSum(arr);
        System.out.println("Optimized sum is: " + optimisedSum(prefix, l, r));
    }
}
