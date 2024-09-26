package hackerrank;

import java.util.ArrayList;

public class AVeryBigSum {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new  ArrayList<>();
        ar.add(1000000001);
        ar.add(1000000002);
        ar.add(1000000003);
        ar.add(1000000004);
        ar.add(1000000005);

        long count =  BigSum(ar);
        System.out.println(count);
    }
    private  static  long BigSum(ArrayList<Integer>ar){
        long count = 0;
        for (int i = 0; i < ar.size(); i++) {
            count += ar.get(i);
        }
        return count;

    }
}
