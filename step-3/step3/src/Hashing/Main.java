package Hashing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,3,3,4,1,4,4,4,4};
        int n = arr.length;
        int [] b = new int[arr.length];
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            b[x] = b[x] + 1;
        }
        for (int i = 0; i < n; i++) {
            if(b[i] != 0)
               System.out.println(i+ "->" +b[i]);
        }
    }
}
