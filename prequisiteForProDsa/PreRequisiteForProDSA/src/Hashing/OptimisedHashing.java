package Hashing;

import java.util.HashMap;

public class OptimisedHashing {
    public static void main(String[] args) {
        int[] arr = {2,3,3,5,2,4,4,4,4,4,4,4,4,5,5,5,5};
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            hash.put(x, hash.getOrDefault(x, 0) + 1);
        }
        System.out.println(hash);

        int queries[] = {3,4,6};
        for (int i = 0; i < queries.length; i++) {
            int x = queries[i];
            System.out.println(hash.getOrDefault(x, 0));
        }
    }
}
