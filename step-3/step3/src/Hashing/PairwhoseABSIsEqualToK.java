package Hashing;

import java.util.HashMap;

public class PairwhoseABSIsEqualToK {

    //Takes the T.C. of O(n^2)
    private static void brute(int[] arr, int k){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(Math.abs(arr[i] - arr[j]) == k){
                    System.out.println("1st Number is :" +arr[i]+ "   & 2nd Number is: " +arr[j]);
                    count++;
                }
            }
        }

        System.out.println("The count of such pairs are: " +count);
    }


    //Takes the T.C. of O(n)
    private static void hash(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(mp.containsKey(arr[i] - k)){
                count += mp.get(arr[i] - k);
            }
            if(k != 0 && mp.containsKey(arr[i] + k)){
                count += mp.get(arr[i] + k);
            }

            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("from the hashing function: " +count);

    }


    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 9, 2, -2, 12, 3};
        int k = 3;
        brute(arr, k);
        hash(arr, k);
    }
}
