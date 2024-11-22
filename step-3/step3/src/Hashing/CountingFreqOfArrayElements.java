package Hashing;

import java.util.*;

import static java.util.Objects.hash;

public class CountingFreqOfArrayElements {

    //runs in O(n^2)
    private static void bruteForce(int[] arr){
        int n = arr.length;
        boolean vis[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(vis[i] == true)
                continue;
            int count = 1;
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    vis[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " --> " + count);
        }
    }

    private static void hash(int[] arr){
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

    }


    private static void binary(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int first =Arrays.binarySearch(arr, arr[i]);
            int last = Arrays.binarySearch(arr, arr[i]);

            while( first > 0 && arr[first - 1] == arr[i]){
                first--;
            }
            while(last < n-1 && arr[last + 1] == arr[i]){
                last++;
            }
            i = last;
            int freq = last - first + 1;
            System.out.println(arr[i]+ " --> " +freq);
         }

    }

    public static void main(String[] args) {
        int[]  arr = {10, 20, 20, 10, 10, 20, 5, 20};
        //Brute force to calculate the frequency of array T.C. O(n^2)
        bruteForce(arr);
        //using hashmap, T.C. O(n)
        hash(arr);
        //space optimization, using B.S.
        binary(arr);

    }
}
