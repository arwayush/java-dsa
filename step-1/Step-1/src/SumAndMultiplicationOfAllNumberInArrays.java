import java.util.Scanner;

public class SumAndMultiplicationOfAllNumberInArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        String sum = "sum";
        String product = "product";
        System.out.println(sumOfArrayElements(arr, sum));

    }



    private static int sumOfArrayElements(int[] arr, String operator) {

        if(operator == "sum") {
            int ans = 0;
            for (int idx = 0; idx < arr.length; idx++) {
                ans += arr[idx];
            }
            return  ans;
        }else if(operator == "product"){
            int ans = 1;
            for (int idx = 0; idx < arr.length; idx++) {
                ans *= arr[idx];
            }
            return  ans;
        }else{
            return -1;
        }

    }
}
