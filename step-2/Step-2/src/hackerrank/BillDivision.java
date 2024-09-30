//https://www.hackerrank.com/challenges/bon-appetit/problem

package hackerrank;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class BillDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int ind= in.nextInt();
        int b= in.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }

        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        sum=sum-arr.get(ind);
        sum=sum/2;
        if(b>sum){
            System.out.println(b-sum);
        }else{
            System.out.println("Bon Apetite");
        }
    }
}
