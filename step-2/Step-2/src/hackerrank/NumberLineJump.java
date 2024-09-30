//https://www.hackerrank.com/challenges/kangaroo/problem

package hackerrank;

public class NumberLineJump {
    public static void main(String[] args) {
        //x1 = position of kangaroo
        //v1 = v1 meters per second of jump
        //x2 = position of 2nd karngaroo
        //v2 = v2 meters per scond of jump
        int x1, x2, v1, v2;
        x1 = 0;
        x2 =4;
        v1 = 3;
        v2 = 2;


        //edge case
        if(v1 == v2 || v1<v2){
            System.out.println("NO");
        }

        //main logic
        if((x2-x1)%(v2-v1) == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }



    }
}
