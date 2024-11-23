package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MinOpsToMakeElementsEqual {

    //takes the T.C of O(n^2)
    private  static  int brute(int[] arr){
        //we will make all the elements equal to those element whose frequency is maximum
        int n = arr.length;
        int maxfreq = 0;
        int currfreq;
        for (int i = 0; i < n; i++) {
            currfreq = 1;
            for (int j = 0; j < n; j++) {
                if( i== j) continue; //skip the number becoz the number is already taken
                if(arr[j] ==  arr[i]){
                    currfreq++;
                }
            }

            if(currfreq > maxfreq){
                maxfreq = currfreq;
            }
        }
        return  n - maxfreq;
    }

    // Optimized approach
    private  static  int hashing(int [] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int size = arr.length;
        for (int n : arr) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        //running a loop to check the max frequency
        int currFreq;
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> entry :  mp.entrySet()){
            currFreq = entry.getValue();
            if(currFreq > maxFreq){
                maxFreq = currFreq;
            }
        }
        return  size-maxFreq;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(brute(arr));   //O(n^2)
        System.out.println(hashing(arr)); // O(n)
    }
}
