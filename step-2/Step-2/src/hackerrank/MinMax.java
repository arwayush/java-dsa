//Given the 5 integers find the minimum and maximum of 4 elements

package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>(5); //creating an arraylist of 5 elements
        Scanner ip =  new Scanner(System.in); //taking input
        for (int i = 0; i < 5; i++) {
            arr.add(ip.nextInt());
        }
        Collections.sort(arr); //sorting
        long min = 0, max = 0, sum = 0;
        for (int i = 0; i <=arr.size()-1; i++) {
            sum+=arr.get(i);
        }

        max = sum - arr.get(0);
        min = sum - arr.get(arr.size()-1);

        System.out.println(min+ "  " +max);
    }
}
