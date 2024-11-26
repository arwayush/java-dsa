package Hashing;

import java.util.HashMap;

public class PairWhoseDiffIsX {

    //It takes the time complexity of O(n^2)
    private  static  void brute(int[]arr, int k){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] -  arr[j] == k){
                    count++;
                    System.out.print(true);
                }
            }
        }
        System.out.println();
        System.out.println("There are total: " + count + " pairs");
    }

    //It takes the time complexity of O(n)
    private  static  void  hash(int[] arr, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int target = arr[i]+k;
            if(mp.containsKey(target)){
                count += mp.get(target);
            }
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) +1);
        }
        System.out.println("The pairs with the difference k are: " +count);
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;
        brute(arr, k);
        hash(arr, k);
    }
}
