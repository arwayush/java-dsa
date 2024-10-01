//https://www.hackerrank.com/challenges/sherlock-and-array/problem
package hackerrank;
import  java.util.*;
public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }

        int total_sum=0;
        for(int i=0;i<arr.size();i++){
            total_sum+=arr.get(i);
        }
        boolean flag=false;
        int curr_sum=0;
        for(int i=0;i<arr.size();i++){
            curr_sum+=arr.get(i);
            if(curr_sum==total_sum){
                flag=true;
                break;
            }
            total_sum-=arr.get(i);
        }
        if(flag==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
