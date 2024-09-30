//https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true

package hackerrank;
import java.util.Scanner;
public class DayOfTheProgrammer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year=in.nextInt();
        String date="";

        if(year<1918){
            date+=(year%4==0)?"12.09."+ year :"13.09."+year;
        }else if(year==1918){
            date+="26.09."+year;
        }else{
            date+=((year%400==0) || (year%4==0 && year%100!=0))?"12.09."+year :"13.09."+year;
        }
        System.out.println(date);
    }
}
