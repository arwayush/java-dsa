package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CheckIfArrayIsSubsetDuplicates {
    public static void main(String[] args) {
        //Eg-1
        //arr1 = {2,4,7,1,5,5}
        //arr2 = {5,4,2}
        //Output: arr2 is a subset of arr1


        //Eg-2
        //arr1 = {9,3,1,5,2,1}
        //arr2 = {9,1,1,1}
        //Output: arr2 is not a subset of arr1
        int[] arr1 = {6,7,3,2,2};
        int[] arr2 = {6,7,2,2};
        boolean ans = isSubset(arr1, arr2);

        if(ans) System.out.println("arr2 is a subset");
         else System.out.println("arr2 is not a subset of arr1");

    }

    private static  boolean isSubset(int[] arr1, int [] arr2){
        //Condition-1 -> If the arr2 array has length greater than arr1
        // Than in this case it is not a sub array clearly

        if(arr1.length < arr2.length) return false;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i : arr1){
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for(int i : arr2){
            if(!mp.containsKey(i)) return false;
            if(mp.get(i) == 0) return false; //it means arr1 does not contains the element which is there in the arr, extra element
            int count = mp.get(i);
            mp.put(i, count -1);
        }
        return true;
    }
}
