//By creating a hashing array, the size of the hashing array will be the [max_arr_element + 1]


package hackerrank;

import java.util.Arrays;

public class OptimizedHashing {
    public static void main(String[] args) {
        int[] arr = { 5,5,8,1};
        int[] hash =  new int[9];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] =  hash[arr[i]] + 1;
        }
        System.out.println(Arrays.toString(hash));
    }
}
//Cons :-  When the numbers will be big there will be problem in creating such a big hashing array
//T.C :- O(N+Q)
//Space Complexity :- Not good becaue it takes too much space