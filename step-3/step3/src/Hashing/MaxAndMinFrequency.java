package Hashing;
import java.util.HashMap;

public class MaxAndMinFrequency {

    //takes the time complexity of O(n^2)
    private  static  void brute(int[] arr){
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

    //takes the time complexity of O(n)
    private  static void optimized(int[] arr ){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        int minFreq = Integer.MAX_VALUE, minElement = Integer.MAX_VALUE, maxFreq = Integer.MIN_VALUE, maxElement = Integer.MIN_VALUE;
        for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) {
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
            if(entry.getValue() < minFreq){
                minFreq = entry.getValue();
                minElement = entry.getKey();
            }
        }
        System.out.println("MinFreq: " + minFreq + " and the element is " + minElement);
        System.out.println("MaxFreq: "  + maxFreq + " and element is " + maxElement);
}

    //main function
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 3};
        brute(arr);
        optimized(arr);

    }
}
