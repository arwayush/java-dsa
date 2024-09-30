//https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true

package hackerrank;
import java.util.Scanner;
import java.util.ArrayList;
public class AngryProfessor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int k=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr.add(value);
        }

        int count=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<=0){
                count++;
            }
        }
        if(count>=k){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
