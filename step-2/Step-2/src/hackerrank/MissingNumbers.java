//https://www.hackerrank.com/challenges/missing-numbers/problem?isFullScreen=true


package hackerrank;
import java.util.*;
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<Integer>arr1=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr1.add(value);
        }
        ArrayList<Integer>arr2=new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            int value=in.nextInt();
            arr2.add(value);
        }
        Collections.sort(arr1);
        Collections.sort(arr2);

        HashMap<Integer,Integer>mp=new HashMap<>();

        for(int i=0;i<arr2.size();i++){
            if(mp.containsKey(arr2.get(i))){
                mp.put(arr2.get(i),mp.get(arr2.get(i))+1);
            }else{
                mp.put(arr2.get(i),1);
            }
        }
        for(int i=0;i<arr1.size();i++){
            if(mp.containsKey(arr1.get(i))){
                mp.put(arr1.get(i),mp.get(arr1.get(i))-1);
            }
        }
        mp.forEach((k,v)->{
            if(v==1){
                System.out.print(k+" ");
            }
        });
    }
}
