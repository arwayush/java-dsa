package hackerrank;

import java.util.ArrayList;

public class BetweenTwoSets {

    //function to check if it is a factor or not
    private static boolean checkFactor(ArrayList<Integer> a, ArrayList<Integer> b, int num){
        for(int val : a){
            if(num % val != 0){
                return false;
            }
        }


        for(int val : b){
            if(val % num != 0){
                return false;
            }
        }

        return true;
    }


    //main function
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(2);
        a.add(6);
        b.add(24);
        b.add(36);
        int count = 0;
        int start = a.get(a.size()-1);
        int end = b.get(b.size()-1);
        for(int i = start; i<=end; i++){
            if(checkFactor(a, b, i)){
                count++;
            }
        }
        System.out.println(count);
    }

}
