//https://www.hackerrank.com/challenges/mark-and-toys/problem?isFullScreen=true

package hackerrank;
import java.util.*;
public class MarkAndToys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int b=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }
        Collections.sort(arr);
        int sum=0;
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(sum+arr.get(i)<=b){
                sum+=arr.get(i);
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
