package Hashing;

public class DuplicateElementWithinDistanceK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4};
        int k = 3;
        int n = arr.length;
        System.out.println(check(arr, n, k));
    }

    private  static  boolean check (int[] arr, int n, int k){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <i+k && j<n ; j++) {
                if(arr[i] ==  arr[j]){
                    if((j-i) <= k)
                        return true;
                }
            }
        }
        return false;
    }
}
