package Hashing;

import java.util.Arrays;

public class SlighlyBetterHashing {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 1, 4, 4, 4, 4};
        int n = arr.length;


        int[] hash = new int[n];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        System.out.println(Arrays.toString(hash));
    }
}


//It is slightly better as in this there we create an array of size the biggest number in the array
//T.C. -> O(N+Q)