public class SumOfAllPairsUsingSingleArray {
    public static void main(String[] args) {

        int size  =  7;
        int[] arr = {1,2,4,5,6,7,8};
        System.out.println(SumOfGivenPair(arr, 3, 5)); //when we want to find the sum with the 2 indexes
        System.out.println(SumOfPairsWithAll(arr)); // when we want to find the sum of  fix one and find the sum with all others

    }

    private static int SumOfPairsWithAll(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum += arr[i] + arr[j];
            }
        }
        return  sum;
    }

    private static int SumOfGivenPair(int[] arr, int i, int j) {
        int sum= 0;
        sum = arr[i] + arr[j];
        return sum;
    }
}
