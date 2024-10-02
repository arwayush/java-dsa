package Array;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        //arrays Class:- does the manipulations on the primitive array
        int arr[] = {3,4,5,6,7,4,23,54,32,12,3};
        Arrays.sort(arr); //sorts the array
        int ids = Arrays.binarySearch(arr, 5); //gives the index of an element by searching it by using the binary search
        System.out.println(ids);
        Arrays.fill(arr, 99); //fills all the index with the value of 99
        System.out.println(Arrays.toString(arr));



    }
}
