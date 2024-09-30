package hackerrank;
import java.util.Scanner;
import java.util.ArrayList;
public class DivisibleSumPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt();
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int value= in.nextInt();
            arr.add(value);
        }
        int count=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                int sum=arr.get(i)+arr.get(j);
                if(sum%k==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
