//https://www.hackerrank.com/challenges/drawing-book/problem


package hackerrank;
import java.util.Scanner;
public class DrawingBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();

        int totalflip= n/2;
        int targetflipFront=p/2;
        int targetflipBack=totalflip-targetflipFront;
        int ans= Math.min(targetflipFront,targetflipBack);
        System.out.println(ans);
    }
}
