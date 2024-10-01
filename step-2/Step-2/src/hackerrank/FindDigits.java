//https://www.hackerrank.com/challenges/find-digits/problem
package hackerrank;
import  java.util.ArrayList;
import  java.util.Scanner;
public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int num=n;

        int count=0;
        while(num!=0){
            int rem=num%10;
            if(rem!=0 && n%rem==0){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
