//https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true

package hackerrank;
import java.util.Scanner;
import java.util.ArrayList;

public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b=in.nextInt();
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<Integer>keyboard=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int value=in.nextInt();
            keyboard.add(value);
        }
        ArrayList<Integer>usb=new ArrayList<Integer>();
        for(int i=0;i<m;i++){
            int value=in.nextInt();
            usb.add(value);
        }

        int mx=-1;
        for(int i=0;i<keyboard.size();i++){
            for(int j=0;j<usb.size();j++){
                int pair=keyboard.get(i)+usb.get(j);
                if(pair<=b){
                    mx=Math.max(mx,pair);
                }
            }
        }
        System.out.println(mx);
    }
}
