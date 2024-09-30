//https://www.hackerrank.com/challenges/counting-valleys/problem


package hackerrank;
import java.util.Scanner;
public class CountingValleys {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String v=in.nextLine();

        int level=0;
        int valley_count=0;
        for(int i=0;i<v.length();i++){
            if(v.charAt(i)=='U'){
                level++;
            }else if(v.charAt(i)=='D'){
                if(level==0){
                    valley_count++;
                }
                level--;
            }
        }
        System.out.println(valley_count);
    }
}
