public class FirstAndLastIndexOfTargetInASortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,6,7,7,7,7,7,8,0};
        int target = 7;
        int firstIndex = -1;
        int lastIndex = -1;
        //for first index
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                firstIndex = i;
                break;
            }
        }

        //for last index
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == target){
                lastIndex = i;
                break;
            }
        }

        System.out.println("The first and last index of the target element are "  +firstIndex+ " and " +lastIndex+ " respectively ");

    }
}
