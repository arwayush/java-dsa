package Hashing;

import java.util.HashMap;

public class NumberOfSubarraysWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(Brute1(arr, k));
        System.out.println(Brute2(arr, k));
        System.out.println(optimized(arr, k));
    }

    private  static  int optimized(int[] arr, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int cnt = 0;
       mp.put(0, 1);

       for(int num: arr){
           sum +=  num;

           if(mp.containsKey(sum - k)){
               cnt += mp.get(sum - k);
           }

           mp.put(sum, mp.getOrDefault(sum , 0) + 1 );
       }
       return cnt;
    }

    private  static int Brute1(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j <arr.length ; j++) {
                sum = sum + arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return  count;
    }
    
    
    private  static  int Brute2(int[] arr, int k ){
        int n = arr.length;
        int count = 0;
        int[] prefixsum = new int [n + 1];
        for (int i = 1; i <=n; i++) {
            prefixsum[i] = prefixsum[i-1] + arr[i-1];
        }

        for (int j = 1; j <= n; j++) {
            for (int i = 0; i < j; i++) {  // Iterate over all possible starting points
                if (prefixsum[i] == prefixsum[j] - k) {
                    count++;
                }
            }
        }
        return count;
    }
}
