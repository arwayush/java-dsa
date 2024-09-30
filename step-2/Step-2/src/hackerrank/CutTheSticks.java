//https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

package hackerrank;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }

        int totalstick=n;
        int curr=arr.get(0);
        int curr_count=0;
        System.out.println(totalstick);

        Collections.sort(arr);

        for(int i=0;i<arr.size();i++){
            if(curr==arr.get(i)){
                curr_count++;
            }else{
                totalstick-=curr_count;
                curr=arr.get(i);
                curr_count=1;
                System.out.println(totalstick);
            }
        }
    }
}

