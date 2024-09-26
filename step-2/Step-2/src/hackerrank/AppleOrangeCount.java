package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleOrangeCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t=in.nextInt();
        int a=in.nextInt();
        int b=in.nextInt();
        int d1=in.nextInt();
        int d2=in.nextInt();


        ArrayList<Integer> apples = new ArrayList<Integer>();
        ArrayList<Integer> oranges = new ArrayList<Integer>();
        for (int i = 0; i < d1; i++) {
            int val = in.nextInt();
            apples.add(val);
        }
        for(int i=0;i<d2;i++){
            int value=in.nextInt();
            oranges.add(value);
        }

        int apple_count=0;
        int orange_count=0;
        for(int i=0;i<apples.size();i++){
            int dist=a+apples.get(i);
            if(dist>=s && dist<=t){
                apple_count++;
            }
        }
        for(int i=0;i<oranges.size();i++){
            int dist=b+oranges.get(i);
            if(dist>=s && dist<=t){
                orange_count++;
            }
        }
        System.out.println(apple_count);
        System.out.println(orange_count);


    }
}
