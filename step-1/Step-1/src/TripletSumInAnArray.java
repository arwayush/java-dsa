public class TripletSumInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4, 54, 58, 2,11};
        System.out.println(TripletSumOfArray(arr));
        System.out.println(MaxTripletSum(arr));
    }

    private static int MaxTripletSum(int[] arr) {
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    int tempSum = arr[i] + arr[k] + arr[j];
                    if(tempSum > maxSum){
                        maxSum = tempSum;
                    }
                }
            }

        }
        return  maxSum;
    }

    private static int TripletSumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    sum = arr[i] + arr[k] + arr[j];
                }
            }

        }
        return  sum;
    }
}
