package Hashing;
import java.util.*;

public class CheckIfArrayIsSubsetDuplicates {
    private  static  boolean hash(int[] arr1, int[] arr2){
        HashMap<Integer, Integer> mp = new HashMap<>();
        if(arr1.length < arr2.length){
            return false;
        }
        for (int i = 0; i <arr1.length ; i++) {
            mp.put(arr1[i], mp.getOrDefault(arr1[i], 0) + 1);
        }
        //running a loop on the array2 to find if the array elements are present in the hashmap or not
        for (int i = 0; i < arr2.length; i++) {
            //if element is not present in the map or array2
            if(!mp.containsKey(arr2[i])) return  false;
            if(mp.get(arr2[i]) == 0) return  false;
            mp.put(arr2[i], mp.get(arr2[i]) - 1);
        }
        return  true;
    }

    public static void main(String[] args) {
        int [] arr1 = {2,4,2,7,1,5,5};
        int[] arr2 = {5,4,2,2};
        System.out.println(hash(arr1, arr2));
    }
}
