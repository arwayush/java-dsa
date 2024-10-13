package Hashing;

import java.util.HashMap;

public class DuplicateElementwithinKDistanceHashing {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        if (checkDuplicatesWithinK(arr, n, 3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean checkDuplicatesWithinK(int[] arr, int n, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i <n; i++) {
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], i);
            }else{
                if(i - mp.get(arr[i])  <= k){
                    return true;
                }
                mp.put(arr[i], i);
            }
        }
        return false;
    }
}
