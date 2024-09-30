//https://www.hackerrank.com/challenges/the-birthday-bar/problem

package hackerrank;
import java.io.*;
import java.util.*;
public class SubArrayDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        int m=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }

        int count=0;
        for(int i=0;i<arr.size();i++){
            int sum=0;
            int length_count=0;
            for(int j=i;j<j+m;j++){
                if(j>=n || sum>=d){
                    break;
                }
                sum+=arr.get(j);
                length_count++;
            }
            if(sum==d && length_count==m){
                count++;
            }
        }
        System.out.println(count);

    }
}
