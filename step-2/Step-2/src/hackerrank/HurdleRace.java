//https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true


package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HurdleRace {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            height.add(in.nextInt());
        }

        int k = 4;

        Collections.sort(height);
        int req_ht = height.get(height.size()-1);
        if(k > req_ht){
            System.out.println(0);
        }else{
            System.out.println(req_ht-k);
        }
    }
}