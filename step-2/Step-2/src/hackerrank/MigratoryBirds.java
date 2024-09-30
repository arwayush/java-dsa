package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            arr.add(val);
        }


        //Hashmap creation
        HashMap<Integer, Integer> mp =  new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            }else{
                mp.put(num, 1);
            }
        }

        int max = 0;
        int ans = 0;
        for(Integer key:mp.keySet()){
            int val = mp.get(key);
            if(val > max){
                max = val;
                ans = key;
            }
        }

        System.out.println("The final value is "+ans);
    }
}
