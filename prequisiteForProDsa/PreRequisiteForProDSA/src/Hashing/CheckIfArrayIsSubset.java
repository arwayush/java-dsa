package Hashing;

import java.util.HashMap;

public class CheckIfArrayIsSubset {
    public static void main(String[] args) {
        int[] arr1 = {2,4,7,1,5};
        int[] arr2 = {5,4,7};

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int elem = arr1[i];
            hash.put(elem, hash.getOrDefault(elem, 0) + 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            if (!hash.containsKey(num)) {
                System.out.println("It is not Subset");
                return;
            }
        }
        System.out.println("Subset");
    }
}
