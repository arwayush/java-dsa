package Hashing;

import java.util.HashMap;

public class DuplicateElementsWithDistanceK {

    //code with the brute force approach and T.C. O(k*n)
    private static  boolean brute(int[] arr, int k){
        int n = arr.length;
        for(int i=0; i<n ;i++)//outer loop
        {
            for(int j=i+1; j<=i+k&&j<n; j++)//inner loop
            {
                if(arr[i]==arr[j]){
                    if((j-i)<=k)return true;
                }
            }
        }
        return false;
    }


    //This code takes only the time complexity of T.C. O(n)
    private  static  boolean hashing(int[] arr, int k){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i], i);
            }else{
                if(i - mp.get(arr[i]) <= k){
                    return  true;
                }
                mp.put(arr[i], i);
            }
        }
        return  false;
    }



    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int k  = 3;
        System.out.println(brute(arr, k));
        System.out.println(hashing(arr, k));
    }
}
