package Hashing;

public class MinOpsTomakeEqualelementsBruteForce {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = 4;
        int maxFreq = 0;
        int currFreq = 0;
        for (int i = 0; i < n; i++) {
            currFreq = 1;
            for (int j = 0; j < n; j++) {
                if(i == j) continue;;

                if(arr[i] == arr[j]){
                    currFreq++;
                }
            }

            if(currFreq > maxFreq){
                maxFreq = currFreq;
            }
        }
        System.out.println(n-maxFreq);
    }
}
