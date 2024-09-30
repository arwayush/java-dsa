//https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true

package hackerrank;
import java.io.*;
import java.util.*;
public class SalesByMatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value= in.nextInt();
            arr.add(value);
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int color=arr.get(i);
            if(mp.containsKey(color)){
                mp.put(color,mp.get(color)+1);
            }else{
                
                mp.put(color,1);
            }
        }

        int pair=0;
        for(Integer key:mp.keySet()){
            int value=mp.get(key);
            pair=pair+(value/2);
        }
        System.out.println(pair);
    }
}
