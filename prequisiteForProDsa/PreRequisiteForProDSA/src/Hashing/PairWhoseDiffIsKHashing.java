package Hashing;

import java.util.HashMap;

public class PairWhoseDiffIsKHashing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,0, 44, 2, 8, 5, 8};
        int n = arr.length;
        int k = 3;
        int cnt = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int reqElem = arr[i] + k;
            if(mp.containsKey(reqElem)){
                cnt++;
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) +1);
        }
        System.out.println(cnt);
    }
}


//T.C. in this case is the O(n)

