package Hashing;

import java.util.HashSet;

public class CheckIfArrayIsSubset {

    //brute force approach with the T.C. -> O(n*m)
    private  static  boolean Brute(int[] arr1, int[] arr2){
        for (int i = 0; i < arr2.length; i++) {
            int x = arr2[i];
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if(x == arr1[j]){
                    found = true;
                    break;
                }
            }

            if(!found)
                return false;
        }
        return true;
    }


    //hashing approach with the T.C. -> O(n+m)
    private static  boolean hashing(int[] arr1, int[] arr2){
        HashSet <Integer> st = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            st.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(!st.contains(arr2[i])){
                return false;
            }
        }
        return  true;
    }



    public static void main(String[] args) {
        int[] arr1 = {9,3,1,5};
        int[] arr2 = {9, 3};
        System.out.println("Array is subset : " + Brute(arr1, arr2));
        System.out.println("Array is subset : " + hashing(arr1, arr2));

    }
}
