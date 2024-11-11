package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class MinSuProduct {
    private static long minSumProduct(Integer[] a, Integer[] b){
        int n = a.length;
        //sorting the array in the ascending order
        Arrays.sort(a);
        //sorting the array in the descending order
        Arrays.sort(b, Collections.reverseOrder());
        //initializing the variable
        long minProductSum = 0;
        for (int i = 0; i < n; i++) {
            minProductSum += a[i] * b[i];
        }
        return minProductSum;
    }


    private  static  long maxSumProduct(Integer[] a, Integer[] b){
        int n = a.length;
        Arrays.sort(a);
        Arrays.sort(b);
        long maxSumProduct = 0;
        for (int i = 0; i < n; i++) {
            maxSumProduct += a[i] * b[i];
        }
        return maxSumProduct;
    }
    public static void main(String[] args) {
        Integer[] a = {1,3, -5};
        Integer[] b = {-2, 4, 1};
        long result = minSumProduct(a,b);
        System.out.println(result);
        long res2 = maxSumProduct(a,b);
        System.out.println(res2);
    }
}
