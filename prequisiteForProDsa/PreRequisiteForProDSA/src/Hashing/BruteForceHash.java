package Hashing;

import java.util.Scanner;

public class BruteForceHash {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 1, 4, 4, 4, 4};
        int n = arr.length;


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            int qry = sc.nextInt();
            int freq = 0;

            for (int j = 0; j < n; j++) {
                if(arr[j] == qry){
                    freq++;
                }
            }

            System.out.println(freq);
        }


    }
}



//The T.C. for this code will be O(n^2);