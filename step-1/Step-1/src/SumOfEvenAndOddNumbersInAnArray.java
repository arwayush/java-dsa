public class SumOfEvenAndOddNumbersInAnArray {
    public static void main(String[] args) {
        int[] arr = new int[] {4,5,7,9,7,4,3};
        System.out.println(sumOfNumbers(arr));
        System.out.println(sumOfEven(arr));
    }

    private static int sumOfEven(int[] arr) {
        int sumOfEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 == 0){
                sumOfEven += arr[i];
            }
        }
        return sumOfEven;
    }

    private static int sumOfNumbers(int[] arr) {
        int sumOfOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 != 0){
                sumOfOdd += arr[i];
            }
        }
        return sumOfOdd;
    }
}
