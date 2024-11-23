package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class PairWhoseSumIsX {

    //Code with the time complexity T.C. O(n^2)
    private  static boolean brute(int[] arr, int x){
        int n =  arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return  false;
    }


    //this takes the O(n) time complexity & O(n) space complexity for storing the hashset
    private  static  boolean hashing(int[] arr, int x){

        HashSet<Integer> hset =  new HashSet<>();
        for(int val : arr){
            int temp = x - val;
            if(hset.contains(temp)){
                return true;
            }
            hset.add(val);
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int x = 0;
        System.out.println(brute(arr, x));
        System.out.println(hashing(arr, x));
    }
}
