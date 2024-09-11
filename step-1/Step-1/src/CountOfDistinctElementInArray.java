import java.util.ArrayList;
import java.util.Arrays;

public class CountOfDistinctElementInArray {
    public static void main(String[] args) {
        int[]  arr = { 1,2,3,4,5,3,3,2,10};
        int[] traverse = new int [50];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(traverse[arr[i]] == 0){
                count++;
                traverse[arr[i]] = 1;
            }
        }
        System.out.println("The total numbers of distinct elements are:" +count);
        System.out.print("The distinct elements are: ");
        for (int i = 0; i < traverse.length; i++) {
            if(traverse[i] != 0){
                System.out.print(i + " ,");
            }
        }
    }
}