//https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true
package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BirthDaycandles {
    public static void main(String[] args) {

        Scanner ip  = new Scanner(System.in);
        int size = ip.nextInt();
        ArrayList <Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(ip.nextInt());
        }

        Collections.sort(arr);
        int count = 0;
        int n = arr.get(arr.size()-1);
        for (int i = 0; i <arr.size(); i++) {
            if(n == arr.get(i)){
                count++;
            }
        }
        System.out.println("The numbers of candles can be blown are:" +count);
    }

}
