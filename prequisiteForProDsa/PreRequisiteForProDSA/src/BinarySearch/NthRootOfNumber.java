package BinarySearch;

public class NthRootOfNumber {
    public static void main(String[] args) {
        int m = 64;
        int n = 3;
       int ans = BS(n, m);
        System.out.println(ans);
    }

    private  static int BS(int n, int m){
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = (low + high) / 2;
            if(Math.pow(mid, n) == m){
                return mid;
            } else if (Math.pow(mid, n) < m) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;

    }
}
