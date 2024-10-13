package Hashing;

public class PairwhoseDiffIsK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,0, 44, 2, 8, 5, 8};
        int n = arr.length;
        int k = 3;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] - arr[j] == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
