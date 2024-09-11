import java.util.Arrays;

public class ReverseNumbersSumBetweenRangeOfAnArray {
    public static void main(String[] args) {
        int[] arr = {2,4,55,65,65,34,22,887,54,67,96};
        System.out.println(Arrays.toString(arr));
        reverseBetweenRange(arr, 2,7);
        System.out.println(Arrays.toString(arr));
        System.out.println(SumBetweenRange(arr, 2, 7));
    }

    private static int SumBetweenRange(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static void reverseBetweenRange(int[] arr, int start, int end) {
        for (int i = start; i <end; i++) {
            int temp = arr[start];
           arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
