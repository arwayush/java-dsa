//https://www.hackerrank.com/challenges/permutation-equation/problem

package hackerrank;
import java.io.*;
import java.util.*;
public class SequenceEquation {
    public static void main(String[] args) {
        ArrayList <Integer> p = new ArrayList<>();
        p.add(4);
        p.add(3);
        p.add(5);
        p.add(1);
        p.add(2);
            // Write your code here
            int n = p.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <=n ; i++) {
                list.add(p.indexOf(i) + 1);
            }

            //list = [4,5,2,1,3];
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list2.add(p.indexOf(list.get(i))+1);
            }
            //list2 = [1,3,5,4,2]
        System.out.println(list2);;



    }
}
