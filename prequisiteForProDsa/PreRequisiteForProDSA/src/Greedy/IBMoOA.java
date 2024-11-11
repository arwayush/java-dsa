package Greedy;
import java.util.*;

public class IBMoOA {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] query = {5};


         // Brute force run two loops
        //Time complexity is O(n^2)

//        for (int i = 0; i < query.length; i++) {
//            int ans = 0;
//            int target = query[i];
//            for (int j = 0; j < arr.length; j++) {
//                ans += Math.abs(target - arr[j]);
//            }
//            System.out.println(ans);
//        }



        //optimized way
        int n = 5;
        ArrayList<Long> b = new ArrayList<>(Arrays.asList(-1000000000000000000L, 1L, 2L, 3L, 4L, 5L, 1000000000000000000L));
        long[] prefix = new long[n + 1]; // Prefix sum array

        long total_sum = 0;


        // Calculate prefix sums
        for (int i = 1; i <= n; i++) {
            total_sum += b.get(i);
            prefix[i] = b.get(i) + prefix[i - 1];
        }


        // Sort the array for binary search (sublist to maintain only relevant parts)
        Collections.sort(b.subList(1, n + 1));

        // Set the target value
        long target = 8;

        // Find the position for the target
        long g = lower(b, target);

        // Calculate left part and right part
        long left_part = target * g - prefix[(int) g];
        long right_part = (total_sum - prefix[(int) g]) - target * (n - g);

        // Output the total operations
        System.out.println(left_part + right_part);


    }


    private static long lower(ArrayList<Long> a1, long g) {
        int mg = Collections.binarySearch(a1, g);
        if (mg < 0) mg = -mg - 1; // Adjust for binary search returning negative values when element is not found
        return mg - 1;
    }

}
