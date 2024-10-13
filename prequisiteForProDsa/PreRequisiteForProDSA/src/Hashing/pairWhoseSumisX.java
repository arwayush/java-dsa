package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class pairWhoseSumisX {
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int x = 0;
        int size = arr.length;

        if(pairSumBrute(arr, x, size)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }



        if(pairSumOptimized(arr, x, size)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    private  static  boolean pairSumBrute(int[] arr, int x, int size){
        for (int i = 0; i < size - 1; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[i] + arr[j] == x){
                    return true;
                }
            }
        }
        return false;
    }


    private  static  boolean pairSumOptimized(int[] arr, int x, int size){
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < size; i++) {
            int temp = x - arr[i];
            if(!st.contains(temp)){
                return true;
            }
            st.add(arr[i]);
        }
        return false;
    }
}
