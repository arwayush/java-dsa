package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner ip  = new Scanner(System.in);
        int size = ip.nextInt();
        ArrayList<Integer> grades = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            grades.add(ip.nextInt());
        }


        ArrayList<Integer> ans = new ArrayList<>(grades.size());
        for (int i = 0; i < grades.size(); i++) {
            int num = grades.get(i);
            if(num>=38 && num%5>=3){
                num=num+5-num%5;
            }
            ans.add(num);
        }
        System.out.print(ans);

    }
}
