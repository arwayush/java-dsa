//https://www.hackerrank.com/challenges/closest-numbers/problem?isFullScreen=true

package hackerrank;
import java.util.*;
public class ClosestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }
        Collections.sort(arr);
        HashMap<Integer,Integer>mp=new HashMap<>();
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int diff=arr.get(i+1)-arr.get(i);
            mp.put(i,diff);
            min_diff=Math.min(min_diff,diff);
        }
        ArrayList<Integer>ans=new ArrayList<Integer>();
        for(Integer key:mp.keySet()){
            if(mp.get(key)==min_diff){
                ans.add(arr.get(key));
                ans.add(arr.get(key+1));
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
