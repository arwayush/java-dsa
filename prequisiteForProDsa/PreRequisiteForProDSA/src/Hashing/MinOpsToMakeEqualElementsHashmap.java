package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MinOpsToMakeEqualElementsHashmap {
    public static void main(String[] args) {
        int[] arr = {1,2,1,4,3,1, 7};
        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }else{
                mp.put(arr[i], 1);
            }
        }

        int maxfreq = 0;
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            int freq = entry.getValue();
            if(freq > maxfreq){
                maxfreq = freq;
            }
        }

        System.out.println(n- maxfreq);
    }
}
