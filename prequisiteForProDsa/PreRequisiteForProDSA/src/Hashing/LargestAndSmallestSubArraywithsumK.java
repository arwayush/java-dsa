package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestAndSmallestSubArraywithsumK {
    public static void main(String[] args) {
        int[] arr = { 3,1,3,-2,2};
        int sum = 4;
        int [] ans = Brute1(arr, sum);
        System.out.println(Arrays.toString(ans));
        int[] ans2 = Optimized(arr, sum);
        System.out.println(Arrays.toString(ans2));
    }

    private  static  int[]  Brute1(int[] arr, int sum){
           int maxLen = 0;
           int[] res = {-1, -1};
        for(int i = 0; i<arr.length; i++){
            int curSum  = 0;
            for (int j = i; j < arr.length; j++) {
                curSum += arr[i];
                if(curSum == sum && maxLen < (j-i+1)){
                    maxLen = j-i+1;
                    res[0] = i+1;
                    res[1] = j+1;
                }
            }
        }
        return  res;
    }


    private  static  int[] Optimized(int[] arr, int sum){
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);
        int currSum = 0;
        int maxLen = 0;
        int[] res = {-1, -1};

        for (int j = 0; j < arr.length; j++) {
            currSum += arr[j];


            if(mp.containsKey(currSum - sum)){
                int len = j - mp.get(currSum - sum);
                if(len > maxLen){
                    maxLen = len;
                    res[0] = mp.get(currSum - sum);
                    res[1] = j;
                }
            }

            if(!mp.containsKey(currSum)){
                mp.put(currSum, j);
            }
        }
        return  res;
    }
}
