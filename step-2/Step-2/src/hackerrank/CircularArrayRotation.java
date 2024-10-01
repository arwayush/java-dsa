//
package hackerrank;
import java.util.ArrayList;
import java.util.Scanner;
public class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int q=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            arr[(i+k)%n]=value;
        }
        int query[]=new int[q];

        for(int i=0;i<q;i++){
            int value=in.nextInt();
            query[i]=value;
        }


        for(int i=0;i<q;i++){
            System.out.print(arr[query[i]]+" ");
        }
    }
}
