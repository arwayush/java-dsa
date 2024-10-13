package Hashing;

public class MinMaxFreqBrute {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4};
        int n = arr.length;

        int maxElement = 0, maxCount = 0, minElement = 0, minCount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }

            if (maxCount < cnt) {
                maxCount = cnt;
                maxElement = arr[i];
            }

            if (minCount > cnt) {
                minCount = cnt;
                minElement = arr[i];
            }
        }

        System.out.println("Max Element: " + maxElement + ", Max Count: " + maxCount);
        System.out.println("Min Element: " + minElement + ", Min Count: " + minCount);

    }
}



//T.C. of the given code is O(N^2)
