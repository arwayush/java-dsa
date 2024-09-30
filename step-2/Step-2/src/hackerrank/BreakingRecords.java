//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

package hackerrank;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class BreakingRecords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }

        int mx=arr.get(0);
        int mn=arr.get(0);

        int mx_count=0;
        int mn_count=0;
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>mx){
                mx=arr.get(i);
                mx_count++;
            }else if(arr.get(i)<mn){
                mn=arr.get(i);
                mn_count++;
            }
        }
        System.out.println(mx_count);
        System.out.println(mn_count);
    }
}
