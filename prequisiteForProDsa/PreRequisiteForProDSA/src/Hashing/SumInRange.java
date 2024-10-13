package Hashing;

public class SumInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,4,89,86,5,3};
        int l = 2;
        int r = 5;
       int ans = Burte(arr, l , r);
        System.out.println(ans);
        int ans2 = Optimized(arr, l, r);
        System.out.println(ans2);


    }


    //This takes O(n+q)
    private  static  int Optimized(int[] arr, int l, int r){
        int n = arr.length;
        int[] prefix = new int[n + 1];

        // Initialize prefix sum array, starting from 1 for easier indexing
        prefix[0] = 0; // No element before 0, prefix sum starts with 0
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1]; // Adjust for 0-based indexing of arr
        }

        // Correct the indices to match the array indices
        int ans = prefix[r + 1] - prefix[l];
        return ans;
    }



    //This takes O(n*q)
    private static int Burte(int[] arr, int l, int r){
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
        //T.C. in this case will be -> T.C.=O(r−l+1)
    }
}

