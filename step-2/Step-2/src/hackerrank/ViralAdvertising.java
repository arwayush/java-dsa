//https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true


package hackerrank;
import  java.util.Scanner;
public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int people= 5;
        int total_like=0;
        for(int i=1;i<=n;i++){
            int share= (people/2);
            total_like+=share;
            people= share*3;
        }
        System.out.println(total_like);
    }
}
