//https://www.hackerrank.com/challenges/find-the-median/problem
package hackerrank;
import java.util.ArrayList;
import java.util.Collections;

public class FindTheMedian {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1 );
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(5);
        arr.add(3);

        Collections.sort(arr);
        int mid = arr.size() / 2;
        System.out.println( arr.get(mid));
    }

}
