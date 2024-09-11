import java.util.Arrays;

public class FrequencyOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,66,7,7,8,9,99};
       int n = arr.length;

       boolean[] vis = new boolean[n];
       Arrays.fill(vis, false);


        for (int i = 0; i < n; i++) {
            if(vis[i] == false){
                vis[i] = true;
                int count = 1;
                for (int j = i+1; j < n; j++) {
                    if(arr[i] == arr[j]){
                        vis[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " --> " +count);
            }
        }
    }
}
