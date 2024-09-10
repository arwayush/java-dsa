public class OddEvenTripletSum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8,9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i %2 ==0){
                for (int j = i+1; j < arr.length; j++) {
                    if(j%2 == 0){
                        for (int k = j+1; k < arr.length; k++) {
                            if(k%2 == 0){
                                sum = arr[i] + arr[j] + arr[k];
                            }
                        }
                    }
                }
            }

        }
        System.out.println(sum);
    }
}
