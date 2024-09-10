public class MaxPairSumFrom2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3, 4,6,6,90,65,5,4};
        int[] arr2 = {4,5,6};

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int tempSum = arr1[i] + arr2[j];
                if(tempSum > sum){
                    sum = tempSum;
                }
            }
        }
        System.out.println("The maximum sum from the 2 pairs of arrays is: "+sum);
    }
}
