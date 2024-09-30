//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true

package hackerrank;
import java.util.Scanner;
public class BeautifulDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s=in.nextInt();
        int e=in.nextInt();
        int k=in.nextInt();

        int count=0;
        for(int i=s;i<=e;i++){
            int num=i;
            int rev=0;
            while(num!=0){
                int rem=num%10;
                rev=rev*10+rem;
                num=num/10;
            }
            int diff= Math.abs(i-rev);
            if(diff%k==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
